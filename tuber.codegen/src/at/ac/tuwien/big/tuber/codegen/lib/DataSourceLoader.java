package at.ac.tuwien.big.tuber.codegen.lib;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class DataSourceLoader {
    private Map<String, Queue<Message>> agentMessages;

    public DataSourceLoader (String filePath) {
        this.agentMessages = new HashMap<>();
        this.loadMessages(filePath);
    }
    
    public void printDataSource() {
    	for (String agentId: this.agentMessages.keySet()) {
    		Queue<Message> q = agentMessages.get(agentId);
    		for (Message element : q) {
                System.out.println(element);
            }
    	}
    }

    public Map<String, Queue<Message>> getAgentMessages() {
        return agentMessages;
    }

    // Load messages from JSON file
    public void loadMessages(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            JsonObject root = JsonParser.parseReader(reader).getAsJsonObject();
            
            for (String agentId : root.keySet()) {
                JsonArray messagesArray = root.getAsJsonArray(agentId);
                Queue<Message> messages = new LinkedList<>();

                for (var jsonElement : messagesArray) {
                    JsonObject messageObject = jsonElement.getAsJsonObject();
                    String type = messageObject.get("type").getAsString();
                    String userName = messageObject.get("user").getAsString();
                    String date = messageObject.get("date").getAsString();

                    if ("ride".equals(type)) {
                    	RideMessage rideMessage = parseRideMessage(messageObject, userName, date);
                    	messages.offer(rideMessage);
                    } else if ("supportCall".equals(type)) {
                    	SupportCallMessage supportCallMessage = parseSupportCallMessage(messageObject, userName, date);
                    	messages.offer(supportCallMessage);
                    }
                }
                agentMessages.put(agentId, messages);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private RideMessage parseRideMessage(JsonObject messageObject, String userName, String date) {
        String rideId = messageObject.get("rideId").getAsString();
        String rideType = messageObject.get("rideType").getAsString();
        String paymentType = messageObject.get("paymentType").getAsString();
        boolean sharing = messageObject.get("sharing").getAsBoolean();
        JsonObject targetObj = messageObject.get("target").getAsJsonObject();
        Location target = new Location(targetObj.get("x").getAsInt(), targetObj.get("y").getAsInt());
        return new RideMessage(userName, date, rideId, rideType, paymentType, sharing, target);
    }
    
    private SupportCallMessage parseSupportCallMessage(JsonObject messageObject, String userName, String date) {
        String rideId = messageObject.has("rideId") ? messageObject.get("rideId").getAsString() : null;
        String issueText = messageObject.get("issueText").getAsString();
        return new SupportCallMessage(rideId, userName, date, issueText);
    }
}
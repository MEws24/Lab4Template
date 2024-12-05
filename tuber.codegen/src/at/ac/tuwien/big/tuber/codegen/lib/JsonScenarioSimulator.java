package at.ac.tuwien.big.tuber.codegen.lib;

import java.io.IOException;
import java.util.Map;
import java.util.Queue;

public class JsonScenarioSimulator {
	
	public void setUpDataLoaders(TuberRunner runner, String filePath) throws IOException {
		DataSourceLoader loader = new DataSourceLoader(filePath);		
		runner.setUp(loader.getAgentMessages());
	}
	
	public void simulate(TuberRunner runner, String filePath) {
		try {
			setUpDataLoaders(runner, filePath);
			while(runner.hasStep()) runner.step();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void simulateStepwise(TuberRunner runner, String filePath) {
		try {
			setUpDataLoaders(runner, filePath);
			byte[] buffer = new byte[256];
			int steps = 0;
			
			while (runner.hasStep()) {
				System.out.println(Util.ANSI_GREEN + "Hit <enter> to simulate the next step.");
				System.out.println("Type in a <number> to simulate a number of steps.");
				System.out.println("Type in <run> to simulate the remaining scenario.");
				System.out.println("Type in <exit> to stop the simulation." + Util.ANSI_RESET);
				System.in.read(buffer);
				steps = 1;
				String cmd = new String(buffer).trim().toLowerCase();
				if ("exit".equals(cmd)) {
					return;
				} else if ("run".equals(cmd)) {
					steps = -1;
				} else {
					try {
						steps = Integer.parseInt(cmd);
					} catch (NumberFormatException e) {
						// nothing
					}
				}
				
				if (steps != -1) {
					while (runner.hasStep()) {
						runner.step();
					}
				} else {
					while (steps > 0 && runner.hasStep()) {
						runner.step();
						steps--;
					}
				}
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int getLargestMessagesListLength(Map<String, Queue<Message>> agentMessages) {
	    int maxLength = 0;
	    for (Queue<Message> messages : agentMessages.values()) {
	        if (messages.size() > maxLength) {
	            maxLength = messages.size();
	        }
	    }
	    return maxLength;
	}
	
}

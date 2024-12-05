package at.ac.tuwien.big.tuber.codegen.lib;

import java.util.Map;
import java.util.Queue;

public interface TuberRunner {
	public void setUp(Map<String, Queue<Message>> agentMessages);
	public void step();
	public boolean hasStep();
}

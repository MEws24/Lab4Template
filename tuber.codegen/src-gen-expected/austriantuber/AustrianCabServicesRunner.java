package austriantuber;

import java.util.Map;
import java.util.Queue;
import at.ac.tuwien.big.tuber.codegen.lib.TuberRunner;
import at.ac.tuwien.big.tuber.codegen.lib.Util;
import at.ac.tuwien.big.tuber.codegen.lib.Message;

import austriantuber.agents.ViennaCabsManager;
import austriantuber.agents.LinzCabsManager;

public class AustrianCabServicesRunner implements TuberRunner {				
	private int stepCount = 0;
	private ViennaCabsManager viennaCabsManager;
	private LinzCabsManager linzCabsManager;
	
	@Override
	public void setUp(Map<String, Queue<Message>> agentMessages) {
		System.out.println(Util.ANSI_BOLD + "=================================================================================" + Util.ANSI_RESET);
		System.out.println(Util.ANSI_BOLD + "=------------------------------------ Setup ------------------------------------=" + Util.ANSI_RESET);
		System.out.println(Util.ANSI_BOLD + "=================================================================================\n" + Util.ANSI_RESET);
		
		// Setup Project:
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Setting up Agent...");
		System.out.println("---------------------------------------------------------------------------------");
		viennaCabsManager = new ViennaCabsManager(agentMessages.get("Vienna Cabs Manager"));
		viennaCabsManager.setUp();
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println(Util.ANSI_BOLD + "[✓] Created Agent: " + viennaCabsManager.toString() + Util.ANSI_RESET);
		System.out.println("---------------------------------------------------------------------------------\n");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Setting up Agent...");
		System.out.println("---------------------------------------------------------------------------------");
		linzCabsManager = new LinzCabsManager(agentMessages.get("Linz Cabs Manager"));
		linzCabsManager.setUp();
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println(Util.ANSI_BOLD + "[✓] Created Agent: " + linzCabsManager.toString() + Util.ANSI_RESET);
		System.out.println("---------------------------------------------------------------------------------\n");
			
		System.out.println(Util.ANSI_BOLD + "=================================================================================" + Util.ANSI_RESET);
		System.out.println(Util.ANSI_BOLD + "=------------------------------- Setup Successful ------------------------------=" + Util.ANSI_RESET);
		System.out.println(Util.ANSI_BOLD + "=================================================================================\n" + Util.ANSI_RESET);
	}
	
	@Override
	public boolean hasStep() {
		if (viennaCabsManager.hasStep()) return true;
		if (linzCabsManager.hasStep()) return true;
		return false;
	}
	
	@Override
	public void step() {
		stepCount++;
		System.out.println(Util.ANSI_BOLD + "==================================== Step " + (stepCount < 10 ? "0" : "") + stepCount + " ====================================\n" + Util.ANSI_RESET);
		
		if (viennaCabsManager.hasStep()) {
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println(Util.ANSI_BOLD + "ViennaCabsManager Step:" + Util.ANSI_RESET);
			System.out.println("---------------------------------------------------------------------------------");
			viennaCabsManager.step();
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println(Util.ANSI_BOLD + "ViennaCabsManager Agent Report:" + Util.ANSI_RESET);
			System.out.println("---------------------------------------------------------------------------------");
			viennaCabsManager.printViennaCabsManagerInfo();
			System.out.println("---------------------------------------------------------------------------------\n");
		}
		if (linzCabsManager.hasStep()) {
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println(Util.ANSI_BOLD + "LinzCabsManager Step:" + Util.ANSI_RESET);
			System.out.println("---------------------------------------------------------------------------------");
			linzCabsManager.step();
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println(Util.ANSI_BOLD + "LinzCabsManager Agent Report:" + Util.ANSI_RESET);
			System.out.println("---------------------------------------------------------------------------------");
			linzCabsManager.printLinzCabsManagerInfo();
			System.out.println("---------------------------------------------------------------------------------\n");
		}
	}
}

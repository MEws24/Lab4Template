package at.ac.tuwien.big.tuber.codegen.lib;

import java.util.Optional;
import java.util.stream.Stream;

import at.ac.tuwien.big.tuber.codegen.TuberRunnerProvider;

public class TuberSimulator {
	
	public static void main(String[] args) {
		boolean stepwise = Stream.of(args).filter(a -> "-s".equals(a)).findAny().isPresent();
		Optional<String> scenarioFile = Stream.of(args).filter(a -> a.endsWith(".json")).findAny();
		
		if (!scenarioFile.isPresent()) {
			printUsage();
		}
		
		TuberRunner runner = TuberRunnerProvider.getTuberRunner();
		JsonScenarioSimulator simulator = new JsonScenarioSimulator();
									
		if (stepwise) {
			simulator.simulateStepwise(runner, scenarioFile.get());
		} else {
			simulator.simulate(runner, scenarioFile.get());
		}
	}
	
	private static void printUsage() {
		System.err.println("Usage:");
		System.err.println(" TuberSimulator [-s] scenariofile");
		System.exit(1);
	}
}

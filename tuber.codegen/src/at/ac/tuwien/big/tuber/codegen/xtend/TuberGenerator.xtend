package at.ac.tuwien.big.tuber.codegen.xtend

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import tuber.TUber;

class TuberGenerator extends AbstractGenerator {
			
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val tb = input.allContents.filter(TUber).next
		val packageName = "austriantuber"
		
		// TODO: Generate agents, users, and vehicles
		
		val runnerGenerator = new RunnerGenerator
		fsa.generateFile(
			packageName + "/" + NameUtil.toClass(tb.name) + "Runner.java", 
			runnerGenerator.generate(packageName, tb)
		)
	}
	
}

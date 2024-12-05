package at.ac.tuwien.big.tuber.codegen.lib;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

import at.ac.tuwien.big.tuber.codegen.xtend.TuberGenerator;

public class SimulatorGeneratorModule extends AbstractGenericResourceRuntimeModule {

	@Override
	protected String getLanguageName() {
		return "tuber";
	}

	@Override
	protected String getFileExtensions() {
		return "xmi";
	}

	public Class<? extends IGenerator2> bindIGenerator() {
		return TuberGenerator.class;
	}

	public Class<? extends ResourceSet> bindResourceSet() {
		return ResourceSetImpl.class;
	}
}

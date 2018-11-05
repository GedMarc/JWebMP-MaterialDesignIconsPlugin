import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.materialdesignicons.MaterialDesignIconsPageConfigurator;

module com.jwebmp.plugins.materialdesignicons {

	exports com.jwebmp.plugins.materialdesignicons;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with MaterialDesignIconsPageConfigurator;

	provides IGuiceScanJarExclusions with com.jwebmp.plugins.materialdesignicons.implementations.MaterialDesignIconsExclusionsModule;
	provides IGuiceScanModuleExclusions with com.jwebmp.plugins.materialdesignicons.implementations.MaterialDesignIconsExclusionsModule;

	opens com.jwebmp.plugins.materialdesignicons to com.fasterxml.jackson.databind, com.jwebmp.core;
}

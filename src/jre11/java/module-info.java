module com.jwebmp.plugins.materialdesignicons {

	exports com.jwebmp.plugins.materialdesignicons;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;

	requires jakarta.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.materialdesignicons.MaterialDesignIconsPageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.materialdesignicons.implementations.MaterialDesignIconsExclusionsModule;

	opens com.jwebmp.plugins.materialdesignicons to com.fasterxml.jackson.databind, com.jwebmp.core;
}

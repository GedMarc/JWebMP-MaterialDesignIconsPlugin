import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.materialdesignicons.MaterialDesignIconsPageConfigurator;

module com.jwebmp.plugins.materialdesignicons {

	exports com.jwebmp.plugins.materialdesignicons;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;

	provides IPageConfigurator with MaterialDesignIconsPageConfigurator;

}

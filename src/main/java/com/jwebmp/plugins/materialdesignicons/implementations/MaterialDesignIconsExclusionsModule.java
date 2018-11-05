package com.jwebmp.plugins.materialdesignicons.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class MaterialDesignIconsExclusionsModule
		implements IGuiceScanModuleExclusions<MaterialDesignIconsExclusionsModule>,
				           IGuiceScanJarExclusions<MaterialDesignIconsExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-material-design-icons-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.materialdesignicons");
		return strings;
	}
}

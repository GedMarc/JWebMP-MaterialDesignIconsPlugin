/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.materialdesignicons;

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 26 Feb 2017
 */
@PluginInformation(pluginName = "MaterialDesignIcons",
		pluginUniqueName = "material-design-icons",
		pluginDescription = "Material design system icons are simple, modern, friendly, and sometimes quirky. Each icon is created using our design guidelines to depict in simple and minimal forms the universal concepts used commonly throughout a UI. Ensuring readability and clarity at both large and small sizes, these icons have been optimized for beautiful display on all common platforms and display resolutions.",
		pluginVersion = "3.0.1",
		pluginDependancyUniqueIDs = "",
		pluginCategories = "fonts, icons",
		pluginSubtitle = "Material Design Icons' growing icon collection allows designers and developers targeting various platforms to download icons in the format, color and size they need for any project.",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-MaterialDesignIconsPlugin",
		pluginSourceUrl = "https://google.github.io/material-design-icons",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-MaterialDesignIconsPlugin/wiki",
		pluginOriginalHomepage = "https://google.github.io/material-design-icons/",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.iconsets/jwebmp-material-design-icons",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginLastUpdatedDate = "2018/06/26",
		pluginGroupId = "com.jwebmp.plugins.iconsets",
		pluginArtifactId = "jwebmp-material-design-icons",
		pluginModuleName = "com.jwebmp.plugins.materialdesignicons",
		pluginStatus = PluginStatus.Released
)
@SuppressWarnings("unused")
public class MaterialDesignIconsPageConfigurator
		implements IPageConfigurator<MaterialDesignIconsPageConfigurator>
{
	private static final MaterialDesignIconsCSSReference reference = new MaterialDesignIconsCSSReference();
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;
	
	/**
	 * A new instance of the page configurator
	 */
	public MaterialDesignIconsPageConfigurator()
	{
		//No config needed
	}
	
	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return MaterialDesignIconsPageConfigurator.enabled;
	}
	
	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		MaterialDesignIconsPageConfigurator.enabled = mustEnable;
	}
	
	/**
	 * Get the reference
	 *
	 * @return
	 */
	public static MaterialDesignIconsCSSReference getReference()
	{
		return MaterialDesignIconsPageConfigurator.reference;
	}
	
	@NotNull
	@Override
	 public Page<?> configure(Page<?> page)
	{
		if (!page.isConfigured() && enabled())
		{
			page.getBody()
			    .addCssReference(MaterialDesignIconsPageConfigurator.reference);
		}
		return page;
	}
	
	@Override
	public boolean enabled()
	{
		return MaterialDesignIconsPageConfigurator.enabled;
	}
}

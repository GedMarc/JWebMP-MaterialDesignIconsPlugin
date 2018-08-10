/*
 * Copyright (C) 2017 Marc Magon
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
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

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
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/MaterialDesignIcons.jar/download",
		pluginIconUrl = "https://material.io/tools/icons/static/ic_material_192px_light.svg",
		pluginIconImageUrl = "https://google.github.io/material-design-icons/www/images/icons-library.png",
		pluginLastUpdatedDate = "2018/06/26")
@SuppressWarnings("unused")
public class MaterialDesignIconsPageConfigurator
		implements IPageConfigurator
{
	private static final MaterialDesignIconsCSSReference reference = new MaterialDesignIconsCSSReference();

	/**
	 * A new instance of the page configurator
	 */
	public MaterialDesignIconsPageConfigurator()
	{
		//No config needed
	}

	/**
	 * Get the reference
	 *
	 * @return
	 */
	public static MaterialDesignIconsCSSReference getReference()
	{
		return reference;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			page.getBody()
			    .addCssReference(reference);
		}
		return page;
	}
}

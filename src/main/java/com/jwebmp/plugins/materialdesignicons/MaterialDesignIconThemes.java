package com.jwebmp.plugins.materialdesignicons;

import com.jwebmp.core.base.interfaces.ICssClassName;

import static com.jwebmp.core.utilities.StaticStrings.*;

public enum MaterialDesignIconThemes
		implements ICssClassName
{
	Filled,
	Outlined,
	Rounded,
	TwoTone,
	Sharp;

	@Override
	public String toString()
	{
		return "md-" + name().toLowerCase()
		                     .replace(CHAR_UNDERSCORE, CHAR_DASH)
		                     .replaceAll("\\$", "");
	}
}

package com.jwebmp.plugins.materialdesignicons;

import com.jwebmp.core.base.interfaces.ICSSClassName;

import static com.jwebmp.core.utilities.StaticStrings.*;

public enum MaterialDesignIconThemes
		implements ICSSClassName
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

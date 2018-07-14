package com.jwebmp.plugins.materialdesignicons;

import com.jwebmp.base.interfaces.ICSSClassName;

import static com.jwebmp.utilities.StaticStrings.*;

public enum MaterialDesignIconSize
		implements ICSSClassName
{
	$18,
	$24,
	$36,
	$48,
	;

	@Override
	public String toString()
	{
		return "md-" + name().toLowerCase()
		                     .replace(CHAR_UNDERSCORE, CHAR_DASH)
		                     .replaceAll("\\$", "");
	}
}

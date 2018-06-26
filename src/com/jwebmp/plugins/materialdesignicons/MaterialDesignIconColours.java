package com.jwebmp.plugins.materialdesignicons;

import com.jwebmp.base.interfaces.ICSSClassName;

import static com.jwebmp.utilities.StaticStrings.*;

public enum MaterialDesignIconColours
		implements ICSSClassName
{
	Dark("md-light"),
	Light("md-dark"),;
	private String value;

	MaterialDesignIconColours(String value)
	{
		this.value = value;
	}

	@Override
	public String toString()
	{
		return "md-" + name().toLowerCase()
		                     .replace(CHAR_UNDERSCORE, CHAR_DASH)
		                     .replace("\\$", "");
	}
}

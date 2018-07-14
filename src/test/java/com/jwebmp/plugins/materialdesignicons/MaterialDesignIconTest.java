package com.jwebmp.plugins.materialdesignicons;

import org.junit.jupiter.api.Test;

import static com.jwebmp.plugins.materialdesignicons.MaterialDesignIconColours.*;
import static com.jwebmp.plugins.materialdesignicons.MaterialDesignIconSize.*;
import static com.jwebmp.plugins.materialdesignicons.MaterialDesignIconThemes.*;
import static com.jwebmp.plugins.materialdesignicons.MaterialDesignIcons.*;

class MaterialDesignIconTest
{

	@Test
	void preConfigure()
	{
		MaterialDesignIcon icon = new MaterialDesignIcon(TwoTone, contact_mail, $24, Dark);
		System.out.println();
		System.out.println(icon.toString(0));
	}
}

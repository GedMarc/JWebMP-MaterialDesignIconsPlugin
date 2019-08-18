package com.jwebmp.plugins.materialdesignicons;

import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.Italic;
import com.jwebmp.core.base.interfaces.IIcon;

public class MaterialDesignIcon
		extends Italic<MaterialDesignIcon>
		implements IIcon<MaterialDesignIcon>
{
	private MaterialDesignIconThemes theme;
	private MaterialDesignIcons icon;
	private MaterialDesignIconSize size;
	private MaterialDesignIconColours colour;

	private boolean inactive;

	public MaterialDesignIcon()
	{
		this(null);
	}

	public MaterialDesignIcon(MaterialDesignIcons icon)
	{
		this(MaterialDesignIconThemes.Filled, icon);
	}

	public MaterialDesignIcon(MaterialDesignIconThemes theme, MaterialDesignIcons icon)
	{
		this(theme, icon, MaterialDesignIconSize.$24);
	}

	public MaterialDesignIcon(MaterialDesignIconThemes theme, MaterialDesignIcons icon, MaterialDesignIconSize size)
	{
		this(theme, icon, size, MaterialDesignIconColours.Light);
	}

	public MaterialDesignIcon(MaterialDesignIconThemes theme, MaterialDesignIcons icon, MaterialDesignIconSize size, MaterialDesignIconColours colour)
	{
		this.theme = theme;
		this.icon = icon;
		this.size = size;
		this.colour = colour;
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			addClass("material-icons");
			addClass(colour);
			addClass(size);
			addClass(theme);
			if (inactive)
			{
				addClass("md-inactive");
			}
			if (icon == null)
			{
				icon = MaterialDesignIcons.question_answer;
			}
			setText(icon.toString());
		}
		super.preConfigure();
	}

	public MaterialDesignIconThemes getTheme()
	{
		return theme;
	}

	public MaterialDesignIcon setTheme(MaterialDesignIconThemes theme)
	{
		this.theme = theme;
		return this;
	}

	public MaterialDesignIcons getIcon()
	{
		return icon;
	}

	public MaterialDesignIcon setIcon(MaterialDesignIcons icon)
	{
		this.icon = icon;
		return this;
	}

	public MaterialDesignIconSize getSize()
	{
		return size;
	}

	public MaterialDesignIcon setSize(MaterialDesignIconSize size)
	{
		this.size = size;
		return this;
	}

	public MaterialDesignIconColours getColour()
	{
		return colour;
	}

	public MaterialDesignIcon setColour(MaterialDesignIconColours colour)
	{
		this.colour = colour;
		return this;
	}

	public boolean isInactive()
	{
		return inactive;
	}

	public MaterialDesignIcon setInactive(boolean inactive)
	{
		this.inactive = inactive;
		return this;
	}

	@Override
	public String getClassName()
	{
		return "material-icons " + colour + " " + size + " " + theme + (inactive ? "inactive" : "") + icon.toString();
	}

	@Override
	public ComponentHierarchyBase getIconComponent()
	{
		return this;
	}
}

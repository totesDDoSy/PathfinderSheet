package com.csanford.pathfindersheet.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cody Sanford <cody.b.sanford@gmail.com>
 */
public class Attribute
{

    int value;
    int baseValue;
    int modifier;
    int racialModifier;
    int levelBoost;
    int enhancementBonus;
    int miscBoost;

    public Attribute()
    {
	this.value = 10;
	this.baseValue = 10;
	this.modifier = 0;
	this.racialModifier = 0;
	this.levelBoost = 0;
	this.enhancementBonus = 0;
	this.miscBoost = 0;
    }

    private int calculateValue()
    {
	return this.baseValue + this.racialModifier + this.levelBoost + this.miscBoost + this.enhancementBonus;
    }

    public int getValue()
    {
	return calculateValue();
    }
}

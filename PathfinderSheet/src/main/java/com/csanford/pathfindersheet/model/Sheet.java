package com.csanford.pathfindersheet.model;

import java.util.Map;

/**
 * AKA the character
 *
 * @author Cody Sanford <cody.b.sanford@gmail.com>
 */
public class Sheet
{

    public String charName;
    public String playerName;
    public Integer age;
    public String height;
    public String weight;
    public String diety;
    public String eyes;
    public String hair;
    public String gender;

    public Map< PFClass, Integer> classList;
    public Alignment alignment;
    public Size size;

    public Race race;

    public Attribute strength;
    public Attribute dexterity;
    public Attribute constitution;
    public Attribute intelligence;
    public Attribute wisdom;
    public Attribute charisma;
}

package com.csanford.pathfindersheet.model;

/**
 *
 * @author Cody Sanford <cody.b.sanford@gmail.com>
 */
public enum Size
{
    FINE( 8 ),
    DIMINUTIVE( 4 ),
    TINY( 2 ),
    SMALL( 1 ),
    MEDIUM( 0 ),
    LARGE( -1 ),
    HUGE( -2 ),
    GARGANTUAN( -4 ),
    COLOSSAL( -8 );

    private final int sizeModifier;

    private Size( final int sizeModifier )
    {
	this.sizeModifier = sizeModifier;
    }

    public int getSizeModifier()
    {
	return this.sizeModifier;
    }

    public int getSpecialSizeModifier()
    {
	return -this.sizeModifier;
    }
}

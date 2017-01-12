package com.csanford.pathfindersheet.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Cody Sanford <cody.b.sanford@gmail.com>
 */
@Controller
@RequestMapping( "/" )
public class HelloController
{

    @RequestMapping( method = GET )
    public String display()
    {
	return "hello";
    }

}

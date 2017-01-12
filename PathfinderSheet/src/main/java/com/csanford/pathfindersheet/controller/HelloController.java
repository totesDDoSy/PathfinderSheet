/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    public String homepage()
    {
        return "hello";
    }
    
}

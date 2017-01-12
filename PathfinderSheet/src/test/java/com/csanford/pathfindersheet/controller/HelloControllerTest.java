package com.csanford.pathfindersheet.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

/**
 *
 * @author Cody Sanford <cody.b.sanford@gmail.com>
 */
public class HelloControllerTest
{

    @Test
    public void testHomePage() throws Exception
    {
	HelloController controller = new HelloController();
	MockMvc mockMvc = standaloneSetup( controller ).build();
	mockMvc.perform( get( "/" ) ).andExpect( view().name( "hello" ) );
    }

}

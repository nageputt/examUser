package com.nikhil.user.UserDetails;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.nikhil.user.UserDetails.config.WebMvcConfig;
import com.nikhil.user.UserDetails.controller.UserController;

/**
 * UserDetailsApplicationTests class is a used for JUNIT 
 * 
 * @author nikhil
 * @since 28-11-2021
 *
 */
@WebMvcTest(UserController.class)
@ContextConfiguration(classes = { WebMvcConfig.class })
class UserDetailsApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@BeforeEach
	void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
	}


	@Test
	public void testPattern() throws Exception {
		StringBuffer pattern = new StringBuffer();
		pattern.append("*****\n");
		pattern.append("****\n");
		pattern.append("***\n");
		pattern.append("**\n");
		pattern.append("*\n");
		assertThat(new InvertedTriangularPattern().printPatternRecur(5, 1)).isEqualTo(pattern.toString());
	}
	
	@Test
	public void testHomePage() throws Exception {
		this.mockMvc.perform(get("/users/")).andExpect(status().isOk()).andExpect(view().name("users"))
				.andExpect(model().attributeExists("listUser")).andReturn();
	}
}

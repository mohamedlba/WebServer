package com.SiliconMoon.WebServer;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.beans.factory.annotation.Autowired;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
class WebServerApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void collectionMoviesLoads() throws Exception{
		
		this.mockMvc.perform(get("/movie")).andDo(print()).andExpect(status().isOk());
	}

	@Test
	public void singletonCategoryLoads() throws Exception{
		
		this.mockMvc.perform(get("/movie/category/actor")).andDo(print()).andExpect(status().isOk());
	}
	
	@Test
	public void singletonTitleLoads() throws Exception{
		
		this.mockMvc.perform(get("/movie/title/cleo")).andDo(print()).andExpect(status().isOk());
	}
	
	@Test
	public void singletonIdLoads() throws Exception{
		
		this.mockMvc.perform(get("/movie/id/12")).andDo(print()).andExpect(status().isOk());
	}
	
	@Test
	public void singletonYearLoads() throws Exception{
		
		this.mockMvc.perform(get("/movie/year/1934")).andDo(print()).andExpect(status().isOk());
	}
	
	
	@Test
	public void collectionwinnerLoads() throws Exception{
		
		this.mockMvc.perform(get("/movie/winner")).andDo(print()).andExpect(status().isOk());
	}
	
	
}

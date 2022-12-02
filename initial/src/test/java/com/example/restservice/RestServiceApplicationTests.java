package com.example.restservice;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class RestServiceApplicationTests {

	@Test
	public void testGetContent() {
		Greeting greeting = new Greeting(1, "Test");
		assertEquals("Test", greeting.getContent());
	}

	@Test
	public void testGetID() {
		Greeting greeting = new Greeting(1, "Test");
		assertEquals(1, greeting.getId());
	}
}

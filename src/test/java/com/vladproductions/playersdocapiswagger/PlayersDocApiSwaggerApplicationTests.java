package com.vladproductions.playersdocapiswagger;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PlayersDocApiSwaggerApplicationTests {

	@Test
	void contextLoads() {
		int a = 5/0;
	}

	@Test
	void testDivisionByZero() {
    		Assertions.assertThrows(ArithmeticException.class, () -> {
        		int a = 5 / 0;
    		});
	}

}

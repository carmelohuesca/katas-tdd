package dojo.katas;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void fizzBuzzReturnsOneStringNumber() {
		FizzBuzz game = new FizzBuzz();
		String result = game.fizzBuzz(1);
		assertEquals("1", result);
	}

	@Test
	public void fizzBuzzMultiple3() {
		resultGame(FizzBuzz.FIZZ,3);
	}
	
	@Test
	public void fizzBuzzMultiple5() {
		resultGame(FizzBuzz.BUZZ,5);
	}

	@Test
	public void fizzBuzzMultiple3and5() {
		resultGame(FizzBuzz.FIZZBUZZ,30);
	}
	
	@Test
	public void fizzBuzzMultiple3and5not2() {
		resultGame(FizzBuzz.NOFIZZBUZZ,15);
	}	
	
	@Test
	public void fizzBuzzMultiple3and5and7not2() {
		resultGame(FizzBuzz.WOOOW,105);
	}

	private void resultGame(String word, int number) {
		FizzBuzz game = new FizzBuzz();
		String result = game.fizzBuzz(number);
		assertEquals(word, result);		
	}

}

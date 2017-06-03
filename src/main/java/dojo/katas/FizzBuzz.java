package dojo.katas;

public class FizzBuzz {

	public static final String BUZZ = "Buzz";
	public static final String FIZZ = "Fizz";
	public static final String FIZZBUZZ = "FizzBuzz";
	public static final String NOFIZZBUZZ = "NoFizzBuzz";
	public static final String WOOOW = "WoooW";
	private String str;

	public String fizzBuzz(Integer number) {
		this.str = number.toString();
		this.logical(number);
		return this.str;
	}

	private void logical(int number) {
		this.multiple3(number);
		this.multiple5(number);
		this.multiple3and5(number);
		this.multiple3and5not2(number);
		this.multiple3and5and7not2(number);
	}

	private void multiple3(int number) {
		if (isMultiple(3, number)) {
			this.str = FIZZ;
		}
	}

	private void multiple5(int number) {
		if (isMultiple(5, number)) {
			this.str = BUZZ;
		}
	}

	private void multiple3and5(int number) {
		if (isMultiple(3, number) && isMultiple(5, number)) {
			this.str = FIZZBUZZ;
		}
	}

	private void multiple3and5not2(int number) {
		if (isMultiple(3, number) && isMultiple(5, number) && isNotMultiple(2, number)) {
			this.str = NOFIZZBUZZ;
		}
	}

	private void multiple3and5and7not2(int number) {
		if (isMultiple(3, number) && isMultiple(5, number) && isMultiple(7, number) && isNotMultiple(2, number)) {
			this.str = WOOOW;
		}
	}

	private Boolean isMultiple(int base, int number) {
		Integer result = number % base;
		Boolean isMultiple = result.equals(0);
		return isMultiple;
	}
	
	private Boolean isNotMultiple(int base, int number) {
		return !isMultiple(base, number);
	}
}

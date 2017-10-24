package first.fizzbuzzwhizz;

import junit.framework.TestCase;

public class FizzBuzzWhizzTest extends TestCase
{
	public void test_when_rule_one()
	{
		FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
		assertEquals("Fizz", fizzBuzzWhizz.getResult(3));
		assertEquals("Buzz", fizzBuzzWhizz.getResult(5));
		assertEquals("Whizz", fizzBuzzWhizz.getResult(7));
		assertEquals("1", fizzBuzzWhizz.getResult(1));
		assertEquals("Fizz", fizzBuzzWhizz.getResult(9));
	}
	
	public void test_when_rule_two()
	{
		FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
		assertEquals("FizzBuzz", fizzBuzzWhizz.getResult(15));
		assertEquals("FizzWhizz", fizzBuzzWhizz.getResult(21));
		assertEquals("FizzBuzzWhizz", fizzBuzzWhizz.getResult(105));
	}
	
	public void test_when_rule_three()
	{
		FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
		assertEquals("Fizz", fizzBuzzWhizz.getResult(13));
		assertEquals("Fizz", fizzBuzzWhizz.getResult(35));
	}
}

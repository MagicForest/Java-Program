package first.fizzbuzzwhizz;

import java.util.stream.Stream;

public class FizzBuzzWhizz
{

	public String getResult(int number)
	{
		return Stream.of(new SpecialDigitThreeRule(number), new FizzBuzzWhizzRule(number))
				     .filter(Rule::isAccepted)
				     .findFirst()
				     .orElse(new NumberRule(number)).getResult();
	}

}

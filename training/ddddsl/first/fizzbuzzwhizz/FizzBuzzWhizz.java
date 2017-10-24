package first.fizzbuzzwhizz;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzWhizz
{

	public String getResult(int number)
	{
		List<Rule> rules = Arrays.asList(new SpecialDigitThreeRule(number), new FizzRule(number), new BuzzRule(number),
				new WhizzRule(number));
		StringBuffer result = new StringBuffer();
		for (Rule rule : rules)
		{
			result.append(rule.getResult());
			if (rule.isFinished())
			{
				break;
			}
		}
		return result.length() == 0 ? new NumberRule(number).getResult() : result.toString();
	}

}

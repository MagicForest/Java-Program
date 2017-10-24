package first.fizzbuzzwhizz;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzWhizzRule implements Rule
{
	private List<Rule> combinationRules;

	public FizzBuzzWhizzRule(int number)
	{
		combinationRules = Arrays.asList(new FizzRule(number), new BuzzRule(number), new WhizzRule(number));
	}
	
	@Override
	public String getResult()
	{
		return combinationRules.stream().map(Rule::getResult).reduce("", (a,b)->a+b);
	}

	@Override
	public boolean isAccepted()
	{
		return combinationRules.stream().anyMatch(Rule::isAccepted);
	}

}

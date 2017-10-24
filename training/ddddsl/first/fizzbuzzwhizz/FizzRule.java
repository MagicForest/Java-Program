package first.fizzbuzzwhizz;

public class FizzRule implements Rule
{
	private int number;

	public FizzRule(int number)
	{
		this.number = number;
	}

	@Override
	public String getResult()
	{
		return isAccepted() ? "Fizz" : "";
	}

	@Override
	public boolean isAccepted()
	{
		return number % 3 == 0;
	}
	
}

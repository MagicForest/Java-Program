package first.fizzbuzzwhizz;

public class NumberRule implements Rule
{
	private int number;

	public NumberRule(int number)
	{
		this.number = number;
	}

	@Override
	public String getResult()
	{
		return String.valueOf(number);
	}

	@Override
	public boolean isAccepted()
	{
		return true;
	}

}

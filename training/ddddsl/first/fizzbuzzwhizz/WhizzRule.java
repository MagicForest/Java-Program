package first.fizzbuzzwhizz;

public class WhizzRule implements Rule
{

	private int number;

	public WhizzRule(int number)
	{
		this.number = number;
	}

	@Override
	public String getResult()
	{
		return isAccepted() ? "Whizz" : "";
	}

	@Override
	public boolean isAccepted()
	{
		return number % 7 == 0;
	}
	
}

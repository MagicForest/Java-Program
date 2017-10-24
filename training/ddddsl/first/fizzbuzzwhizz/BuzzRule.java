package first.fizzbuzzwhizz;

public class BuzzRule implements Rule
{
	private int number;

	public BuzzRule(int number)
	{
		this.number = number;
	}
	

	@Override
	public String getResult()
	{
		return isAccepted() ? "Buzz" : "";
	}
	
	@Override
	public boolean isAccepted()
	{
		return number % 5 == 0;
	}

}

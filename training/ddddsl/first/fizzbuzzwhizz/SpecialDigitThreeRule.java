package first.fizzbuzzwhizz;

public class SpecialDigitThreeRule implements Rule
{
	private int number;

	public SpecialDigitThreeRule(int number)
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
		return String.valueOf(number).contains("3");
	}

	@Override
	public boolean isFinished()
	{
		return isAccepted();
	}

}

package first.fizzbuzzwhizz;

public interface Rule
{
	String getResult();

	boolean isAccepted();

	default boolean isFinished()
	{
		return false;
	}

}

package devin.wu.training.ddl.ms;

import junit.framework.TestCase;

public class LengthTest extends TestCase
{

	public void testMileEquality()
	{
		assertEquals(new Length("3 Mile"), new Length("3 Mile"));
	}

	public void testMileToYard()
	{
		assertEquals(new Length("1 Mile"), new Length("1760 Yard"));
	}

	public void testYardToFeet()
	{
		assertEquals(new Length("1 Yard"), new Length("3 Feet"));
	}

	public void testFeetToInch()
	{
		assertEquals(new Length("1 Feet"), new Length("12 Inch"));
	}

	public void testUnknownUnit()
	{
		try
		{
			new Length("1 meter");
			assertTrue(false);
		}
		catch (UnknownUnitException e)
		{
			assertTrue(true);
		}
	}

	public void testAdd()
	{
		assertEquals("2 Feet", new Length("13 Inch").add(new Length("11 Inch")).toString());
		assertEquals("3 Yard", new Length("3 Feet").add(new Length("2 Yard")).toString());
		assertEquals("2 Mile", new Length("1 Mile").add(new Length("1760 Yard")).toString());
		assertEquals("2 Mile 2 Yard", new Length("1 Mile").add(new Length("1762 Yard")).toString());
		assertEquals("1 Mile 1 Yard 1 Feet 1 Inch",
				new Length("1 Mile").add(new Length("1 Yard")
				                    .add(new Length("1 Feet")
				                    .add(new Length("1 Inch")))).toString());
	}

	public void testZero()
	{
		assertEquals("0 Inch", new Length("0 Inch").toString());
	}

	public void testFormatByMinUnit()
	{
		assertEquals("36 Inch", new Length("1 Yard").formatByMinUnit());
	}
}

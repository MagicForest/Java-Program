package devin.wu.training.ddl.ms;

import junit.framework.TestCase;

public class VolumeTest extends TestCase
{
	public void testEquality()
	{
		assertEquals(new Volume("1 TBSP"), new Volume("3 TSP"));
		assertEquals(new Volume("1 OZ"), new Volume("2 TBSP"));
	}

	public void testUnknownUnit()
	{
		try
		{
			new Volume("1 meter");
			assertTrue(false);
		}
		catch (UnknownUnitException e)
		{
			assertTrue(true);
		}
	}

	public void testAdd()
	{
		assertEquals("1 TBSP", new Volume("1 TSP").add(new Volume("2 TSP")).toString());
		assertEquals("2 OZ 1 TBSP 2 TSP", new Volume("1 OZ").add(new Volume("3 TBSP")).add(new Volume("2 TSP")).toString());
	}
	
	public void testZero()
	{
		assertEquals("0 TSP", new Volume("0 TSP").toString());
	}
}

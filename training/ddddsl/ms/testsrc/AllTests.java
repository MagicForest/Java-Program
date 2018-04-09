package devin.wu.training.ddl.ms;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AllTests extends TestCase
{

	public static Test suite()
	{
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(LengthTest.class);
		suite.addTestSuite(VolumeTest.class);
		//$JUnit-END$
		return suite;
	}

}

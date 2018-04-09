package devin.wu.training.ddl.ms;

import java.util.LinkedHashMap;
import java.util.Map;

public class Length extends Measurement
{
	public Length(String lengthExpression) throws UnknownUnitException
	{
		super(lengthExpression);
	}

	@Override
	protected Map<String, Integer> initFactorByUnit()
	{
		Map<String, Integer> factorByUnit = new LinkedHashMap<>();
		factorByUnit.put("Mile", 1760 * 3 * 12);
		factorByUnit.put("Yard", 3 * 12);
		factorByUnit.put("Feet", 12);
		factorByUnit.put("Inch", 1);
		return factorByUnit;
	}


}

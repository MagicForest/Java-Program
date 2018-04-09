package devin.wu.training.ddl.ms;

import java.util.LinkedHashMap;
import java.util.Map;

public class Volume extends Measurement
{

	public Volume(String lengthExpression) throws UnknownUnitException
	{
		super(lengthExpression);
	}

	@Override
	protected Map<String, Integer> initFactorByUnit()
	{
		Map<String, Integer> factorByUnit = new LinkedHashMap<>();
		factorByUnit.put("OZ", 2 * 3);
		factorByUnit.put("TBSP", 3);
		factorByUnit.put("TSP", 1);
		return factorByUnit;
	}

}

package devin.wu.training.ddl.ms;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public abstract class Measurement
{
	private static final String SPLIT_CHAR_BETWEEN_VALUE_AND_UNIT = " ";

	private Map<String, Integer> factorByUnit = Collections.unmodifiableMap(initFactorByUnit());

	private int value;

	protected abstract Map<String, Integer> initFactorByUnit();

	public Measurement(String lengthExpression) throws UnknownUnitException
	{
		String[] valueAndUnit = lengthExpression.split(SPLIT_CHAR_BETWEEN_VALUE_AND_UNIT);
		int currentValue = Integer.parseInt(valueAndUnit[0]);
		String currentUnit = valueAndUnit[1];
		if (factorByUnit.containsKey(currentUnit))
		{
			this.value = factorByUnit.get(currentUnit) * currentValue;
		}
		else
		{
			throw new UnknownUnitException();
		}
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		int[] currentValue = new int[] { this.value };

		factorByUnit.forEach((unit, factor) ->
		{
			int valueByCurrentUnit = currentValue[0] / factor;
			if (valueByCurrentUnit != 0)
			{
				builder.append(valueByCurrentUnit).append(SPLIT_CHAR_BETWEEN_VALUE_AND_UNIT).append(unit)
						.append(SPLIT_CHAR_BETWEEN_VALUE_AND_UNIT);
				currentValue[0] = currentValue[0] % factor;
			}
		});
		if (builder.length() > 0)
		{
			return builder.substring(0, builder.length() - 1);
		}
		else
		{
			return String.format("0%s%s", SPLIT_CHAR_BETWEEN_VALUE_AND_UNIT, getMinUnit());
		}
	}

	private String getMinUnit()
	{
		Optional<Map.Entry<String, Integer>> entry = factorByUnit.entrySet().stream().filter(e -> e.getValue() == 1).findAny();
		if (entry.isPresent())
		{
			return entry.get().getKey();
		}
		throw new UnknownMinUnitException();
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj != null)
		{
			Measurement other = (Measurement) obj;
			return Objects.equals(toString(), other.toString());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return Objects.hashCode(toString());
	}

	public Measurement add(Measurement other)
	{
		this.value = this.value + other.value;
		return this;
	}

	public String formatByMinUnit()
	{
		return String.format("%d%s%s", value, SPLIT_CHAR_BETWEEN_VALUE_AND_UNIT, getMinUnit());
	}
}

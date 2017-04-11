package gunits.unit;

import gunits.measure.Measure;

public interface ScalarConversion extends MeasurementUnit {

	public double getConversionRatio();

	/**
	 * do not change these or it will not work!
	 */
	public default double fromBasal(double value) {
		return value * getConversionRatio();
	}

	/**
	 * do not change these or it will not work!
	 */
	public default double toBasal(double value) {
		return value / getConversionRatio();
	}

	/**
	 * method for creating a conversion from a known quantity to a known
	 * measure. This can be used to convert from pixels to feet, or ticks to
	 * seconds, or dividing an interval into sub intervals. To use give the
	 * value of what you want to convert, i.e. 5000 steps and the amount it goes
	 * to, i.e. 2 miles and it will give you a unit for steps that can be used
	 * in the measure class to convert between items and steps.
	 * 
	 * @param value
	 *            how many units the measure is
	 * @param m
	 *            measure for defining the amount
	 * @return a conversion unit to the value given
	 * @since Apr 3, 2016
	 */
	public static ScalarConversion getConversion(double value, Measure m) {
		// get the units of the measure
		SIUnit units = m.getUnits();

		// give the measure a dummy variable to get the underlying value
		double totalVal = m.convertTo(new ScalarConversion() {
			@Override
			public SIUnit getUnits() {
				return units;
			}

			@Override
			public double getConversionRatio() {
				return 1;
			}
		});

		// get the conversion ratio
		double cora = value / totalVal;

		// return a new scalar conversion with the ratio
		return new ScalarConversion() {

			@Override
			public SIUnit getUnits() {
				return units;
			}

			@Override
			public double getConversionRatio() {
				return cora;
			}
		};
	}
}

package gunits.unit;

public interface MeasurementUnit {

	public abstract SIUnit getUnits();

	public abstract double fromBasal(double value);

	public abstract double toBasal(double value);

	/**
	 * do not change this method...
	 */
	public default MeasurementUnit per(MeasurementUnit mu) {
		final MeasurementUnit ref = this;
		// check if they are both scalar conversion units
		if (this instanceof ScalarConversion) {
			if (mu instanceof ScalarConversion) {
				// return a simple class
				return new ScalarConversion() {
					private final SIUnit units = ref.getUnits().per(mu.getUnits());
					private final double cora = ((ScalarConversion) ref).getConversionRatio()
							/ ((ScalarConversion) mu).getConversionRatio();

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

		// TODO: fix this so it will work for degrees kelvin, celsius, and
		// fahrenheit

		// otherwise such a conversion can't be done
		throw new IllegalArgumentException(
				"Such a translation of " + this.getUnits() + " / " + mu.getUnits() + " cannot be done!");
	}
	
	public default MeasurementUnit m(MeasurementUnit mu){
		final MeasurementUnit ref = this;
		// check if they are both scalar conversion units
		if (this instanceof ScalarConversion) {
			if (mu instanceof ScalarConversion) {
				// return a simple class
				return new ScalarConversion() {
					private final SIUnit units = ref.getUnits().m(mu.getUnits());
					private final double cora = ((ScalarConversion) ref).getConversionRatio()
							* ((ScalarConversion) mu).getConversionRatio();

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

		// TODO: fix this so it will work for degrees kelvin, celsius, and
		// fahrenheit

		// otherwise such a conversion can't be done
		throw new IllegalArgumentException(
				"Such a translation of " + this.getUnits() + " * " + mu.getUnits() + " cannot be done!");
	}

}

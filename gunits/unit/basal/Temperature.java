package gunits.unit.basal;

import gunits.unit.MeasurementUnit;
import gunits.unit.SIUnit;

public enum Temperature implements MeasurementUnit {
	KELVIN {

		@Override
		public double fromBasal(double value) {
			// just return the value
			return value;
		}

		@Override
		public double toBasal(double value) {
			// check for negative values
			if (value < 0)
				throw new IllegalArgumentException("Can't have a temperature below Absolute Zero!");

			return value;
		}

	},
	CELSIUS {

		@Override
		public double fromBasal(double value) {
			return KELVIN.fromBasal(value - 273.15);
		}

		@Override
		public double toBasal(double value) {
			return KELVIN.toBasal(value + 273.15);
		}

	},
	FAHRENHEIT {

		@Override
		public double fromBasal(double value) {
			return 9.0 / 5.0 * CELSIUS.fromBasal(value) + 32;
		}

		@Override
		public double toBasal(double value) {
			return CELSIUS.toBasal(5.0 / 9.0 * (value - 32));
		}

	},
	RANKINE {

		@Override
		public double fromBasal(double value) {
			return FAHRENHEIT.fromBasal(value) + 459.67;
		}

		@Override
		public double toBasal(double value) {
			return FAHRENHEIT.toBasal(value - 459.66999);
		}

	},
	ROMER {

		@Override
		public double fromBasal(double value) {
			return CELSIUS.fromBasal(value) * 21.0 / 40.0 + 7.5;
		}

		@Override
		public double toBasal(double value) {
			return CELSIUS.toBasal((value - 7.5) * 40.0 / 21.0);
		}

	};

	@Override
	public SIUnit getUnits() {
		return SIUnit.Temperature;
	}

}

package gunits.measure;

import gcore.units.Unit;
import gunits.unit.MeasurementUnit;
import gunits.unit.SIUnit;

public class Measure extends Unit {

	// stores what the units for the measure are
	private final SIUnit units;

	public Measure(double value, MeasurementUnit units) {
		super(units.toBasal(value), 1);
		this.units = units.getUnits();
	}

	private Measure(double value, SIUnit units) {
		super(value, 1);
		this.units = units;
	}

	public double convertTo(MeasurementUnit unit) {

		// check for unit mismatch
		if (!unit.getUnits().equals(units))
			throw new UnitMismatchException(units, unit.getUnits());

		// convert to the underlying value from basal using the unit

		return unit.fromBasal(convertTo(1));

	}

	public SIUnit getUnits() {
		return units;
	}

	public Measure divide(Measure m) {
		SIUnit units = this.units.per(m.getUnits());

		double value = this.convertTo(1) / m.convertTo(1);

		return new Measure(value, units);
	}

	public Measure multiply(Measure m) {
		SIUnit units = this.units.m(m.getUnits());

		double value = this.convertTo(1) * m.convertTo(1);

		return new Measure(value, units);
	}

	public Measure add(Measure m) {
		// make sure they have the same elements
		if (!m.getUnits().equals(units))
			throw new UnitMismatchException(units, m.getUnits());

		double value = this.convertTo(1) + m.convertTo(1);

		return new Measure(value, units);
	}

	public Measure subtract(Measure m) {
		// make sure they have the same elements
		if (!m.getUnits().equals(units))
			throw new UnitMismatchException(units, m.getUnits());

		double value = this.convertTo(1) - m.convertTo(1);

		return new Measure(value, units);
	}

	public Measure scale(double scalar) {
		double value = this.convertTo(1) * scalar;

		return new Measure(value, units);
	}

	public Measure intervals(double scalar) {
		return scale(1 / scalar);
	}

}

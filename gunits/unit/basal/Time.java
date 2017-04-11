package gunits.unit.basal;

import gunits.unit.MKSUnit;
import gunits.unit.SIUnit;
import gunits.unit.ScalarConversion;

public enum Time implements ScalarConversion{

	SECONDS(1),
	DECASECONDS(SECONDS.cr * 10),
	CENTISECONDS(DECASECONDS.cr * 10),
	MILLISECONDS(CENTISECONDS.cr * 10),
	MICROSECONDS(MILLISECONDS.cr * 1000),
	NANOSECONDS(MICROSECONDS.cr * 1000),
	PICOSECONDS(NANOSECONDS.cr * 1000),
	FEMTOSECONDS(PICOSECONDS.cr * 1000),
	ATTOSECONDS(FEMTOSECONDS.cr * 1000),
	ZEPTOSECONDS(ATTOSECONDS.cr * 1000),
	YOCTOSECONDS(ZEPTOSECONDS.cr * 1000),
	MINUTES(SECONDS.cr / 60),
	HOURS(MINUTES.cr / 60),
	DAYS(HOURS.cr / 24),
	YEARS(DAYS.cr / 365.24219907407D),
	DECADES(YEARS.cr / 10),
	CENTURIES(DECADES.cr / 10),
	MILLENIA(CENTURIES.cr / 10);

	private final double cr;

	private Time(double conversionRatio) {
		cr = conversionRatio;
	}

	public double getConversionRatio() {
		return cr;
	}

	public final SIUnit getUnits() {
		return MKSUnit.Time;
	}
}

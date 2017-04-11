package gunits.unit.basal;

import gunits.unit.MKSUnit;
import gunits.unit.SIUnit;
import gunits.unit.ScalarConversion;

public enum Distance implements ScalarConversion {

	METERS(1),
	DECIMETERS(METERS.cr * 10),
	CENTIMETERS(DECIMETERS.cr * 10),
	MILLIMETERS(CENTIMETERS.cr * 10),
	MICROMETERS(MILLIMETERS.cr * 1000),
	NANOMETERS(MICROMETERS.cr * 1000),
	PICOMETERS(NANOMETERS.cr * 1000),
	FEMTOMETERS(PICOMETERS.cr * 1000),
	ATTOMETERS(FEMTOMETERS.cr * 1000),
	ZEPTOMETERS(ATTOMETERS.cr * 1000),
	YOCTOMETERS(ZEPTOMETERS.cr * 1000),
	DEKAMETERS(METERS.cr / 10),
	HECTOMETERS(DEKAMETERS.cr / 10),
	KILOMETERS(HECTOMETERS.cr / 10),
	MEGAMETERS(KILOMETERS.cr / 1000),
	GIGAMETERS(MEGAMETERS.cr / 1000),
	TERAMETERS(GIGAMETERS.cr / 1000),
	PETAMETERS(TERAMETERS.cr / 1000),
	EXAMETERS(PETAMETERS.cr / 1000),
	ZETTAMETERS(EXAMETERS.cr / 1000),
	YOTTAMETERS(ZETTAMETERS.cr / 1000),
	LIGHTYEARS(PETAMETERS.cr / 9.46073),
	PARSECS(PETAMETERS.cr / 30.8568),
	FEET(METERS.cr * 3.2808399),
	INCHES(FEET.cr * 12),
	YARDS(FEET.cr / 3),
	MILES(FEET.cr / 5280),
	NAUTICALMILES(METERS.cr / 1852);

	private final double cr;

	private Distance(double conversionRatio) {
		cr = conversionRatio;
	}

	public double getConversionRatio() {
		return cr;
	}

	public final SIUnit getUnits() {
		return MKSUnit.Distance;
	}

}

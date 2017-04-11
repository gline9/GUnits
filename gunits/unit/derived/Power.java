package gunits.unit.derived;

import gunits.unit.MKSUnit;
import gunits.unit.SIUnit;
import gunits.unit.ScalarConversion;
import gunits.unit.basal.Time;

public enum Power implements ScalarConversion {
	WATTS(Energy.JOULES.per(Time.SECONDS).fromBasal(1)),
	DEKAWATTS(WATTS.cora / 10),
	HECTOWATTS(DEKAWATTS.cora / 10),
	KILOWATTS(WATTS.cora / 1000),
	MEGAWATTS(KILOWATTS.cora / 1000),
	GIGAWATTS(MEGAWATTS.cora / 1000),
	TERAWATTS(GIGAWATTS.cora / 1000),
	PETAWATTS(TERAWATTS.cora / 1000),
	EXAWATTS(PETAWATTS.cora / 1000),
	ZETTAWATTS(EXAWATTS.cora / 1000),
	YOTTAWATTS(ZETTAWATTS.cora / 1000),
	DECAWATTS(WATTS.cora * 10),
	CENTIWATTS(DECAWATTS.cora * 10),
	MILLIWATTS(CENTIWATTS.cora * 10),
	MICROWATTS(MILLIWATTS.cora * 1000),
	NANOWATTS(MICROWATTS.cora * 1000),
	PICOWATTS(NANOWATTS.cora * 1000),
	FEMTOWATTS(PICOWATTS.cora * 1000),
	ATTOWATTS(FEMTOWATTS.cora * 1000),
	ZEPTOWATTS(ATTOWATTS.cora * 1000),
	YOCTOWATTS(ZEPTOWATTS.cora * 1000),
	METRICHORSEPOWER(WATTS.cora / 735.5),
	HORSEPOWER(WATTS.cora / 745.7);

	private final double cora;

	private Power(double conversionRatio) {
		cora = conversionRatio;
	}

	public double getConversionRatio() {
		return cora;
	}

	public final SIUnit getUnits() {
		return MKSUnit.Power;
	}
}

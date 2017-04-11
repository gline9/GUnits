package gunits.unit.derived;

import gunits.unit.MKSUnit;
import gunits.unit.SIUnit;
import gunits.unit.ScalarConversion;
import gunits.unit.basal.Distance;

public enum Pressure implements ScalarConversion {
	PASCALS(Force.NEWTONS.per(Distance.METERS.m(Distance.METERS)).fromBasal(1)),
	DEKAPASCALS(PASCALS.cora / 10),
	HECTOPASCALS(DEKAPASCALS.cora / 10),
	KILOPASCALS(PASCALS.cora / 1000),
	MEGAPASCALS(KILOPASCALS.cora / 1000),
	GIGAPASCALS(MEGAPASCALS.cora / 1000),
	TERAPASCALS(GIGAPASCALS.cora / 1000),
	PETAPASCALS(TERAPASCALS.cora / 1000),
	EXAPASCALS(PETAPASCALS.cora / 1000),
	ZETTAPASCALS(EXAPASCALS.cora / 1000),
	YOTTAPASCALS(ZETTAPASCALS.cora / 1000),
	DECAPASCALS(PASCALS.cora * 10),
	CENTIPASCALS(DECAPASCALS.cora * 10),
	MILLIPASCALS(CENTIPASCALS.cora * 10),
	MICROPASCALS(MILLIPASCALS.cora * 1000),
	NANOPASCALS(MICROPASCALS.cora * 1000),
	PICOPASCALS(NANOPASCALS.cora * 1000),
	FEMTOPASCALS(PICOPASCALS.cora * 1000),
	ATTOPASCALS(FEMTOPASCALS.cora * 1000),
	ZEPTOPASCALS(ATTOPASCALS.cora * 1000),
	YOCTOPASCALS(ZEPTOPASCALS.cora * 1000),
	BARS(MEGAPASCALS.cora * 10),
	TECHNICALATMS(Force.KILOGRAMS.per(Distance.CENTIMETERS.m(Distance.CENTIMETERS)).fromBasal(1)),
	ATMS(BARS.cora / 1.01325),
	TORRS(PASCALS.cora / 133.3224),
	PSI(TORRS.cora / 51.71493);
	
	private final double cora;

	private Pressure(double conversionRatio) {
		cora = conversionRatio;
	}

	public double getConversionRatio() {
		return cora;
	}

	public final SIUnit getUnits() {
		return MKSUnit.Pressure;
	}
}

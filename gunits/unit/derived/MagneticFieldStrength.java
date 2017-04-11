package gunits.unit.derived;

import gunits.unit.SIUnit;
import gunits.unit.ScalarConversion;
import gunits.unit.basal.Distance;

public enum MagneticFieldStrength implements ScalarConversion {
	TESLAS(MagneticFlux.WEBERS.per(Distance.METERS.m(Distance.METERS)).fromBasal(1)),
	DEKATESLAS(TESLAS.cora / 10),
	HECTOTESLAS(DEKATESLAS.cora / 10),
	KILOTESLAS(TESLAS.cora / 1000),
	MEGATESLAS(KILOTESLAS.cora / 1000),
	GIGATESLAS(MEGATESLAS.cora / 1000),
	TERATESLAS(GIGATESLAS.cora / 1000),
	PETATESLAS(TERATESLAS.cora / 1000),
	EXATESLAS(PETATESLAS.cora / 1000),
	ZETTATESLAS(EXATESLAS.cora / 1000),
	YOTTATESLAS(ZETTATESLAS.cora / 1000),
	DECATESLAS(TESLAS.cora * 10),
	CENTITESLAS(DECATESLAS.cora * 10),
	MILLITESLAS(CENTITESLAS.cora * 10),
	MICROTESLAS(MILLITESLAS.cora * 1000),
	NANOTESLAS(MICROTESLAS.cora * 1000),
	PICOTESLAS(NANOTESLAS.cora * 1000),
	FEMTOTESLAS(PICOTESLAS.cora * 1000),
	ATTOTESLAS(FEMTOTESLAS.cora * 1000),
	ZEPTOTESLAS(ATTOTESLAS.cora * 1000),
	YOCTOTESLAS(ZEPTOTESLAS.cora * 1000);

	private final double cora;

	private MagneticFieldStrength(double conversionRatio) {
		cora = conversionRatio;
	}

	public double getConversionRatio() {
		return cora;
	}

	public final SIUnit getUnits() {
		return SIUnit.MagneticFieldStrength;
	}
}

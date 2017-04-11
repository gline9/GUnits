package gunits.unit.derived;

import gunits.unit.SIUnit;
import gunits.unit.ScalarConversion;

public enum Capacitance implements ScalarConversion{
	FARADS(Charge.COULOMBS.per(Voltage.VOLTS).fromBasal(1)),
	DEKAFARADS(FARADS.cora / 10),
	HECTOFARADS(DEKAFARADS.cora / 10),
	KILOFARADS(FARADS.cora / 1000),
	MEGAFARADS(KILOFARADS.cora / 1000),
	GIGAFARADS(MEGAFARADS.cora / 1000),
	TERAFARADS(GIGAFARADS.cora / 1000),
	PETAFARADS(TERAFARADS.cora / 1000),
	EXAFARADS(PETAFARADS.cora / 1000),
	ZETTAFARADS(EXAFARADS.cora / 1000),
	YOTTAFARADS(ZETTAFARADS.cora / 1000),
	DECAFARADS(FARADS.cora * 10),
	CENTIFARADS(DECAFARADS.cora * 10),
	MILLIFARADS(CENTIFARADS.cora * 10),
	MICROFARADS(MILLIFARADS.cora * 1000),
	NANOFARADS(MICROFARADS.cora * 1000),
	PICOFARADS(NANOFARADS.cora * 1000),
	FEMTOFARADS(PICOFARADS.cora * 1000),
	ATTOFARADS(FEMTOFARADS.cora * 1000),
	ZEPTOFARADS(ATTOFARADS.cora * 1000),
	YOCTOFARADS(ZEPTOFARADS.cora * 1000);
	
	private final double cora;

	private Capacitance(double conversionRatio) {
		cora = conversionRatio;
	}

	public double getConversionRatio() {
		return cora;
	}

	public final SIUnit getUnits() {
		return SIUnit.ElectricalCapacitance;
	}
}

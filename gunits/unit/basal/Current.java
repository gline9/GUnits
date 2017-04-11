package gunits.unit.basal;

import gunits.unit.SIUnit;
import gunits.unit.ScalarConversion;

public enum Current implements ScalarConversion{
	
	AMPS(1),
	DEKAAMPS(AMPS.cora / 10),
	HECTOAMPS(DEKAAMPS.cora / 10),
	KILOAMPS(AMPS.cora / 1000),
	MEGAAMPS(KILOAMPS.cora / 1000),
	GIGAAMPS(MEGAAMPS.cora / 1000),
	TERAAMPS(GIGAAMPS.cora / 1000),
	PETAAMPS(TERAAMPS.cora / 1000),
	EXAAMPS(PETAAMPS.cora / 1000),
	ZETTAAMPS(EXAAMPS.cora / 1000),
	YOTTAAMPS(ZETTAAMPS.cora / 1000),
	DECAAMPS(AMPS.cora * 10),
	CENTIAMPS(DECAAMPS.cora * 10),
	MILLIAMPS(CENTIAMPS.cora * 10),
	MICROAMPS(MILLIAMPS.cora * 1000),
	NANOAMPS(MICROAMPS.cora * 1000),
	PICOAMPS(NANOAMPS.cora * 1000),
	FEMTOAMPS(PICOAMPS.cora * 1000),
	ATTOAMPS(FEMTOAMPS.cora * 1000),
	ZEPTOAMPS(ATTOAMPS.cora * 1000),
	YOCTOAMPS(ZEPTOAMPS.cora * 1000);
	
	private final double cora;

	private Current(double conversionRatio) {
		cora = conversionRatio;
	}

	public double getConversionRatio() {
		return cora;
	}

	public final SIUnit getUnits() {
		return SIUnit.ElectricCurrent;
	}
}

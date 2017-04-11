package gunits.unit.derived;

import gunits.unit.SIUnit;
import gunits.unit.ScalarConversion;
import gunits.unit.basal.Current;

public enum Voltage implements ScalarConversion {
	VOLTS(Power.WATTS.per(Current.AMPS).fromBasal(1)),
	DEKAVOLTS(VOLTS.cora / 10),
	HECTOVOLTS(DEKAVOLTS.cora / 10),
	KILOVOLTS(VOLTS.cora / 1000),
	MEGAVOLTS(KILOVOLTS.cora / 1000),
	GIGAVOLTS(MEGAVOLTS.cora / 1000),
	TERAVOLTS(GIGAVOLTS.cora / 1000),
	PETAVOLTS(TERAVOLTS.cora / 1000),
	EXAVOLTS(PETAVOLTS.cora / 1000),
	ZETTAVOLTS(EXAVOLTS.cora / 1000),
	YOTTAVOLTS(ZETTAVOLTS.cora / 1000),
	DECAVOLTS(VOLTS.cora * 10),
	CENTIVOLTS(DECAVOLTS.cora * 10),
	MILLIVOLTS(CENTIVOLTS.cora * 10),
	MICROVOLTS(MILLIVOLTS.cora * 1000),
	NANOVOLTS(MICROVOLTS.cora * 1000),
	PICOVOLTS(NANOVOLTS.cora * 1000),
	FEMTOVOLTS(PICOVOLTS.cora * 1000),
	ATTOVOLTS(FEMTOVOLTS.cora * 1000),
	ZEPTOVOLTS(ATTOVOLTS.cora * 1000),
	YOCTOVOLTS(ZEPTOVOLTS.cora * 1000);

	private final double cora;

	private Voltage(double conversionRatio) {
		cora = conversionRatio;
	}

	public double getConversionRatio() {
		return cora;
	}

	public final SIUnit getUnits() {
		return SIUnit.Voltage;
	}
}

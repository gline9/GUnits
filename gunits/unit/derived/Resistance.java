package gunits.unit.derived;

import gunits.unit.SIUnit;
import gunits.unit.ScalarConversion;
import gunits.unit.basal.Current;

public enum Resistance implements ScalarConversion {
	OHMS(Voltage.VOLTS.per(Current.AMPS).fromBasal(1)),
	DEKAOHMS(OHMS.cora / 10),
	HECTOOHMS(DEKAOHMS.cora / 10),
	KILOOHMS(OHMS.cora / 1000),
	MEGAOHMS(KILOOHMS.cora / 1000),
	GIGAOHMS(MEGAOHMS.cora / 1000),
	TERAOHMS(GIGAOHMS.cora / 1000),
	PETAOHMS(TERAOHMS.cora / 1000),
	EXAOHMS(PETAOHMS.cora / 1000),
	ZETTAOHMS(EXAOHMS.cora / 1000),
	YOTTAOHMS(ZETTAOHMS.cora / 1000),
	DECAOHMS(OHMS.cora * 10),
	CENTIOHMS(DECAOHMS.cora * 10),
	MILLIOHMS(CENTIOHMS.cora * 10),
	MICROOHMS(MILLIOHMS.cora * 1000),
	NANOOHMS(MICROOHMS.cora * 1000),
	PICOOHMS(NANOOHMS.cora * 1000),
	FEMTOOHMS(PICOOHMS.cora * 1000),
	ATTOOHMS(FEMTOOHMS.cora * 1000),
	ZEPTOOHMS(ATTOOHMS.cora * 1000),
	YOCTOOHMS(ZEPTOOHMS.cora * 1000);
	
	private final double cora;

	private Resistance(double conversionRatio) {
		cora = conversionRatio;
	}

	public double getConversionRatio() {
		return cora;
	}

	public final SIUnit getUnits() {
		return SIUnit.ElectricalResistance;
	}
}

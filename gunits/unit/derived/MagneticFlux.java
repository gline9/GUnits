package gunits.unit.derived;

import gunits.unit.SIUnit;
import gunits.unit.ScalarConversion;
import gunits.unit.basal.Time;

public enum MagneticFlux implements ScalarConversion {
	WEBERS(Voltage.VOLTS.m(Time.SECONDS).fromBasal(1)),
	DEKAWEBERS(WEBERS.cora / 10),
	HECTOWEBERS(DEKAWEBERS.cora / 10),
	KILOWEBERS(WEBERS.cora / 1000),
	MEGAWEBERS(KILOWEBERS.cora / 1000),
	GIGAWEBERS(MEGAWEBERS.cora / 1000),
	TERAWEBERS(GIGAWEBERS.cora / 1000),
	PETAWEBERS(TERAWEBERS.cora / 1000),
	EXAWEBERS(PETAWEBERS.cora / 1000),
	ZETTAWEBERS(EXAWEBERS.cora / 1000),
	YOTTAWEBERS(ZETTAWEBERS.cora / 1000),
	DECAWEBERS(WEBERS.cora * 10),
	CENTIWEBERS(DECAWEBERS.cora * 10),
	MILLIWEBERS(CENTIWEBERS.cora * 10),
	MICROWEBERS(MILLIWEBERS.cora * 1000),
	NANOWEBERS(MICROWEBERS.cora * 1000),
	PICOWEBERS(NANOWEBERS.cora * 1000),
	FEMTOWEBERS(PICOWEBERS.cora * 1000),
	ATTOWEBERS(FEMTOWEBERS.cora * 1000),
	ZEPTOWEBERS(ATTOWEBERS.cora * 1000),
	YOCTOWEBERS(ZEPTOWEBERS.cora * 1000);

	private final double cora;

	private MagneticFlux(double conversionRatio) {
		cora = conversionRatio;
	}

	public double getConversionRatio() {
		return cora;
	}

	public final SIUnit getUnits() {
		return SIUnit.MagneticFlux;
	}
}

package gunits.unit.derived;

import gunits.unit.SIUnit;
import gunits.unit.ScalarConversion;
import gunits.unit.basal.Current;

public enum Inductance implements ScalarConversion {
	HENRIES(MagneticFlux.WEBERS.per(Current.AMPS).fromBasal(1)),
	DEKAHENRIES(HENRIES.cora / 10),
	HECTOHENRIES(DEKAHENRIES.cora / 10),
	KILOHENRIES(HENRIES.cora / 1000),
	MEGAHENRIES(KILOHENRIES.cora / 1000),
	GIGAHENRIES(MEGAHENRIES.cora / 1000),
	TERAHENRIES(GIGAHENRIES.cora / 1000),
	PETAHENRIES(TERAHENRIES.cora / 1000),
	EXAHENRIES(PETAHENRIES.cora / 1000),
	ZETTAHENRIES(EXAHENRIES.cora / 1000),
	YOTTAHENRIES(ZETTAHENRIES.cora / 1000),
	DECAHENRIES(HENRIES.cora * 10),
	CENTIHENRIES(DECAHENRIES.cora * 10),
	MILLIHENRIES(CENTIHENRIES.cora * 10),
	MICROHENRIES(MILLIHENRIES.cora * 1000),
	NANOHENRIES(MICROHENRIES.cora * 1000),
	PICOHENRIES(NANOHENRIES.cora * 1000),
	FEMTOHENRIES(PICOHENRIES.cora * 1000),
	ATTOHENRIES(FEMTOHENRIES.cora * 1000),
	ZEPTOHENRIES(ATTOHENRIES.cora * 1000),
	YOCTOHENRIES(ZEPTOHENRIES.cora * 1000);

	private final double cora;

	private Inductance(double conversionRatio) {
		cora = conversionRatio;
	}

	public double getConversionRatio() {
		return cora;
	}

	public final SIUnit getUnits() {
		return SIUnit.Inductance;
	}
}

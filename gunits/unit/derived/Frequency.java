package gunits.unit.derived;

import gunits.unit.MKSUnit;
import gunits.unit.SIUnit;
import gunits.unit.ScalarConversion;
import gunits.unit.basal.Time;

public enum Frequency implements ScalarConversion {
	HERTZ(1 / Time.SECONDS.fromBasal(1)),
	DEKAHERTZ(HERTZ.cora / 10),
	HECTOHERTZ(DEKAHERTZ.cora / 10),
	KILOHERTZ(HERTZ.cora / 1000),
	MEGAHERTZ(KILOHERTZ.cora / 1000),
	GIGAHERTZ(MEGAHERTZ.cora / 1000),
	TERAHERTZ(GIGAHERTZ.cora / 1000),
	PETAHERTZ(TERAHERTZ.cora / 1000),
	EXAHERTZ(PETAHERTZ.cora / 1000),
	ZETTAHERTZ(EXAHERTZ.cora / 1000),
	YOTTAHERTZ(ZETTAHERTZ.cora / 1000),
	DECAHERTZ(HERTZ.cora * 10),
	CENTIHERTZ(DECAHERTZ.cora * 10),
	MILLIHERTZ(CENTIHERTZ.cora * 10),
	MICROHERTZ(MILLIHERTZ.cora * 1000),
	NANOHERTZ(MICROHERTZ.cora * 1000),
	PICOHERTZ(NANOHERTZ.cora * 1000),
	FEMTOHERTZ(PICOHERTZ.cora * 1000),
	ATTOHERTZ(FEMTOHERTZ.cora * 1000),
	ZEPTOHERTZ(ATTOHERTZ.cora * 1000),
	YOCTOHERTZ(ZEPTOHERTZ.cora * 1000),
	PERMINUTE(HERTZ.cora * 60),
	PERHOUR(PERMINUTE.cora * 60),
	PERDAY(PERHOUR.cora * 24),
	PERYEAR(PERDAY.cora * 365.24219907407D),
	PERDECADE(PERYEAR.cora * 10),
	PERCENTURY(PERDECADE.cora * 10),
	PERMILLENNIUM(PERCENTURY.cora * 10);

	private final double cora;

	private Frequency(double conversionRatio) {
		cora = conversionRatio;
	}

	@Override
	public double getConversionRatio() {
		return cora;
	}

	@Override
	public SIUnit getUnits() {
		return MKSUnit.Frequency;
	}
}

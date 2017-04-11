package gunits.unit.derived;

import gunits.unit.SIUnit;
import gunits.unit.ScalarConversion;
import gunits.unit.basal.Current;

public enum Conductance implements ScalarConversion {
	SIEMENS(Current.AMPS.per(Voltage.VOLTS).fromBasal(1)),
	DEKASIEMENS(SIEMENS.cora / 10),
	HECTOSIEMENS(DEKASIEMENS.cora / 10),
	KILOSIEMENS(SIEMENS.cora / 1000),
	MEGASIEMENS(KILOSIEMENS.cora / 1000),
	GIGASIEMENS(MEGASIEMENS.cora / 1000),
	TERASIEMENS(GIGASIEMENS.cora / 1000),
	PETASIEMENS(TERASIEMENS.cora / 1000),
	EXASIEMENS(PETASIEMENS.cora / 1000),
	ZETTASIEMENS(EXASIEMENS.cora / 1000),
	YOTTASIEMENS(ZETTASIEMENS.cora / 1000),
	DECASIEMENS(SIEMENS.cora * 10),
	CENTISIEMENS(DECASIEMENS.cora * 10),
	MILLISIEMENS(CENTISIEMENS.cora * 10),
	MICROSIEMENS(MILLISIEMENS.cora * 1000),
	NANOSIEMENS(MICROSIEMENS.cora * 1000),
	PICOSIEMENS(NANOSIEMENS.cora * 1000),
	FEMTOSIEMENS(PICOSIEMENS.cora * 1000),
	ATTOSIEMENS(FEMTOSIEMENS.cora * 1000),
	ZEPTOSIEMENS(ATTOSIEMENS.cora * 1000),
	YOCTOSIEMENS(ZEPTOSIEMENS.cora * 1000);

	private final double cora;

	private Conductance(double conversionRatio) {
		cora = conversionRatio;
	}

	public double getConversionRatio() {
		return cora;
	}

	public final SIUnit getUnits() {
		return SIUnit.ElectricalConductance;
	}
}

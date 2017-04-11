package gunits.unit.derived;

import gunits.unit.SIUnit;
import gunits.unit.ScalarConversion;
import gunits.unit.basal.Current;
import gunits.unit.basal.Time;

public enum Charge implements ScalarConversion{
	COULOMBS(Time.SECONDS.m(Current.AMPS).fromBasal(1)),
	DEKACOULOMBS(COULOMBS.cora / 10),
	HECTOCOULOMBS(DEKACOULOMBS.cora / 10),
	KILOCOULOMBS(COULOMBS.cora / 1000),
	MEGACOULOMBS(KILOCOULOMBS.cora / 1000),
	GIGACOULOMBS(MEGACOULOMBS.cora / 1000),
	TERACOULOMBS(GIGACOULOMBS.cora / 1000),
	PETACOULOMBS(TERACOULOMBS.cora / 1000),
	EXACOULOMBS(PETACOULOMBS.cora / 1000),
	ZETTACOULOMBS(EXACOULOMBS.cora / 1000),
	YOTTACOULOMBS(ZETTACOULOMBS.cora / 1000),
	DECACOULOMBS(COULOMBS.cora * 10),
	CENTICOULOMBS(DECACOULOMBS.cora * 10),
	MILLICOULOMBS(CENTICOULOMBS.cora * 10),
	MICROCOULOMBS(MILLICOULOMBS.cora * 1000),
	NANOCOULOMBS(MICROCOULOMBS.cora * 1000),
	PICOCOULOMBS(NANOCOULOMBS.cora * 1000),
	FEMTOCOULOMBS(PICOCOULOMBS.cora * 1000),
	ATTOCOULOMBS(FEMTOCOULOMBS.cora * 1000),
	ZEPTOCOULOMBS(ATTOCOULOMBS.cora * 1000),
	YOCTOCOULOMBS(ZEPTOCOULOMBS.cora * 1000);
	
	private final double cora;

	private Charge(double conversionRatio) {
		cora = conversionRatio;
	}

	public double getConversionRatio() {
		return cora;
	}

	public final SIUnit getUnits() {
		return SIUnit.ElectricCharge;
	}
}

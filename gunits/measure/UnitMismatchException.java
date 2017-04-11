package gunits.measure;

import gunits.unit.SIUnit;

public class UnitMismatchException extends IllegalArgumentException {
	private static final long serialVersionUID = 1L;

	public UnitMismatchException() {
		super("Exception when trying to convert units using improper unit dimension!");
	}

	public UnitMismatchException(SIUnit unitfrom, SIUnit unitto) {
		super("Cannot convert from " + unitfrom + " to " + unitto + "!");
	}

	public UnitMismatchException(String message) {
		super(message);
	}

}

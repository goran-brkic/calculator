package hr.fer.zemris.java.gui.layouts;

/**
 * An exception generated by a fault in the calculator.
 * @author Goran
 *
 */
public class CalcLayoutException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public CalcLayoutException () {
    }

    public CalcLayoutException (String message) {
        super (message);
    }

    public CalcLayoutException (Throwable cause) {
        super (cause);
    }

    public CalcLayoutException (String message, Throwable cause) {
        super (message, cause);
    }
}
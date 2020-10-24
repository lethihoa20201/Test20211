package entity.exception;

/**
 * The ViewCartException wraps all unchecked exceptions You can use this
 * exception to inform negative quantity in Media products
 * 
 * @author nguyenlm
 */
public class ViewCartException extends RuntimeException {

	private static final long serialVersionUID = 1091337136123906298L;

	public ViewCartException() {

	}

	public ViewCartException(String message) {
		super(message);
	}

}

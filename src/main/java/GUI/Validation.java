package GUI;

public class Validation {

	private boolean valid;
	private String error;

	public Validation(boolean valid) {
		this(valid, "");
	}

	public Validation(boolean valid, String error) {
		this.valid = valid;
		this.error = error;
	}

	public boolean isValid() {
		return valid;
	}

	public String getError() {
		return error;
	}

}

package ders4_odev3.utils.result;

public class SuccessResult implements Result {
	private boolean success;
	private String message;
	
	public SuccessResult() {
		this.success = true;
	}
	
	public SuccessResult(Boolean success, String message) {
		this();
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public String getMessage() {
		return message;
	}
	
}
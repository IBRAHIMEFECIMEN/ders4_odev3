package ders4_odev3.utils.result;

public class ErrorResult implements Result {
	private final boolean success;
	private String message;
	
	public ErrorResult() {
		this.success = false;
	}
		
	public ErrorResult(String message) {
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
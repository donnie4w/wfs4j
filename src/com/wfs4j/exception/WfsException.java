package com.wfs4j.exception;

public class WfsException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 0;
	private Throwable cause;

	/**
	 * Constructs a JSONException with an explanatory message.
	 * 
	 * @param message
	 *            Detail about the reason for the exception.
	 */
	public WfsException(String message) {
		super(message);
	}

	public WfsException(Throwable t) {
		super(t.getMessage());
		this.cause = t;
	}

	public Throwable getCause() {
		return this.cause;
	}
}

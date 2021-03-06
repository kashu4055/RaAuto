package com.raauto.core.exceptions;

import org.openqa.selenium.NoSuchElementException;

/**
 * The Class RaAutoElementNotFound.
 * This exception is thrown by {@link ActionHandler} class when they
 * fail to find an element with given descriptor and after waiting for desired duration
 * 
 * @author Laxmikant Birajdar
 */
public class RaAutoElementNotFound extends NoSuchElementException {

	/** The error. */
	String error = "";

	/**
	 * Instantiates a new RaAutoElementNotFound exception
	 *
	 * @param by
	 *            the by
	 * @param locator
	 *            the locator
	 */
	public RaAutoElementNotFound(String by, String locator) {

		super("After waiting for defulat time, failed to find element with by="
				+ by + " & locator=" + locator);
		error = "After waiting for defulat time, failed to find element with by="
				+ by + " & locator=" + locator;

	}

	public String getError() {
		return error;
	}

}

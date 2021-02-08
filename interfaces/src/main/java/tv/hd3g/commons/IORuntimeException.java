package tv.hd3g.commons;

import java.io.IOException;

public class IORuntimeException extends RuntimeException {

	public IORuntimeException(final String message) {
		super(message);
	}

	public IORuntimeException(final IOException cause) {
		super(cause);
	}

	public IORuntimeException(final String message, final IOException cause) {
		super(message, cause);
	}
}

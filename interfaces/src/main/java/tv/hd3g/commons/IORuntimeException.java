package tv.hd3g.commons;

import java.io.IOException;

/**
 * @deprecated Please replace by UncheckedIOException
 */
@Deprecated(since = "3.2.0", forRemoval = true)
public class IORuntimeException extends RuntimeException { // NOSONAR S1123

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

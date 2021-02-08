package tv.hd3g.commons;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class IORuntimeExceptionTest {

	String message;
	@Mock
	IOException cause;

	@BeforeEach
	public void init() throws Exception {
		MockitoAnnotations.openMocks(this).close();
		message = String.valueOf(System.nanoTime());
	}

	@Test
	void testIORuntimeExceptionThrowable() {
		final var iORuntimeException = new IORuntimeException(cause);
		assertEquals("cause", iORuntimeException.getMessage());
		assertEquals(cause, iORuntimeException.getCause());
	}

	@Test
	void testIORuntimeExceptionStringThrowable() {
		final var iORuntimeException = new IORuntimeException(message, cause);
		assertEquals(message, iORuntimeException.getMessage());
		assertEquals(cause, iORuntimeException.getCause());
	}

	@Test
	void testIORuntimeExceptionString() {
		final var iORuntimeException = new IORuntimeException(message);
		assertEquals(message, iORuntimeException.getMessage());
		assertNull(iORuntimeException.getCause());
	}

}

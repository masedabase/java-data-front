/*
 * Copyright (C) momchil-atanasov.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.momchil_atanasov.data.front.error;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import com.momchil_atanasov.data.front.error.WFSizeException;

public class WFSizeExceptionTest extends AbstractWFExceptionTest {
	
	@Test
	public void testDefaultException() {
		final WFSizeException ex = new WFSizeException();
		assertNull(ex.getMessage());
		assertNull(ex.getCause());
	}
	
	@Test
	public void testExceptionWithMessage() {
		final WFSizeException ex = new WFSizeException(MESSAGE);
		assertEquals(MESSAGE, ex.getMessage());
	}
	
	@Test
	public void testExceptionWithCause() {
		final WFSizeException ex = new WFSizeException(CAUSE);
		assertSame(CAUSE, ex.getCause());
	}
	
	@Test
	public void testExceptionWithMessageAndCause() {
		final WFSizeException ex = new WFSizeException(MESSAGE, CAUSE);
		assertEquals(MESSAGE, ex.getMessage());
		assertSame(CAUSE, ex.getCause());
	}

}

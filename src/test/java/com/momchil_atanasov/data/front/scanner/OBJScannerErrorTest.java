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

package com.momchil_atanasov.data.front.scanner;

import org.junit.Test;

import com.momchil_atanasov.data.front.error.WFCorruptException;
import com.momchil_atanasov.data.front.stub.OBJContentScannerHandler;
import com.momchil_atanasov.data.front.test.WFResourceFixture;

public class OBJScannerErrorTest {
	
	private final WFResourceFixture fixture = new WFResourceFixture();
	private final OBJContentScannerHandler handler = new OBJContentScannerHandler();
	
	@Test(expected = WFCorruptException.class)
	public void testMissingVertexData() throws Exception {
		fixture.scanOBJ("error_missing_vertex_data.obj", handler);
	}
	
	@Test(expected = WFCorruptException.class)
	public void testMissingTexCoordData() throws Exception {
		fixture.scanOBJ("error_missing_texcoord_data.obj", handler);
	}
	
	@Test(expected = WFCorruptException.class)
	public void testMissingNormalData() throws Exception {
		fixture.scanOBJ("error_missing_normal_data.obj", handler);
	}
	
	@Test(expected = WFCorruptException.class)
	public void testEmptyObjectName() throws Exception {
		fixture.scanOBJ("error_empty_object_name.obj", handler);
	}
	
	@Test(expected = WFCorruptException.class)
	public void testMissingMaterialLibraryData() throws Exception {
		fixture.scanOBJ("error_missing_material_library_data.obj", handler);
	}
	
	@Test(expected = WFCorruptException.class)
	public void testCorruptDataReference() throws Exception {
		fixture.scanOBJ("error_corrupt_data_reference.obj", handler);
	}
	
	@Test(expected = WFCorruptException.class)
	public void testCorruptVertex() throws Exception {
		fixture.scanOBJ("error_corrupt_vertex.obj", handler);
	}

}

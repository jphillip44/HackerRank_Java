/*******************************************************************************
 * Copyright 2015 Francesco Cina'
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package ufo.hackerrank.java.introduction;

import org.junit.Test;

import ufo.BaseTest;

public class Stdin_And_Stdout_2_Test extends BaseTest {

	@Test
	public void test() throws Exception {

		setInput( "42",
				  "3.1415",
				  "Welcome to Hackerrank Java tutorials!" );

		Stdin_And_Stdout_2.main(new String[]{});

		verifyOutput( "String: Welcome to Hackerrank Java tutorials!",
				      "Double: 3.1415",
				      "Int: 42" );

	}

}

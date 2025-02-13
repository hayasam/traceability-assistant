/**
 * Copyright 2015 UNICEN. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.isistan.carcha;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * SVD test class.
 */
public class SVDTest {
	
	/** The logger. */
	private static final Log logger = LogFactory.getLog(SVDTest.class);

	@Test
	public final void testIfSVDIsInstalled(){
		try {
			Runtime.getRuntime().exec("svd");
		} catch (Exception e) {
			logger.error("svd is not installed", e);
			Assert.fail("svd is not installed");
		}
	}
}

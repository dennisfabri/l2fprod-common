/**
 * @PROJECT.FULLNAME@ @VERSION@ License.
 *
 * Copyright @YEAR@ L2FProd.com
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
package com.l2fprod.common.shared.util;

import java.util.ListResourceBundle;

import com.l2fprod.common.shared.util.ResourceManager;

import junit.framework.TestCase;

/**
 * ResourceManagerUnitTest. <br>
 */
public class ResourceManagerUnitTest extends TestCase {

    public ResourceManagerUnitTest(String arg0) {
        super(arg0);
    }

    public void testAll() {
        ResourceManager rm = ResourceManager.get(Bundle.class);
        assertEquals("value", rm.getString("key"));
        assertEquals("value", rm.getString("nestedKey"));
        assertEquals("value formatted", rm.getString("format", new Object[] { "formatted" }));

        assertEquals("value", ResourceManager.resolve("value"));
        assertEquals("value",
                ResourceManager.resolve("${com.l2fprod.common.shared.util.ResourceManagerUnitTest$BundleRB:key}"));
        assertEquals("value formatted",
                ResourceManager.resolve("${com.l2fprod.common.shared.util.ResourceManagerUnitTest$BundleRB:format}",
                        new Object[] { "formatted" }));
    }

    public static class Bundle {
    }

    public static class BundleRB extends ListResourceBundle {

        protected Object[][] getContents() {
            return new Object[][] { { "key", "value" },
                    { "nestedKey", "${com.l2fprod.common.shared.util.ResourceManagerUnitTest$BundleRB:key}" },
                    { "format", "value {0}" } };
        }
    }
}
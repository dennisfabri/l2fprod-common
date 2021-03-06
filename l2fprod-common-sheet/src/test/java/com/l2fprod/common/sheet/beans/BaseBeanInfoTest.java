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
package com.l2fprod.common.sheet.beans;

import junit.framework.TestCase;

/**
 * BaseBeanInfoTest. <br>
 * 
 */
public class BaseBeanInfoTest extends TestCase {

    public BaseBeanInfoTest(String name) {
        super(name);
    }

    public void testAddRemove() {
        class Test {
            public void setName(String s) {
            }

            public String getName() {
                return "";
            }

            public void setCity(String s) {
            }

            public String getCity() {
                return "";
            }
        }
        BaseBeanInfo bean = new BaseBeanInfo(Test.class);
        bean.addProperty("name");
        bean.addProperty("city");
        assertEquals(2, bean.getPropertyDescriptorCount());
        assertNotNull(bean.removeProperty("name"));
        assertEquals(1, bean.getPropertyDescriptorCount());
        assertNull(bean.removeProperty("name"));
        assertNotNull(bean.removeProperty("city"));
        assertEquals(0, bean.getPropertyDescriptorCount());
    }

}

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
package com.l2fprod.common.fontchooser.plaf;

import java.util.Arrays;
import java.util.List;

import com.l2fprod.common.shared.swing.plaf.AbstractComponentAddon;
import com.l2fprod.common.shared.swing.plaf.LookAndFeelAddons;

/**
 * Addon for the <code>JFontChooser</code>.<br>
 * 
 */
public class JFontChooserAddon extends AbstractComponentAddon {

    public JFontChooserAddon() {
        super("JFontChooser");
    }

    protected void addBasicDefaults(LookAndFeelAddons addon, List defaults) {
        defaults.addAll(
                Arrays.asList(new Object[] { "FontChooserUI", getPackagename() + ".basic.BasicFontChooserUI" }));
    }

    protected void addWindowsDefaults(LookAndFeelAddons addon, List defaults) {
        defaults.addAll(
                Arrays.asList(new Object[] { "FontChooserUI", getPackagename() + ".windows.WindowsFontChooserUI", }));
    }

    private String getPackagename() {
        return this.getClass().getPackage().getName();
    }

}

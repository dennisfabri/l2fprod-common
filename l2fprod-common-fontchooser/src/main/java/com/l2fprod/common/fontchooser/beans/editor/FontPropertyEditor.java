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
package com.l2fprod.common.fontchooser.beans.editor;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.l2fprod.common.fontchooser.JFontChooser;
import com.l2fprod.common.shared.beans.editor.AbstractPropertyEditor;
import com.l2fprod.common.shared.swing.ComponentFactory;
import com.l2fprod.common.shared.swing.PercentLayout;
import com.l2fprod.common.shared.swing.renderer.DefaultCellRenderer;
import com.l2fprod.common.shared.util.ResourceManager;

/**
 * FontPropertyEditor.<br>
 *
 */
public class FontPropertyEditor extends AbstractPropertyEditor {

    private DefaultCellRenderer label;
    private JButton button;
    private Font font;

    public FontPropertyEditor() {
        editor = new JPanel(new PercentLayout(PercentLayout.HORIZONTAL, 0));
        ((JPanel) editor).add("*", label = new DefaultCellRenderer());
        label.setOpaque(false);
        ((JPanel) editor).add(button = ComponentFactory.Helper.getFactory().createMiniButton());
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selectFont();
            }
        });
        ((JPanel) editor).add(button = ComponentFactory.Helper.getFactory().createMiniButton());
        button.setText("X");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selectNull();
            }
        });
        ((JPanel) editor).setOpaque(false);
    }

    public Object getValue() {
        return font;
    }

    public void setValue(Object value) {
        font = (Font) value;
        label.setValue(value);
    }

    protected void selectFont() {
        ResourceManager rm = ResourceManager.all(FontPropertyEditor.class);
        String title = rm.getString("FontPropertyEditor.title");

        Font selectedFont = JFontChooser.showDialog(editor, title, font);

        if (selectedFont != null) {
            Font oldFont = font;
            Font newFont = selectedFont;
            label.setValue(newFont);
            font = newFont;
            firePropertyChange(oldFont, newFont);
        }
    }

    protected void selectNull() {
        Object oldFont = font;
        label.setValue(null);
        font = null;
        firePropertyChange(oldFont, null);
    }

}

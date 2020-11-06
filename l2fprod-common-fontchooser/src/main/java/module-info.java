module com.l2fprod.common.fontchooser {
    exports com.l2fprod.common.fontchooser.beans.editor;
    exports com.l2fprod.common.fontchooser.plaf.basic;
    exports com.l2fprod.common.fontchooser.plaf;
    exports com.l2fprod.common.fontchooser.plaf.windows;
    exports com.l2fprod.common.fontchooser;

    requires java.desktop;
    requires com.l2fprod.common.shared;
}
module com.l2fprod.common.sandbox {
    exports com.l2fprod.common.sandbox.application;
    exports com.l2fprod.common.sandbox.application.core;
    exports com.l2fprod.common.sandbox.util;
    exports com.l2fprod.common.sandbox.swing.table;
    exports com.l2fprod.common.sandbox.swing.list;
    exports com.l2fprod.common.sandbox.util.filtering;
    exports com.l2fprod.common.sandbox.application.selection;
    exports com.l2fprod.common.sandbox.swing;
    exports com.l2fprod.common.sandbox.application.document;

    requires java.desktop;
    requires java.logging;
    requires java.xml;
    requires com.l2fprod.common.shared;
}
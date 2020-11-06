module com.l2fprod.common.demo {
    exports com.l2fprod.common.demo;
    exports com.l2fprod.common.demo.tasks;

    requires java.desktop;
    requires java.prefs;
    requires com.l2fprod.common.buttonbar;
    requires com.l2fprod.common.directorychooser;
    requires com.l2fprod.common.fontchooser;
    requires com.l2fprod.common.outlookbar;
    requires com.l2fprod.common.shared;
    requires com.l2fprod.common.sheet;
    requires com.l2fprod.common.tasks;
    requires com.l2fprod.common.totd;
}
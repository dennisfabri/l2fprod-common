module com.l2fprod.common.directorychooser {
    exports com.l2fprod.common.directorychooser.plaf;
    exports com.l2fprod.common.directorychooser;
    exports com.l2fprod.common.directorychooser.plaf.windows;
    exports com.l2fprod.common.directorychooser.tree;

    requires java.desktop;
    requires com.l2fprod.common.shared;
}
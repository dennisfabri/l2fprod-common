module com.l2fprod.common.tasks {
    exports com.l2fprod.common.tasks.plaf.misc;
    exports com.l2fprod.common.tasks.plaf;
    exports com.l2fprod.common.tasks.plaf.metal;
    exports com.l2fprod.common.tasks.icons;
    exports com.l2fprod.common.tasks.plaf.windows;
    exports com.l2fprod.common.tasks.plaf.basic;
    exports com.l2fprod.common.tasks;

    requires java.desktop;
    requires com.l2fprod.common.shared;
}
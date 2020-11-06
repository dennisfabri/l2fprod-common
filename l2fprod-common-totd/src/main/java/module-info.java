module com.l2fprod.common.totd {
    exports com.l2fprod.common.totd.plaf.basic;
    exports com.l2fprod.common.totd.tips;
    exports com.l2fprod.common.totd;
    exports com.l2fprod.common.totd.plaf;
    exports com.l2fprod.common.totd.plaf.windows;

    requires java.desktop;
    requires java.prefs;
    requires com.l2fprod.common.shared;
}
module com.l2fprod.common.sheet {
    exports com.l2fprod.common.sheet.beans.editor;
    exports com.l2fprod.common.sheet.swing;
    exports com.l2fprod.common.sheet;
    exports com.l2fprod.common.sheet.beans;

    requires java.datatransfer;
    requires java.desktop;
    requires jcalendar;
    requires com.l2fprod.common.shared;
    requires nachocalendar;
}
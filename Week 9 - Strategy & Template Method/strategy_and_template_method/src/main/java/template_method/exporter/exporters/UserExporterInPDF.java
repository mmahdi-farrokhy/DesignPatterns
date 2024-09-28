package template_method.exporter.exporters;

import template_method.exporter.User;
import template_method.exporter.UserExporter;

import java.util.List;

public class UserExporterInPDF extends UserExporter {
    @Override
    protected void process(List<User> users) {
        System.out.println("UserExporterInPDF: process data and export a .pdf file");
    }
}

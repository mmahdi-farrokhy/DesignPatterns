package template_method.exporter.exporters;

import template_method.exporter.User;
import template_method.exporter.UserExporter;

import java.util.List;

public class UserExporterInExcel extends UserExporter {
    @Override
    protected void process(List<User> users) {
        System.out.println("UserExporterInExcel: process data and export a .pdf file");
    }
}

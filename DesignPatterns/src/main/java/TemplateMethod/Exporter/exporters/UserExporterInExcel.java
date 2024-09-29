package TemplateMethod.Exporter.exporters;

import TemplateMethod.Exporter.User;
import TemplateMethod.Exporter.UserExporter;

import java.util.List;

public class UserExporterInExcel extends UserExporter {
    @Override
    protected void process(List<User> users) {
        System.out.println("UserExporterInExcel: process data and export a .pdf file");
    }
}

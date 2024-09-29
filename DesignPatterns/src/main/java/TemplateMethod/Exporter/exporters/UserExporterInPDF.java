package TemplateMethod.Exporter.exporters;

import TemplateMethod.Exporter.User;
import TemplateMethod.Exporter.UserExporter;

import java.util.List;

public class UserExporterInPDF extends UserExporter {
    @Override
    protected void process(List<User> users) {
        System.out.println("UserExporterInPDF: process data and export a .pdf file");
    }
}

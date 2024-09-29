package Decorator.Report;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class ReportDecorator implements ReportGenerator {
    ReportGenerator reportGenerator;

    @Override
    public Report generate() {
        return reportGenerator.generate();
    }

    @Override
    public String getContent() {
        return reportGenerator.getContent();
    }
}

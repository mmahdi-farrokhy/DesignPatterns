package Decorator.Report;

public abstract class ReportDecorator implements ReportGenerator {
    ReportGenerator reportGenerator;

    public ReportDecorator(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    @Override
    public Report generate() {
        return reportGenerator.generate();
    }

    @Override
    public String getContent() {
        return reportGenerator.getContent();
    }
}

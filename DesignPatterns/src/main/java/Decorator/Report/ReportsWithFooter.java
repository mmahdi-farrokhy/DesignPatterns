package Decorator.Report;

public class ReportsWithFooter extends ReportDecorator {
    private String footer;

    public ReportsWithFooter(ReportGenerator reportGenerator, String footer) {
        super(reportGenerator);
        this.footer = footer;
    }

    @Override
    public Report generate() {
        return super.generate();
    }

    @Override
    public String getContent() {
        return super.getContent() + " " + footer;
    }
}

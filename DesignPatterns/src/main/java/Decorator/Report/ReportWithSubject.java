package Decorator.Report;

public class ReportWithSubject extends ReportDecorator {
    private String subject;

    public ReportWithSubject(ReportGenerator reportGenerator, String subject) {
        super(reportGenerator);
        this.subject = subject;
    }

    @Override
    public Report generate() {
        return super.generate();
    }

    @Override
    public String getContent() {
        return super.getContent() + " " + subject;
    }
}

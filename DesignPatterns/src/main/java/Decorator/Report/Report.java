package Decorator.Report;

public class Report implements ReportGenerator {
    private final String title;
    private final String content;

    public Report(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public Report generate() {
        return this;
    }

    @Override
    public String getContent() {
        return null;
    }
}

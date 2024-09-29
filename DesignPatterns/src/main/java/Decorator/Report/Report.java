package Decorator.Report;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Report implements ReportGenerator {
    private final String title;
    private final String content;

    @Override
    public Report generate() {
        return this;
    }

    @Override
    public String getContent() {
        return null;
    }
}

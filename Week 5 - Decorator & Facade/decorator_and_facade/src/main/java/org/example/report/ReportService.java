package org.example.report;

public class ReportService {
    private final Report report;

    public ReportService(Report report) {
        this.report = report;
    }

    public String getReportContent() {
        ReportWithSubject reportWithSubject = new ReportWithSubject(report, "Sales in 2024");
        ReportsWithFooter reportsWithFooter = new ReportsWithFooter(reportWithSubject, "Some important note");
        return reportsWithFooter.getContent();
    }
}

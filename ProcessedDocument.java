public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();
        System.out.println();

        Document pdf = registry.createPdfDocument("annual_report_2024.pdf", "Acme Corp", 150);
        pdf.open();
        System.out.println(pdf.getType() + "\n");

        Document text = registry.createTextDocument("meeting_notes.txt", "UTF-8", 250);
        text.open();
        System.out.println(text.getType() + "\n");

        Document spreadsheet = registry.createSpreadsheetDocument("sales_data_q1_xlsx", 1000, 20);
        spreadsheet.open();
        System.out.println(spreadsheet.getType() + "\n");

        Document anotherPdf = registry.createPdfDocument("summary_report.pdf", "Acme Corp", 30);
        anotherPdf.open();
    }
}
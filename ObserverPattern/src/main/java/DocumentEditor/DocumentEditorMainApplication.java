package DocumentEditor;

public class DocumentEditorMainApplication {

    public static void main(String[] args) {
        TextDocument document = new TextDocument();
        TextDocumentViewer viewer = new TextDocumentViewer(document);
        DocumentDetails documentDetails = new DocumentDetails(document);
        document.setText("this is first line\nthis is second line");
        document.setText("this has been updated\nthis is second line");

    }
}

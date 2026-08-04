package DocumentEditor;

public interface Document {

    void addDocumentViewer(DocumentViewer documentViewer);

    void removeDocumentViewer(DocumentViewer documentViewer);

    void notifyDocumentViewer();

}

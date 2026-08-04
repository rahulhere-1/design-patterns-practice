package DocumentEditor;

import java.util.ArrayList;
import java.util.List;

public class TextDocument implements Document {

    List<DocumentViewer> documentViewerList;

    TextDocument(){
        documentViewerList = new ArrayList<>();
    }

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        notifyDocumentViewer();
    }

    @Override
    public void addDocumentViewer(DocumentViewer documentViewer) {
        documentViewerList.add(documentViewer);
    }

    @Override
    public void removeDocumentViewer(DocumentViewer documentViewer) {
        documentViewerList.remove(documentViewer);
    }

    @Override
    public void notifyDocumentViewer() {

        for(DocumentViewer viewer: documentViewerList){
                viewer.update(text);
        }

    }
}

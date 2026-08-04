package DocumentEditor;

public class DocumentDetails implements DocumentViewer {
    String data;
    private Document document;

    public DocumentDetails(Document document){
        this.document = document;
        document.addDocumentViewer(this);
    }

    public void unSubscribeDocumentViewer(){
        document.removeDocumentViewer(this);
    }
    @Override
    public void update(String data) {
        this.data = data;
        display();
    }

    @Override
    public void display() {
        System.out.println("==============================================================");
        System.out.println("total characters: ".concat(Integer.toString(data.length())));
        System.out.println("==============================================================");
    }
}

interface Document {
    void open();
}

class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Word document.");
    }
}

class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF document.");
    }
}

class DocumentFactory {
    public static Document createDocument(String type) {
        if (type.equalsIgnoreCase("word")) {
            return new WordDocument();
        } else if (type.equalsIgnoreCase("pdf")) {
            return new PdfDocument();
        } else {
            return null;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Document doc1 = DocumentFactory.createDocument("word");
        doc1.open();

        Document doc2 = DocumentFactory.createDocument("pdf");
        doc2.open();
    }
}

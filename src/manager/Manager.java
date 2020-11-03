package manager;

import document.Document;

import javax.print.Doc;
import java.util.ArrayList;

public class Manager {
    private ArrayList<Document> documents = new ArrayList<>();
    public void add(Document doc){
        documents.add(doc);
    }
    public void read(){
        for (Document d:documents) {
            System.out.println(d.toString());
        }
    }
public void Search(String docId){
    for (Document doc:documents) {
        if (doc.getDocumentID().equals(docId)){
            System.out.println(doc.toString());
        }
    }
}
 }

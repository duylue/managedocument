package document;

import document.Document;

public class Book extends Document {
    private String nameAuthor;
    private int numberPages;

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + getName() + '\'' +
                ", documentID='" + getDocumentID() + '\'' +
                ", pCompany='" + getPCompany() +'\'' +
                ", indexVersion=" + getReleaseNumber() +
                ", nameAuthor='" + nameAuthor + '\'' +
                ", numberPages=" + numberPages +
                '}';
    }
}

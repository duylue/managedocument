package document;

import document.Document;

public class Journal extends Document {
    private int indexRelease;
    private int monthRelease;

    public int getIndexRelease() {
        return indexRelease;
    }

    public void setIndexRelease(int indexRelease) {
        this.indexRelease = indexRelease;
    }

    public int getMonthRelease() {
        return monthRelease;
    }

    public void setMonthRelease(int monthRelease) {
        this.monthRelease = monthRelease;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "name='" + getName() + '\'' +
                ", documentID='" + getDocumentID() + '\'' +
                ", pCompany='" + getPCompany() +'\'' +
                ", indexVersion=" + getReleaseNumber() +
                ", indexRelease=" + indexRelease +
                ", monthRelease=" + monthRelease +
                '}';
    }
}

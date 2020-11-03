package document;

public class Document {
    private String name;
    private String documentID;
    private String pCompany;
    private int releaseNumber;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDocumentID() {
        return documentID;
    }

    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    public String getPCompany() {
        return pCompany;
    }

    public void setPCompany(String pCompany) {
        this.pCompany = pCompany;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    @Override
    public String toString() {
        return "Document{" +
                "name='" + name + '\'' +
                ", documentID='" + documentID + '\'' +
                ", pCompany='" + pCompany + '\'' +
                ", indexVersion=" + releaseNumber +
                '}';
    }
}

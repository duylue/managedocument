package document;

import document.Document;

public class News extends Document {
    public int Day;

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }

    @Override
    public String toString() {
        return "News{" +
                "name='" + getName() + '\'' +
                ", documentID='" + getDocumentID() + '\'' +
                ", pCompany='" + getPCompany() +'\'' +
                ", indexVersion=" + getReleaseNumber() +
                ", Day=" + Day +
                '}';
    }
}

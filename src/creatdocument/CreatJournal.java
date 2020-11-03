package creatdocument;

import creatdocument.CreatDocument;
import document.Document;
import document.Journal;


import java.util.Scanner;

public class CreatJournal {
    public Document creatJou(){
        CreatDocument creatDocument = new CreatDocument();
        Document journal = new Journal();
        creatDocument.doc(journal);
        System.out.println("Tháng phát hành tạp trí ");
        ((Journal) journal).setMonthRelease(Integer.parseInt(new Scanner(System.in).nextLine()));
        System.out.println("Số phát hành ");
        ((Journal) journal).setIndexRelease(Integer.parseInt(new Scanner(System.in).nextLine()));
        return journal;

    }
}

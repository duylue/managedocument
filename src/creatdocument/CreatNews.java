package creatdocument;

import creatdocument.CreatDocument;
import document.Document;
import document.News;

import java.util.Scanner;

public class CreatNews {

    public Document creatNews(){
        CreatDocument creatD = new CreatDocument();
        Document news = new News();
        creatD.doc(news);
        System.out.println("Ngày phát hành ");
        ((News)news).setDay(Integer.parseInt(new Scanner(System.in).nextLine()));
        return news;

    }
}

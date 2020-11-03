package creatdocument;


import creatdocument.CreatDocument;
import document.Book;
import document.Document;

import java.util.Scanner;

public class CreatBook {

    public Document creat(){
        CreatDocument creatD = new CreatDocument();
        Document book = new Book();
        creatD.doc(book);
        System.out.println("tên tác giả ");
        ((Book) book).setNameAuthor(new Scanner(System.in).nextLine());
        System.out.println("số trang  ");
        ((Book) book).setNumberPages(Integer.parseInt(new Scanner(System.in).nextLine()));
        return  book;
    }
}

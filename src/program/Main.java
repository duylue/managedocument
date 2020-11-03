package program;

import creatdocument.CreatBook;
import creatdocument.CreatDocument;


import creatdocument.CreatJournal;
import creatdocument.CreatNews;
import document.Book;
import document.Document;

import document.Journal;
import document.News;
import manager.Manager;

import javax.print.Doc;
import java.awt.event.MouseAdapter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager();
        do {
            System.out.println("1 Thêm thông tin tài liệu");
            System.out.println("2 Xem thông tin tài liệu");
            System.out.println("3 tìm kiếm tài liệu");
            System.out.println("0 exit");

            int choice = Integer.parseInt(new Scanner(System.in).nextLine());
            switch (choice) {
                case 0:
                    System.exit(1);
                    break;
                case 1:
                    CreatJournal creatJ = new CreatJournal();
                    CreatNews creatNews = new CreatNews();
                    CreatBook creatBook = new CreatBook();
                    System.out.println("1 Tạo thông tin tạp trí");
                    System.out.println("2 Tạo thông tin báo");
                    System.out.println("3 tạo thông tin sách");
                    int choice2 = Integer.parseInt(new Scanner(System.in).nextLine());
                    switch (choice2) {
                        case 1:
                            Journal journal = (Journal) creatJ.creatJou();
                            journal.toString();
                            System.out.println("THÊM THÔNG TIN THÀNH CÔNG");
                            manager.add(journal);
                            break;
                        case 2:
                            News news = (News) creatNews.creatNews();
                            news.toString();
                            System.out.println("THÊM THÔNG TIN THÀNH CÔNG");
                            manager.add(news);
                            break;
                        case 3:

                            Book book = (Book) creatBook.creat();
                            book.toString();
                            System.out.println("THÊM THÔNG TIN THÀNH CÔNG");
                            manager.add(book);
                            break;

                    }
                case 2:
                    manager.read();
                    break;
                case 3:
                    System.out.println("NHẬP ID TÀI LIỆU");
                    String sea = new Scanner(System.in).nextLine();
                    manager.Search(sea);
                    break;
            }
        } while (true);


    }
}

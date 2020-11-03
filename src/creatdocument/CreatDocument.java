package creatdocument;

import document.Document;
import javax.print.Doc;
import java.util.ArrayList;
import java.util.Scanner;

public class CreatDocument {
    public void doc(Document document){
        System.out.println("Tên tài liệu ");
        document.setName(new Scanner(System.in).nextLine());
        System.out.println("Mã tài liệu ");
        document.setDocumentID(new Scanner(System.in).nextLine());
        System.out.println("Nhà xuất bản ");
        document.setPCompany(new Scanner(System.in).nextLine());
        System.out.println("Số bản phát hành ");
        document.setReleaseNumber(Integer.parseInt(new Scanner(System.in).nextLine()));
    }


}

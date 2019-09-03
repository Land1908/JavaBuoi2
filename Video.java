/*
Ham tao , ham nhap, ham xuat thong tin Video
 */
package VideoOfMusic;
import java.util.Scanner;

public class Video{
    String ten;
    String theloai;
    int chatluong;
    int thoigian;
    
    public void Video(){
    
    }
    
    public void Video(String t, String tl, int cl, int tg){
        ten = t;
        theloai = tl;
        chatluong = cl;
        thoigian = tg;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten Video: ");
        ten = sc.nextLine();
        System.out.println("Nhap the loai :");
        theloai = sc.nextLine();
        System.out.println("Nhap chat luong: ");
        chatluong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap thoi gian: ");
        thoigian = Integer.parseInt(sc.nextLine());
    }
    public void xuat(){
        System.out.println("Ten Video la: " + this.ten);
        System.out.println("The loai Video la: " + this.theloai);
        System.out.println("Chat luong Video la: " + this.chatluong);
        System.out.println("Thoi luong Video la: " + this.thoigian);
    }
}



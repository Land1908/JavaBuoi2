/*

 */
package VideoOfMusic;
import java.util.Scanner;

public class Music extends Video{
    String tenBH;
    int time;
    String Singer;
    String Album;
    int phut;
    int giay;
    
    public void Music(){
    
    }
    public void Music(String ten, String theloai, int chatluong, int thoigian, String tenBH){
     
        this.tenBH = tenBH;
    }
    
    public void nhaptt(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap ten bai hat: ");
        tenBH = sc.nextLine();
        System.out.println("Nhap ca si bai hat: ");
        Singer = sc.nextLine();
        System.out.println("Nhap ten Album: ");
        Album = sc.nextLine();
        System.out.println("Nhap thoi gian bai hat: ");
        time = Integer.parseInt(sc.nextLine());
    }
    
    public void xuattt(){
        super.xuat();
        System.out.println("Ten bai hat la: " + this.tenBH);
        System.out.println("Ca si the hien la: " + this.Singer);
        System.out.println("Thuoc Album : " + this.Album);
        System.out.println("Thoi gian bai hat la: " + this.thoigian);
    }
    
    public void tinhtime(){
        giay = time % 60;
        phut = (time - giay) / 60;
        System.out.println("So phut la: "+ phut);
        System.out.println("So giay la: " + giay);
    }
    
    public void timkiem(){
    
    }
}
    
 

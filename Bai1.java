import java.util.*;
public class Bai1 {
    public static void main(String[] args) {
        //tao doi tuong sc de lay du lieu tu ban phim
        Scanner sc=new Scanner(System.in);
        String a;
        System.out.println("Nhap vao chuoi: ");
        a= sc.nextLine();
        System.out.println("Chuoi duoc in hoa thanh:");
        //su dung ham touppercase chuyen chu thuong thanh chu hoa
        System.out.println(a.toUpperCase());
    }
}

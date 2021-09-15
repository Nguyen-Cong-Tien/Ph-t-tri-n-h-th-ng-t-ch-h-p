import java.util.*;
public class Bai2 {
    public static void main(String[] args) {
        int n;
        boolean kiemtra=true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen: ");
        int num = sc.nextInt();
        for(int i=2; i < num/2;i++){
            n=num%i;
            if(n==0){
                kiemtra=false;
                break;
                    }
        }
        if(kiemtra)
        System.out.println("Day la so nguyen to");
        else
        System.out.println("Day khong phai la so nguyen to");
    }
}

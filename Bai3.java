import java.util.*;
public class Bai3 {
    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("Nhap a # 0: ");
            a=sc.nextDouble();
        }while(a==0);
        System.out.println("Nhap b: ");
        b=sc.nextDouble();
        System.out.println("nhap c: ");
        c=sc.nextDouble();
        delta=b*b - 4*a*c;
        if(delta<0){
            System.out.println("Phuong trinh vo nghiem");
        }else 
        if(delta==0){
            x1=-b/(2*a);
            System.out.println("Phuong trinh co nghiem kep la: " + x1);
        }
        else{
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 ngiem"+x1+"va"+x2);
        }
    }
}

import java.util.*;
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap n: ");
        int n=sc.nextInt();
        double[] a=new double[n];
        double tong=0;
        for(int i=0; i<n;i++){
            a[i]=sc.nextDouble();
        }
        for(int i=0; i<n;i++){
            if(a[i]>0){
            tong+=a[i];
            }
        }
        System.out.println("Tong cua day la: " + tong);
    }
}

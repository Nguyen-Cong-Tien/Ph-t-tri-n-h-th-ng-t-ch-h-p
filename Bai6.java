import java.util.*;

//import org.graalvm.compiler.core.common.type.ArithmeticOpTable.UnaryOp.Sqrt;
import java.math.*;
//import jdk.nashorn.internal.parser.Scanner;
class toado{
    int a,b;
    double khoangcach=0;
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao toa do X: ");
        a=sc.nextInt();
        System.out.println("Nhap vao toa do y: ");
        b=sc.nextInt();
    }
    public void xuattoado(){
        System.out.println("Toa do la("+a+","+b+")");
    }
    public void kc(){
        khoangcach=Math.sqrt((a*a)+(b*b));
        System.out.println("Khoang cach den goc toa do la: "+ khoangcach);
    }
}
public class Bai6 {
    public static void main(String[] args) {
    toado toado1=new toado();
    toado1.a=3;
    toado1.b=4;
    toado1.xuattoado();
    toado1.Nhap();
    toado1.xuattoado(); 
    toado1.kc();   
    }
}

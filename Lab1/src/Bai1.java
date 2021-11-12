import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        int a;
        float b;
        double d;
        long l;
        char ch;
        String str;
        
        //nhap du lieu
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhap 1 so nguyen:");
        a=nhap.nextInt();
        System.out.println("Nhap 1 so thuc:");
        b=nhap.nextFloat();
        System.out.println("Nhap 1 so double:");
        d=nhap.nextDouble();
        System.out.println("Nhap 1 so long:");
        l=nhap.nextLong();
        System.out.println("Nhap 1 ky tu:");
        nhap.nextLine();
        ch= nhap.nextLine().charAt(0);
        System.out.println("Nhap 1 chuoi:");
        str=nhap.nextLine();
        
        //xuat du lieu
        System.out.println("Du lieu vua nhap la:");
        System.out.println("So nguyen: "+a);
        System.out.println("So thuc: "+b);
        System.out.println("So double: "+d);
        System.out.println("So long: "+l);
        System.out.println("1 ky tu: "+ch);
        System.out.println("! chuoi: "+str);
        
    }
    
}
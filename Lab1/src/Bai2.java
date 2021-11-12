import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        int a,b,c,min,max;
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhap a: ");
        a=nhap.nextInt();
        System.out.println("Nhap b:");
        b=nhap.nextInt();
        System.out.println("Nhap c: ");
        c=nhap.nextInt();
        max=a;
        
        if(max<b){
            max=b;
        }
        
        if(max<c){
            max=c;
        }
        min=a;
        if(min>b){
            min=b;
        }
        if(min>c){
            min=c;
        }
        System.out.println("Max la: "+max+" Min la: "+min);
    }
}

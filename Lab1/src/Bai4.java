import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai4 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
	float tiendien = sc.nextFloat();
        System.out.println("Nhap so dien trong thang  :");
	float sotien = sc.nextFloat();
	System.out.println();
        if(sotien <=50){
            tiendien = sotien *5000;
        }else{
            tiendien = 50*5000 + (sotien-50)*6200;
        }
        System.out.println("tiendien : " + tiendien + "VND");
    }
    
}

import java.util.Scanner;
public class bai3 tuan4 {
    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập vào một số nguyên dương: ");
	        int n = scanner.nextInt();
	        long s = 1; 
	        if (n < 0) {
	            System.out.println("Vui lòng nhập số nguyên dương.");
	        } else {
	            for (int i = 2; i <= n; i++) {
	                s *= i;
	            }
	            System.out.println("Giai thừa của " + n + " là: " + s);
	        }
	    }
}


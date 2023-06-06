package swap;
import java.util.Scanner;
public class Swap1 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter any value");
	int a=obj.nextInt();
	System.out.println("Enter any value");
	int b=obj.nextInt();
	int temp;
	temp = a;
	a=b;
	b=temp;
	System.out.println("After Swapping the values are:");
	System.out.println("a="+a);
	System.out.println("b="+b);
	}

}

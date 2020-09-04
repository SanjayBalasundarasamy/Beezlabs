import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		System.out.println("Enter x and y");
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		System.out.println("Before Swapping");
		System.out.println(x);
		System.out.println(y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swapping without a third variable");
		System.out.println(x);
		System.out.println(y);
	}

}

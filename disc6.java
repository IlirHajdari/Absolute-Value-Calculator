import java.util.*;

public class disc6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input number: ");
		int x = in.nextInt();
		System.out.printf("The absolute value of %d is: %d",x, convert (x));
		System.out.printf("\n");
		in.close();
	}
	public static int convert (int n) {
		int absvalue = (n >= 0) ? n : -n;
		return absvalue;
	}
}

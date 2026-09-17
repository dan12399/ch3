import java.util.Scanner;

public class convert {
	public static void main(String[] args) {
		final double FACTOR= 9/5;
		final int CONSTANT= 32;
		Scanner in= new Scanner(System.in);
		System.out.print("Temperature in Celsius:");
		double cel=in.nextDouble();
		double far= (double) (cel*FACTOR + CONSTANT);
		System.out.print(cel + " C "+ "=" +far+ " F");
}
	
}

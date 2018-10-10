import java.util.Scanner;

public class IC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter two numbers");
		Integer ntg = sc.nextInt();
		Integer ntg2 = sc.nextInt();
		int a = ntg.compareTo(ntg2);
		System.out.println("The comparison between the given numbers is: " + a);
		
		Integer ntg3= 10;
		System.out.println("The default number is 10, now please enter a token");
		String str = sc.next();
		System.out.println(Integer.getInteger(str, ntg3));
		
		System.out.println("Please enter a number");
		Integer ntg4 = sc.nextInt();
		int b = ntg4.intValue();
		System.out.println("The given Integer's int value is: " + b);
		
		System.out.println("Please enter a number");
		String str2 = sc.next();
		int c = Integer.parseInt(str2);
		System.out.println("The given String's int value is: " + c);
		
		System.out.println("Please enter a number");
		Integer ntg5 = sc.nextInt();
		short d = ntg5.shortValue();
		System.out.println("The given Integer's short value is: " + d);
		
		System.out.println("Please enter a number");
		Integer ntg6 = sc.nextInt();
		String str3 = ntg6.toString();
		System.out.println("The given Integer's string value is: " + str3);
		
		System.out.println("Please enter a number");
		String str4 = sc.next();
		Integer e = Integer.valueOf(str4);
		System.out.println("The given String's Integer value is: " + e);
		
		sc.close();
	}

}

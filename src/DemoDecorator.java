import java.util.Scanner;

public class DemoDecorator {
	public static void main ( String [] arguments )
    {
		System.out.println("Please enter some test input!");
		Scanner scanner = new Scanner(System.in);
		Decorator dec = new Decorator(scanner);
		String input = dec.nextLine();
		scanner.close();
        System.out.println(input);
    }
}

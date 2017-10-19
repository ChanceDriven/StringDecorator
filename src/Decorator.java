import java.util.Scanner;

public class Decorator {
	protected Scanner _scanner;
	public Decorator(Scanner scanner) {
		_scanner = scanner;
	}

	public String nextLine() {
		return _scanner.nextLine().toLowerCase();
	}
}

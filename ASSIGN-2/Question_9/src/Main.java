

public class Main {
	public static int main(char ch) {
		switch (ch) {
		case '$':
			return 11;
		case '*':
			return 10;
		case '%':
			return 10;
		case '/':
			return 10;
		case '+':
			return 9;
		case '-':
			return 9;
		}
		return 0;
	}
	
}
import java.util.Scanner;

public class test {
	public static int site = 0;
	public static String temString;
	public static int length;
	public static boolean err = false;
	public static String word;

	public static void main(String[] args) {
		Scanner inner = new Scanner(System.in);
		while (inner.hasNext()) {
			temString = inner.nextLine();
			length = temString.length();
			for (site = 0; site < length; site++) {
				if (err) {
					return;
				}
				program.compile(temString.charAt(site));
			}
		}
	}
}

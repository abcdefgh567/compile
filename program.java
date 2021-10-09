
public class program {
	public static void compile(char c) {
		if (c == ';') {
			System.out.println("Semicolon");
			return;
		}
		if (c == '(') {
			System.out.println("LPar");
			return;
		}
		if (c == ')') {
			System.out.println("RPar");
			return;
		}
		if (c == '{') {
			System.out.println("LBrace");
			return;
		}
		if (c == '}') {
			System.out.println("RBrace");
			return;
		}
		if (c == '+') {
			System.out.println("Plus");
			return;
		}
		if (c == '*') {
			System.out.println("Mult");
			return;
		}
		if (c == '/') {
			System.out.println("Div");
			return;
		}
		if (c == '<') {
			System.out.println("Lt");
			return;
		}
		if (c == '>') {
			System.out.println("Gt");
			return;
		}
		if (c == ' ' || c == '\r' || c == '\n' || c == '\t') {
			return;
		}
		if (c == '=') {
			test.site++;
			if (test.site < test.length && test.temString.charAt(test.site) == '=') {
				System.out.println("Eq");
			} else {
				System.out.println("Assign");
				test.site--;
			}
			return;
		}
		if (Character.isDigit(c)) {
			compilenumber(c);
			return;
		}
		if (Character.isLetter(c) || c == '_') {
			compileletter(c);
			return;
		}
		System.out.println("Err");
		test.err = true;
		return;
	}

	public static boolean iskey(String temString) {
		if (temString.equals("if")) {
			System.out.println("If");
			return true;
		}
		if (temString.equals("else")) {
			System.out.println("Else");
			return true;
		}
		if (temString.equals("while")) {
			System.out.println("While");
			return true;
		}
		if (temString.equals("break")) {
			System.out.println("Break");
			return true;
		}
		if (temString.equals("continue")) {
			System.out.println("Continue");
			return true;
		}
		if (temString.equals("return")) {
			System.out.println("Return");
			return true;
		}
		return false;
	}

	public static void compilenumber(char temchar) {
		test.site++;
		test.word = String.valueOf(temchar);
		while ((test.site < test.length) && Character.isDigit(test.temString.charAt(test.site))) {
			test.word = test.word + test.temString.charAt(test.site);
			test.site++;
		}
		System.out.println("Number(" + test.word + ")");
		test.site--;
	}

	public static void compileletter(char temchar) {
		test.site++;
		test.word = String.valueOf(temchar);
		while ((test.site < test.length) && (Character.isLetterOrDigit(test.temString.charAt(test.site)))
				|| (test.temString.charAt(test.site) == '_')) {
			test.word = test.word + test.temString.charAt(test.site);
			test.site++;
		}
		if (!iskey(test.word)) {
			System.out.println("Ident(" + test.word + ")");
		}
		test.site--;
	}
}

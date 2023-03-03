package questaoInverter;

public class Main {

	public static void main(String[] args) {
		
		String palavra = "Me contratem!";
		int len = palavra.length();
		char[] tempChar = new char[len];
		char[] charArray = new char[len];
		
		for (int i = 0; i < len; i++) {
			tempChar[i] = palavra.charAt(i);
			for (int j = 0; j < len; j++) {
				charArray[j] = tempChar[len - 1 - j];
			}
		}
		
		String palavraReversa = new String(charArray);
		System.out.println(palavraReversa);
	}

}

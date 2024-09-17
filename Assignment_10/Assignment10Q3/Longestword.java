import java.io.FileReader;
import java.io.IOException;

public class Longestword {
	public static String findLongestWord(String path) {
		StringBuilder current= new StringBuilder();
		String longestWord = "";
		try (FileReader fr = new FileReader(path)) {
			int c;
			while ((c = fr.read()) != -1) {
				if (Character.isLetterOrDigit(c)) {
					current.append((char) c);
				} else {
					if (current.length() > longestWord.length()) {
						longestWord = current.toString();
					}
					current.setLength(0);
				}
			}
			if (current.length() > longestWord.length()) {
				longestWord = current.toString();
			}
		} catch (IOException e) {
			System.out.println("An error occurred while reading the file.");
			e.printStackTrace();
			return null;
		}
		return longestWord;
	}

	public static void main(String[] args) {
		String path = "C:\\Users\\Jayesh\\Desktop\\My Name is Jayesh Nishikant Inamdar.txt";// enter path of the file here
		String lWord = findLongestWord(path);
		if (lWord != null) {
			System.out.println("The longest word is: " + lWord);
		}
	}
}

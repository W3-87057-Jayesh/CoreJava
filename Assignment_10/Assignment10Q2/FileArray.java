import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileArray {
	public static String[] readFiletoArray(String path) {
		List<String> linesList = new ArrayList<>();
		try (BufferedReader a = new BufferedReader(new FileReader(path))) {
			String l;
			while ((l = a.readLine()) != null) {
				linesList.add(l);
			}
		} catch (IOException e) {
			System.out.println("An error occurred while reading the file.");
			e.printStackTrace();
			return null;
		}
		return linesList.toArray(new String[0]);
	}

	public static void main(String[] args) {
		String path = "C:\\Users\\Jayesh\\Desktop\\My Name is Jayesh Nishikant Inamdar.txt";// enter path of the file here
		String[] lines = readFiletoArray(path);
		if (lines != null) {
			for (String l : lines) {
				System.out.println(l);
			}
		}
	}
}

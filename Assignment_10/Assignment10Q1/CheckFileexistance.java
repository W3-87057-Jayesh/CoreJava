import java.io.File;

public class CheckFileexistance {

	public static void main(String[] args) {
        String path = "C:\\Users\\Jayesh\\Desktop\\My Name is Jayesh Nishikant Inamdar.txt";//enter path of the file here
        File file = new File(path);
        if (file.exists()) {
            if (file.isDirectory()) {
                System.out.println(path + " is a directory and exists.");
            } else {
                System.out.println(path + " is a file and exists.");
            }
        } else {
            System.out.println(path + " does not exist.");
        }
	}

}

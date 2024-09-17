import java.io.File;

public class CheckHiddenFileexistance {

	public static void main(String[] args) {
        String path = "C:\\Users\\Jayesh\\Music\\Sunbeam Assignments\\corejava assignments\\CoreJava\\.git";//enter path of the file here
        File file = new File(path);
        if (file.exists()) {
            if (file.isHidden()) {
                System.out.println(path + " is a hidden file.");
            } else {
                System.out.println(path + " is not a hidden file.");
            }
        } else {
            System.out.println(path + " does not exist in the directory.");
        }
	}
}

import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("C:/Users/PREET/OneDrive/Desktop/langs/java/FileHandling2/src/myFiles/hello.txt"); //create file object
        file.createNewFile(); //create file
    }
}

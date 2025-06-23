import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Try to read a file from disk and handle FileNotFoundException. (Use FileReader or Scanner)

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String filePath = sc.nextLine();

        File file = new File(filePath);

        try {
            Scanner fileScanner = new Scanner(file);
            System.out.println("File content:");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        }catch (FileNotFoundException e) {
            System.out.println("Error: File not found at path: " + filePath);
        }finally {
            sc.close();
        }

//        c:\Users\Downloads\Course_Certificate_Ar.pdf
    }
}
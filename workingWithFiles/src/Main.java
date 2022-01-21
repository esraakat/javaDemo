import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        createFile();
        getFileInfo();
        readFile();
        writeFile();
        readFile();
    }

    public static void createFile() {
        File file = new File("C:\\JavaDemos\\files\\student.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("The file has been created!");
            } else {
                System.out.println("The file has already beed created!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo() {
        File file = new File("C:\\JavaDemos\\files\\student.txt");
        if (file.exists()) {
            System.out.println("Name of the file: " + file.getName());
            System.out.println("Path of the file: " + file.getAbsolutePath());
            System.out.println("Is the file writable: " + file.canWrite());
            System.out.println("Is the file readable: " + file.canRead());
            System.out.println("Sıze of the file: " + file.length());
        }

    }

    public static void readFile() {
        File file = new File("C:\\JavaDemos\\files\\student.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void writeFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\JavaDemos\\files\\student.txt", true));
            writer.newLine();
            writer.write("Eda");
            System.out.println("It has been written");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

import java.util.Scanner;

public class App {

    public static void printMenu() {
        System.out.println("=============== Welcome to the File Manager! ===============");
        System.out.println("1. Create File");
        System.out.println("2. Delete File");
        System.out.println("3. List Files");
        System.out.println("4. Open File");
        System.out.println("5. Close File");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) throws Exception {

        FileManager fileManager = FileManager.getInstance();

        // Create a menu for the user to interact with the file manager
        Scanner scanner = new Scanner(System.in);

        while(true){
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    System.out.println("Enter the name of the file:");
                    String name = scanner.nextLine();
                    System.out.println("Enter the type of the file:");
                    String type = scanner.nextLine();
                    fileManager.createFile(name, type);
                    break;
                case 2:
                    System.out.println("Enter the name of the file:");
                    name = scanner.nextLine();
                    System.out.println("Enter the type of the file:");
                    type = scanner.nextLine();
                    fileManager.deleteFile(name, type);
                    break;
                case 3:
                    fileManager.listFiles();
                    break;
                case 4:
                    System.out.println("Enter the name of the file:");
                    name = scanner.nextLine();
                    System.out.println("Enter the type of the file:");
                    type = scanner.nextLine();
                    fileManager.openFile(name, type);
                    break;
                case 5:
                    System.out.println("Enter the name of the file:");
                    name = scanner.nextLine();
                    System.out.println("Enter the type of the file:");
                    type = scanner.nextLine();
                    fileManager.closeFile(name, type);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }



    }
}

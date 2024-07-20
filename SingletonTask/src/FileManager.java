import java.util.ArrayList;

public class FileManager {
    private static FileManager instance;
    private ArrayList<File> files = new ArrayList<File>();

    private FileManager() {
    }

    public static FileManager getInstance() {
        if (instance == null) {
            instance = new FileManager();
        }
        return instance;
    }

    public void createFile(String name, String type) {
        String currnetFile = name + "." + type;
        for (File file : files) {
            String tempFile = file.getName() + "." + file.getType();
            if (tempFile.equals(currnetFile)) {
                System.out.println("File already exists!");
                return;
            }
        }

        File file = new File(name, type);
        System.out.println("Created " + file.getName() + "." + file.getType() + " Successfully!");
        files.add(file);
    }

    public void deleteFile(String name, String type) {
        String currnetFile = name + "." + type;
        for (File file : files) {
            String tempFile = file.getName() + "." + file.getType();
            if (tempFile.equals(currnetFile)) {
                System.out.println("Deleted " + file.getName() + "." + file.getType() + " Successfully!");
                files.remove(file);
                return;
            }
        }
        System.out.println("File not found!");
    }

    public void listFiles() {
        System.out.println("Files:");
        if (files.isEmpty()) {
            System.out.println("No files found!");
            return;
        } else {
            for (File file : files) {
                System.out.println(file.getName() + "." + file.getType());
            }
        }
    }

    public void openFile(String name, String type) {
        String currnetFile = name + "." + type;
        for (File file : files) {
            String tempFile = file.getName() + "." + file.getType();
            if (tempFile.equals(currnetFile)) {
                if(file.isOpen()){
                    System.out.println("File is already open!");
                    return;
                }else{
                    System.out.println("Opening " + file.getName() + "." + file.getType());
                    file.setOpen(true);
                    return;
                }
            }
        }
        System.out.println("File not found!");
    }

    public void closeFile(String name, String type) {
        String currnetFile = name + "." + type;
        for (File file : files) {
            String tempFile = file.getName() + "." + file.getType();
            if (tempFile.equals(currnetFile)) {
                if(!file.isOpen()){
                    System.out.println("File is already closed!");
                    return;
                }else{
                    System.out.println("Closing " + file.getName() + "." + file.getType());
                    file.setOpen(false);
                    return;
                }
            }
        }
        System.out.println("File not found!");
    }

}

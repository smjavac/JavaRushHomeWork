package Proverochnye.FileScane;

import java.io.File;

public class FileScan {
    public static void main(String[] args) {
        File directory = new File(args[0]);

        printEmpty(directory);
    }

    private static void printEmpty(File dir) {
        if (dir != null) {
            File[] files = dir.listFiles();
            System.out.println(files.length);

            if (files == null || files.length == 0) {
                System.out.println(dir.getAbsoluteFile());
            } else {
                for (File file : files) {
                    if(file.isDirectory()) {
                        printEmpty(file);
                    }
                }
            }
        }
    }
}

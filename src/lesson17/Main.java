package lesson17;

import java.io.File;
import java.io.FileFilter;

public class Main {
    public static void main(String[] args) {
        File startDir = new File("C:\\Java");
        if (startDir.isDirectory() && startDir.exists()) {
            File[] allPicsFromStartDir = startDir.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    if (pathname.isDirectory()) {
                        return true;
                    }
                    if (pathname.getName().endsWith(".jpg") ||
                            pathname.getName().endsWith(".jpeg") ||
                            pathname.getName().endsWith(".png")) {
                        return true;
                    }
                    return false;
                }
            });
            for (File f : allPicsFromStartDir) {
                System.out.println(f.getAbsolutePath());
            }
        }
    }
}

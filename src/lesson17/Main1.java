package lesson17;

import java.io.IOException;
import java.nio.file.Path;

public class Main1 {
    public static void main(String[] args) throws FileCopyFailedException {
        CopyByOneByte copyByOneByte = new CopyByOneByte();

        long startTime1 = System.currentTimeMillis();
        try {
            copyByOneByte.copyFile("C:\\Users\\andre\\Downloads\\jdk-11.0.2_windows-x64_bin.exe",
                    "C:\\Users\\andre\\Downloads\\1\\jdk-11.0.2_windows-x64_bin-copy.exe");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Время копирования CopyByOneByte: " + (endTime1 - startTime1));

        CopyByStream copyByStream = new CopyByStream();
        long startTime2 = System.currentTimeMillis();
        try {
            copyByStream.copyFile("C:\\Users\\andre\\Downloads\\jdk-11.0.2_windows-x64_bin.exe",
                    "C:\\Users\\andre\\Downloads\\2\\jdk-11.0.2_windows-x64_bin-copy.exe");
        } catch (FileCopyFailedException | IOException e) {
            e.printStackTrace();
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Время копирования CopyByStream: " + (endTime2 - startTime2));

        CopyByFileChannel copyByFileChannel = new CopyByFileChannel();
        long startTime3 = System.currentTimeMillis();
        try {
            copyByFileChannel.copyFile("C:\\Users\\andre\\Downloads\\jdk-11.0.2_windows-x64_bin.exe",
                    "C:\\Users\\andre\\Downloads\\3\\jdk-11.0.2_windows-x64_bin-copy.exe");
        }catch (FileCopyFailedException | IOException e){
            e.printStackTrace();
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println("Время копирования CopyByFileChannel: " + (endTime3 - startTime3));



    }
}

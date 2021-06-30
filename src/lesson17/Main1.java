package lesson17;

public class Main1 {
    public static void main(String[] args) throws FileCopyFailedException {
        CopyByOneByte copyByOneByte = new CopyByOneByte();

        long startTime1 = System.currentTimeMillis();
        try {
            copyByOneByte.copyFile("C:\\Users\\andre\\Downloads\\jdk-11.0.2_windows-x64_bin.exe",
                    "C:\\Users\\andre\\Downloads\\jdk-11.0.2_windows-x64_bin-copy.exe");
        }catch (FileCopyFailedException e){
            e.printStackTrace();
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Время копирования CopyByOneByte: " + (endTime1 - startTime1));

    }
}

package lesson19;

import lesson17.CopyByStream;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        CopyFileTaskImpl task1 =
                new CopyFileTaskImpl("C:\\Users\\andre\\Downloads\\" +
                        "ABBYY FineReader Enterprise 14.0.105.234 Portable by conservator\\FineReader.exe",
                        "C:\\Users\\andre\\Downloads\\" +
                                "ABBYY FineReader Enterprise 14.0.105.234 Portable by conservator\\FineReader-copy.exe");
        task1.setFileCopyUtils(new CopyByStream());

        CopyFileTaskImpl task2 =
                new CopyFileTaskImpl("C:\\Users\\andre\\Downloads\\jdk-12.0.1_windows-x64_bin.exe",
                        "C:\\Users\\andre\\Downloads\\jdk-12.0.1_windows-x64_bin-copy.exe");
        task2.setFileCopyUtils(new CopyByStream());

        CopyFileTaskImpl task3 =
                new CopyFileTaskImpl("C:\\Users\\andre\\Downloads\\jdk-11.0.2_windows-x64_bin.exe",
                        "C:\\Users\\andre\\Downloads\\jdk-11.0.2_windows-x64_bin-copy.exe");
        task3.setFileCopyUtils(new CopyByStream());

        CopyFileTaskImpl task4 =
                new CopyFileTaskImpl("C:\\Users\\andre\\Downloads\\" +
                        "Microsoft Office 2010 Professional Plus 14.0.7197.5000 SP2 RePack by D!akov\\" +
                        "Installer_MO.2010.PP.14.0.7197.5000_x64.exe",
                        "C:\\Users\\andre\\Downloads\\" +
                                "Microsoft Office 2010 Professional Plus 14.0.7197.5000 SP2 RePack by D!akov\\" +
                                "Installer_MO.2010.PP.14.0.7197.5000_x64-copy.exe");
        task4.setFileCopyUtils(new CopyByStream());

        CopyFileTaskImpl task5 =
                new CopyFileTaskImpl("C:\\Users\\andre\\Downloads\\" +
                        "Microsoft Office 2010 Professional Plus 14.0.7197.5000 SP2 RePack by D!akov\\" +
                        "Installer_MO.2010.PP.14.0.7197.5000_x86.exe",
                        "C:\\Users\\andre\\Downloads\\" +
                                "Microsoft Office 2010 Professional Plus 14.0.7197.5000 SP2 RePack by D!akov\\" +
                                "Installer_MO.2010.PP.14.0.7197.5000_x86-copy.exe");
        task5.setFileCopyUtils(new CopyByStream());

        FindFileTaskImpl task6 = new FindFileTaskImpl();
        try {
            task6.setDirectory("C:\\Users\\andre\\Downloads");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        task6.setFileNameSearchString("ZoomInstaller");
        task6.setPrintStream(System.out);

        FindFileTaskImpl task7 = new FindFileTaskImpl();
        try {
            task7.setDirectory("C:\\Users\\andre\\Downloads");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        task7.setFileNameSearchString("Git-2.31.1-64-bit");
        task7.setPrintStream(System.out);

        TaskStorageImpl storage = new TaskStorageImpl();
        storage.add(task1);
        storage.add(task2);
        storage.add(task3);
        storage.add(task4);
        storage.add(task5);
        storage.add(task6);
        storage.add(task7);


        TaskExecutorImpl executor1 = new TaskExecutorImpl();
        executor1.setStorage(storage);

        TaskExecutorImpl executor2 = new TaskExecutorImpl();
        executor2.setStorage(storage);

        TaskExecutorImpl executor3 = new TaskExecutorImpl();
        executor3.setStorage(storage);

        executor1.start();
        executor2.start();
        executor3.start();
    }
}

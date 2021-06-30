package lesson17;

import java.io.*;

public class CopyByOneByte implements FileCopyUtils{
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        File destFile = new File(destination);
        if (destFile.exists()) {
            throw new FileAlreadyExistsException("Целевой файл уже существует!!!");
        }
            try {
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination));

                int c = 0;
                while (true) {
                    c = bis.read();
                    if (c != -1)
                        bos.write(c);
                    else
                        break;
                }
                bis.close();
                bos.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
                bos.close(); //закрываем поток записи (обязательно!)
            }
            catch (java.io.IOException e) {
                throw new FileCopyFailedException(e.getMessage());
            }
        }
    }


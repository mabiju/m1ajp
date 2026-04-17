package r_random_access_file;

import java.io.RandomAccessFile;

public class a_write_read_file {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("D:/M1_AJP/r_random_access_file/file.txt", "rw");

            // writing to the file
            file.writeUTF("Hello Sanothimi");

            // go to begining of the file
            file.seek(0);

            // reading the content of the file
            String text = file.readUTF();
            System.out.println(text);

            file.close();
        } catch (Exception e) {
            System.out.println("Error :" + e);
        }
    }
}

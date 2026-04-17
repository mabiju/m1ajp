package r_random_access_file;

import java.io.RandomAccessFile;

public class b_seeking_the_position {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("D:/M1_AJP/r_random_access_file/file2.txt", "rw");

            // writing to the file
            file.writeUTF("ABC");
            file.writeUTF("DEF");
            file.writeUTF("GHI");
            file.writeUTF("JKL");

            // moving pointer to a specif position
            file.seek(3);

            // reading the content of the file
            byte b = file.readByte();
            System.out.println((char)b);

            file.close();
        } catch (Exception e) {
            System.out.println("Error :" + e);
        }
    }
}

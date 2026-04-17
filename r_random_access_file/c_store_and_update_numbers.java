package r_random_access_file;

import java.io.RandomAccessFile;

public class c_store_and_update_numbers

{
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("D:/M1_AJP/r_random_access_file/file3.dat", "rw");

            // writing numbers to file
            file.writeInt(10);
            file.writeInt(20);
            file.writeInt(30);

            // updating second number
            file.seek(4); // int = 4 bytes
            file.writeInt(99);

            // reading all numbers
            file.seek(0);
            System.out.println(file.readInt());
            System.out.println(file.readInt());
            System.out.println(file.readInt());
            file.close();
        } catch (Exception e) {
            System.out.println("Error :" + e);
        }
    }
}

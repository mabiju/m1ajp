package p_byte_stream;

import java.io.*;

public class a_bs_copy_file {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:/M1_AJP/p_byte_stream/input.txt");
            FileOutputStream fos = new FileOutputStream("D:/M1_AJP/p_byte_stream/output.txt");

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            fis.close();
            fos.close();
            System.out.println("File copied successfully.");
        } catch (Exception e) {
            System.out.println("Error " + e);
        }

    }
}

package p_byte_stream;

import java.io.FileInputStream;

public class c_bs_reading_data_from_file {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:/M1_AJP/p_byte_stream/data.txt");

            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
            fis.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}

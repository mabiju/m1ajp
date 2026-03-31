package p_byte_stream;

import java.io.FileOutputStream;

public class b_bs_writing_data_to_file {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("D:/M1_AJP/p_byte_stream/data.txt");
            String text = "Hello Sanothimi";

            byte[] bytes = text.getBytes();

            fos.write(bytes);
            fos.close();
            System.out.println("Writing process completed successfully.");

        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}

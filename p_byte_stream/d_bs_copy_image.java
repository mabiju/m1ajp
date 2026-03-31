package p_byte_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class d_bs_copy_image {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:/M1_AJP/p_byte_stream/input.png");
            FileOutputStream fos = new FileOutputStream("D:/M1_AJP/p_byte_stream/output.png");

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            fis.close();
            fos.close();

            System.out.println("Binary file copied successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

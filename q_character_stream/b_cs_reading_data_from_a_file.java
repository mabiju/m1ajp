package q_character_stream;

import java.io.FileReader;
import java.io.IOException;

public class b_cs_reading_data_from_a_file {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:/M1_AJP/q_character_stream/file.txt");

        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();
    }
}

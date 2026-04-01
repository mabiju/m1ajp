package q_character_stream;

import java.io.FileWriter;
import java.io.IOException;

public class a_cs_writing_to_a_file {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:/M1_AJP/q_character_stream/data.txt");
        fw.write("Hello Sanothimi");
        fw.close();
    }
}

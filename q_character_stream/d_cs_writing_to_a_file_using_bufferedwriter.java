package q_character_stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class d_cs_writing_to_a_file_using_bufferedwriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:/M1_AJP/q_character_stream/file2.txt"));
        bw.write("Hello Sanothimi");
        bw.newLine();
        bw.write("Hello students good morning!, are you guys coming ?");
        bw.close();
    }
}

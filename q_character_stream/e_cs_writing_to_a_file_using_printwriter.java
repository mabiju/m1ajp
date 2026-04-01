package q_character_stream;

// PrintWriter is mainly used for formatted output.

import java.io.IOException;
import java.io.PrintWriter;

public class e_cs_writing_to_a_file_using_printwriter {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("D:/M1_AJP/q_character_stream/file3.txt");

        pw.println("Hello Nepal"); // writes data with new line
        pw.print(234); // writes data without new line
        pw.println("Good morning Sanothimi.");
        pw.close();
    }
}

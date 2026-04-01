package q_character_stream;

// BufferedReader class is more efficient and faster than FileReader
// cause it reads data line by line
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class c_cs_reading_data_from_a_file_bufferedreader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:/M1_AJP/q_character_stream/file.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}

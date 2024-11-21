
import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

public class sequenceInputstream {
    public static void main(String[] args) throws Exception {
        try (FileInputStream f1 = new FileInputStream("file1.text");
                FileInputStream f2 = new FileInputStream("file2.text");
                SequenceInputStream sc = new SequenceInputStream(f1, f2)) {

            StringBuilder sb = new StringBuilder();
            int a;
            while ((a = sc.read()) != -1) {
                sb.append((char) a);
            }
            System.out.println(sb.toString());
        }
    }
}

package OtherProjects.hust.soict.hedspi.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {

        public static void main(String[] args) {
//		File Files = new File(null);
            String filename = "C:\\Users\\ASUS\\Downloads\\2023\\KÌ 1\\OOP\\OOLT.VN.20231-20215169.NguyenAnhVinh\\OtherProjects\\hust\\soict\\hedspi\\garbage\\test.exe";    // test.exe is the name or path to an executable file
            byte[] inputBytes = {0};
            long startTime, endTime;

            try {
                inputBytes = Files.readAllBytes(Paths.get(filename));
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            startTime = System.currentTimeMillis();

            StringBuilder outputStringBuilder = new StringBuilder();
            for (byte b : inputBytes) {
                outputStringBuilder.append((char) b);
            }

            endTime = System.currentTimeMillis();
            System.out.println(endTime - startTime);
        }
    }


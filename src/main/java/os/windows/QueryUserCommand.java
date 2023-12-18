package os.windows;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QueryUserCommand {

    public static void main(String[] args) {
        try {
            ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "query", "user");
            builder.redirectErrorStream(true);
            Process process = builder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            reader.readLine();
            String secondLineFromTheTable = reader.readLine();
            System.out.println("secondLineFromTheTable" +secondLineFromTheTable);
            System.out.println("Status after: " + secondLineFromTheTable.contains("Active"));

//            String line;
//            System.out.println("Line"+ reader.readLine());
//            while ((line = reader.readLine()) != null) {
//                // Process and print the output of the command
//                System.out.println("Status : "+ line.contains("Active"));
//                if(line.contains("Active")) {
//                    System.out.println("The screen is not logged out");
//                } else {
//                    System.out.println("The screen logged out");
//                }
//
//            }

            int exitCode = process.waitFor();
            System.out.println("Exited with error code: " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

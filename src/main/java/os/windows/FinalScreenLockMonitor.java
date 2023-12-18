package os.windows;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Timer;
import java.util.TimerTask;

public class FinalScreenLockMonitor {
    public static void main(String[] args) {
        Timer timer = new Timer();
        long delay = 10000; // Check every 10 seconds

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // Check for screen lock status or system idle time
                getTheWindowsScreenStatus(delay);
                // then Perform actions based on the observed state (e.g., logout)

            }
        }, 0, delay);
    }

    private static boolean getTheWindowsScreenStatus(long delay) {
        boolean lockScreenStatus = false;
        try {
            ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "query", "user");
            builder.redirectErrorStream(true);
            Process process = builder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            reader.readLine();
            String secondLineFromTheTable = reader.readLine();
            System.out.println("secondLineFromTheTable" +secondLineFromTheTable + " check after : "+ delay/1000 +" sec");
            int exitCode = process.waitFor();
            System.out.println("Exited with error code: " + exitCode);

            if(secondLineFromTheTable.contains("Active")) {
                System.out.println("The screen is not logged out");
                return true;
            } else {
                System.out.println("The screen is logged out");
                return lockScreenStatus;
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return lockScreenStatus;
    }
}

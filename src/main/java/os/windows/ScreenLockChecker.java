package os.windows;

public class ScreenLockChecker {

    public static boolean isScreenLocked() {
        User32 user32 = User32.INSTANCE;
        return user32.LockWorkStation();
    }

    public static void main(String[] args) {
        boolean screenLocked = isScreenLocked();
        if (screenLocked) {
            System.out.println("Screen is locked.");
        } else {
            System.out.println("Screen is not locked.");
        }
    }

}

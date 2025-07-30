public class AppConfig {
    private static AppConfig instance;

    private AppConfig() {
        System.out.println("AppConfig instance created.");
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Welcome to Singleton Pattern in Java!");
    }

    public static void main(String[] args) {
        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();

        config1.showMessage();

        if (config1 == config2) {
            System.out.println("Both references point to the same object.");
        } else {
            System.out.println("Different objects created (not a singleton).");
        }
    }
}

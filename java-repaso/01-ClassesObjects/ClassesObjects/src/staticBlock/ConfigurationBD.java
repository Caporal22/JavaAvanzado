package staticBlock;

public class ConfigurationBD {
    static final String URL;
    static final String USER;

    static {
        URL = "jdbc:mysql://localhost:3306/my_db";
        USER = "admin";

    }

    public static void main(String[] args) {
        System.out.println(URL);
        System.out.println(USER);
    }
}

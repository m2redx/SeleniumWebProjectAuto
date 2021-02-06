package driver;

public class DriverManagerFactory {
    static DriverManager manager =null;

    public static DriverManager getDriver(DriverTypes type){
        switch (type){

            case CHROME:
                manager = new ChromeDriverManager();
                break;

            case FIREFOX:
                break;
        }
        return manager;
    }
}

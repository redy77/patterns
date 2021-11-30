package adapterMain;

/**
 * @author Viktor Bakakin
 */
public class DataBaseRunner {
    public static void main(String[] args) {
        DataBase dataBase = new AdapterJavaToBase();
        dataBase.insert();
        dataBase.remove();
        dataBase.select();
        dataBase.update();
    }
}

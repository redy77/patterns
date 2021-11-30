package adapterMain;

/**
 * @author Viktor Bakakin
 */
public class AdapterJavaToBase extends JavaApp implements DataBase{

    @Override
    public void insert() {
        saveO();
    }

    @Override
    public void update() {
        updateO();
    }

    @Override
    public void select() {
        loadO();
    }

    @Override
    public void remove() {
        deleteO();
    }
}

package prorotypeMain;

/**
 * @author Viktor Bakakin
 */
public class VersionControlRunner {
    public static void main(String[] args) {
        ProjectPrototype master = new ProjectPrototype(1, "Super", "SuperSource \n");
        System.out.println(master);

        ProjectPrototypeFactory factory = new ProjectPrototypeFactory(master);

        ProjectPrototype masterClone = factory.cloneProject();
        System.out.println(masterClone);
    }
}

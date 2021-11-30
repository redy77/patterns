package testAbstractFAbric.bank;

import testAbstractFAbric.ProjectManager;

/**
 * @author Viktor Bakakin
 */
public class BankPM implements ProjectManager {
    @Override
    public void manage() {
        System.out.println("Manager manage");
    }
}

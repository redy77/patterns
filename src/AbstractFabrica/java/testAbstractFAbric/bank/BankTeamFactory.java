package testAbstractFAbric.bank;

import testAbstractFAbric.Developers;
import testAbstractFAbric.ProjectManager;
import testAbstractFAbric.ProjectTeamFactory;
import testAbstractFAbric.Testers;

/**
 * @author Viktor Bakakin
 */
public class BankTeamFactory implements ProjectTeamFactory {
    @Override
    public Developers getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Testers getTester() {
        return new Tester();
    }

    @Override
    public ProjectManager getManager() {
        return new BankPM();
    }
}

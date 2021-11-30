package testAbstractFAbric;

import testAbstractFAbric.bank.BankTeamFactory;

/**
 * @author Viktor Bakakin
 */
public class AbstractFabricProgram {
    public static void main(String[] args) {
        ProjectTeamFactory teamFactory = new BankTeamFactory();
        teamFactory.getDeveloper().developCode();
        teamFactory.getManager().manage();
        teamFactory.getTester().testCOde();


    }
}

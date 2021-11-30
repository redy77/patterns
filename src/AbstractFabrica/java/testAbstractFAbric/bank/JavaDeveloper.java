package testAbstractFAbric.bank;

import testAbstractFAbric.Developers;

/**
 * @author Viktor Bakakin
 */
public class JavaDeveloper implements Developers {
    @Override
    public void developCode() {
        System.out.println("Developer writes code");
    }
}

package testAbstractFAbric;

/**
 * @author Viktor Bakakin
 */
public interface ProjectTeamFactory {
    Developers getDeveloper();
    Testers getTester();
    ProjectManager getManager();
}

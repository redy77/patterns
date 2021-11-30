package singletonMain;

/**
 * @author Viktor Bakakin
 */
public class Runner {
    public static void main(String[] args) {
        ProgrammeLogger.getProgrammeLogger().logInfo("first ");
        ProgrammeLogger.getProgrammeLogger().logInfo("second ");
        ProgrammeLogger.getProgrammeLogger().logInfo("third ");

        ProgrammeLogger.getProgrammeLogger().show();
    }
}

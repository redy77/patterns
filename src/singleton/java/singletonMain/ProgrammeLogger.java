package singletonMain;

/**
 * @author Viktor Bakakin
 */
public class ProgrammeLogger {
    private static ProgrammeLogger programmeLogger;
    private static String logFile = "This is log file. \n\n";
    public static synchronized ProgrammeLogger getProgrammeLogger(){
        if (programmeLogger == null){
            programmeLogger = new ProgrammeLogger();
        }
        return programmeLogger;
    }

    private ProgrammeLogger(){

    }

    public void logInfo(String logInfo){
        logFile+= logInfo + "\n";
    }

    public void show(){
        System.out.println(logFile);
    }
}

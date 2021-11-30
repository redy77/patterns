package chainMain;

/**
 * @author Viktor Bakakin
 */
public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier email = new EmailNotifier(Priority.IMPORTANT);
        Notifier sms = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(email);
        email.setNextNotifier(sms);

        reportNotifier.notifiyManager("OK", Priority.ROUTINE);
        reportNotifier.notifiyManager("warning", Priority.IMPORTANT);
        reportNotifier.notifiyManager("ASAP", Priority.ASAP);
    }
}

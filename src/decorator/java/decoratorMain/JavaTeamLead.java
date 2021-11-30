package decoratorMain;

/**
 * @author Viktor Bakakin
 */
public class JavaTeamLead extends DeveloperDecorator{
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendBigReport(){
        return "Big report. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendBigReport();
    }
}

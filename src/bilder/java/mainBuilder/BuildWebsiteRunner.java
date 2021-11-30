package mainBuilder;

/**
 * @author Viktor Bakakin
 */
public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new EnterpriseWebsiteBuilder());
        WebSite webSite = director.buildWebSite();

        System.out.println(webSite);
    }


}

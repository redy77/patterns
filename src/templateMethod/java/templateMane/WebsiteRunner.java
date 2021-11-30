package templateMane;

/**
 * @author Viktor Bakakin
 */
public class WebsiteRunner {
    public static void main(String[] args) {
        WebsiteTemplate welcome = new WelcomePage();

        WebsiteTemplate news = new NewsPage();

        welcome.showPage();

        System.out.println("=================");
        news.showPage();

    }
}

package mainBuilder;

/**
 * @author Viktor Bakakin
 */
public class VisitCarWebSIteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        webSite.setName("Visit card");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(500);
    }
}

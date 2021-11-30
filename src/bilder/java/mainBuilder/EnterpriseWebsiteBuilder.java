package mainBuilder;

/**
 * @author Viktor Bakakin
 */
public class EnterpriseWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        webSite.setName("Enterprise site");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(4500);
    }
}

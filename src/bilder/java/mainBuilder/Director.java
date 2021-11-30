package mainBuilder;

/**
 * @author Viktor Bakakin
 */
public class Director {

    WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }

    WebSite buildWebSite() {
        builder.createWebSite();
        builder.buildCms();
        builder.buildName();
        builder.buildPrice();

        return builder.getWebSite();
    }
}

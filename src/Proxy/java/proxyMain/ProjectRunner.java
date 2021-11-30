package proxyMain;

/**
 * @author Viktor Bakakin
 */
public class ProjectRunner {
    public static void main(String[] args) {
        ProjectProxy projectProxy = new ProxyProject("www.roi/o.ti");

        projectProxy.run();
    }
}

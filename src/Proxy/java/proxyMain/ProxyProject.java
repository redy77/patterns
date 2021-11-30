package proxyMain;

/**
 * @author Viktor Bakakin
 */
public class ProxyProject implements ProjectProxy{

    private String url;
    RealProject realProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (realProject == null){
            realProject = new RealProject(url);
        }
        realProject.run();
    }
}

package proxyMain;

import proxyMain.ProjectProxy;

/**
 * @author Viktor Bakakin
 */
public class RealProject implements ProjectProxy {

    private String url;

    public  void load(){
        System.out.println("Loading from " + url);
    }

    public RealProject(String url) {
        this.url = url;
        load();
    }

    @Override
    public void run() {
        System.out.println("Running project " + url);
    }
}

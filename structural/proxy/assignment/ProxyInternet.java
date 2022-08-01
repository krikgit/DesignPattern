package structural.proxy.assignment;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements  Internet{
    private Internet internet = new RealInternet();
    public static List<String> bannedSite = null;

    static {
        bannedSite = new ArrayList<>();
        bannedSite.add("whatever.com");
        bannedSite.add("yup.org");
        bannedSite.add("poke.in");
        bannedSite.add("hell.pk");
    }
    @Override
    public void connected(String serverHost) throws Exception {
        if (bannedSite.contains(serverHost)){
            throw new RuntimeException("Access Denied to "+serverHost);
        }
        internet.connected(serverHost);
    }
}

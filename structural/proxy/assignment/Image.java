package structural.proxy.assignment;

interface Internet {
    void connected(String serverHost) throws Exception;
}

class RealInternet implements  Internet{
    @Override
    public void connected(String serverHost) throws Exception {
        System.out.println("Connected to "+serverHost);
    }
}


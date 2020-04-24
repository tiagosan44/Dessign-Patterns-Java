package com.myProjects.structural.proxy;

public class ProxyServer implements Server{

    RealServer server;
    private int port;
    private String host;

    public ProxyServer(int port, String host){
        this.port=port;
        this.host=host;
        server =null;
        System.out.println("Proxy initialized...");
    }

    public void download(String url){
        if(!isRestricted(url))
        {
            if(this.server == null)
            {
                server = new RealServer(port,host);
            }
            server.download(url);
        }
        else{
            System.out.println("Currently the file it's forbidden");
        }
    }

    public boolean isRestricted(String path)
    {
        return path.equals("/download/forbidden.avi");
    }
}

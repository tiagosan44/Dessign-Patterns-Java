package com.myProjects.structural.proxy;

public class RealServer implements Server{

    private int port;
    private String host;

    public RealServer(int port, String host){
        this.port=port;
        this.host=host;
        System.out.println("Initializing server...");
    }

    public void download(String url){
        System.out.println("Downloading " + host + " : " + port + url);
    }
}

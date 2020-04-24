package com.myProjects.structural.proxy;

public class ProxyDemo {

    public static void main(String[] args){
        Server server = new ProxyServer(20,"http://downloasdspage.as");
        server.download("/download/allowed.avi");
        server.download("/download/forbidden.avi");
    }
}

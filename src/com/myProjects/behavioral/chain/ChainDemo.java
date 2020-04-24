package com.myProjects.behavioral.chain;

public class ChainDemo {

    public static void main(String[] args) {
        Director director = new Director();
        VP vp = new VP();
        CEO ceo = new CEO();

        director.setSuccessor(vp);
        vp.setSuccessor(ceo);

        Request request = new Request(RequestType.CONFERENCE, 200);
        director.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        director.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        director.handleRequest(request);
    }
}

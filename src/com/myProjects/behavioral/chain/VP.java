package com.myProjects.behavioral.chain;

public class VP extends Handler {

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.PURCHASE){
            if(request.getAmount() < 1500)
                System.out.println("Vp's can approve purchases below 1500");
            else {
                successor.handleRequest(request);
            }
        }
    }
}

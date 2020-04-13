package com.myProjects.creational.factory.websites;

import com.myProjects.creational.factory.pages.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
    
    protected List<Page> listPages = new ArrayList<>();
    
    public Website() {
        this.createWebsite();
    }

    protected abstract void createWebsite();

    public List<Page> getListPages() {
        return listPages;
    }
}

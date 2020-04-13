package com.myProjects.creational.factory.websites;

import com.myProjects.creational.factory.pages.*;

public class Shop extends Website{

    @Override
    protected void createWebsite() {
        listPages.add(new CartPage());
        listPages.add(new ItemPage());
        listPages.add(new ContactPage());
        listPages.add(new SearchPage());
    }
}

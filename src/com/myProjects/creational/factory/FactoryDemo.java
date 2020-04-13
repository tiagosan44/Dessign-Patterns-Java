package com.myProjects.creational.factory;

import com.myProjects.creational.factory.websites.Website;
import com.myProjects.creational.factory.websites.WebsiteFactory;
import com.myProjects.creational.factory.websites.WebsiteType;

public class FactoryDemo {

    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(site.getListPages());
        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(site.getListPages());
    }
}

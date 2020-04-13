package com.myProjects.creational.factory.websites;

import com.myProjects.creational.factory.pages.AboutPage;
import com.myProjects.creational.factory.pages.CommentPage;
import com.myProjects.creational.factory.pages.ContactPage;
import com.myProjects.creational.factory.pages.PostPage;

public class Blog extends Website{

    @Override
    protected void createWebsite() {
        listPages.add(new AboutPage());
        listPages.add(new CommentPage());
        listPages.add(new ContactPage());
        listPages.add(new PostPage());
    }
}

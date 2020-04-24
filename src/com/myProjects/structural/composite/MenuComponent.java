package com.myProjects.structural.composite;


import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {

    String name;
    String url;
    List<MenuComponent> menuComponents = new ArrayList<>();

    public MenuComponent add(MenuComponent menuComponent) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("This operation is not implemented yet");
    }

    public MenuComponent remove(MenuComponent menuComponent) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("This operation is not implemented yet");
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public abstract String toString();

    String print(MenuComponent menuComponent) {
        StringBuilder builder = new StringBuilder(this.name);
        builder.append(": ");
        builder.append(this.url);
        builder.append("\n");
        return builder.toString();
    }
}

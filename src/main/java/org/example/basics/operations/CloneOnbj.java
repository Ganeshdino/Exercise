package org.example.basics.operations;

public class CloneOnbj implements  Cloneable{
    private String name;

    @Override
    public CloneOnbj clone() throws CloneNotSupportedException {
        CloneOnbj obj = (CloneOnbj) super.clone();
        return  obj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CloneOnbj{" +
                "name='" + name + '\'' +
                '}';
    }
}

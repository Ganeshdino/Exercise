package org.example.basics.operations;

public class CloneUsage {
    public static void main(String[] args) {
        CloneOnbj clobj = new CloneOnbj();
        clobj.setName("cloned");
        try {
            CloneOnbj cloneOnbj1 = clobj.clone();
            System.out.println(cloneOnbj1);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}

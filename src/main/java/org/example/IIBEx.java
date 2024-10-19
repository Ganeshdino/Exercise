package org.example;

/**
 * instance initalization block
 */
public class IIBEx {
    private int a;
    private int b;

    public IIBEx(int a, int b) {
//        this.a =a;
//        this.b=b;
    }

    {
        this.a =10;
        this.b=20;
    }

    {
        this.a =30;
        this.b=40;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "IIBEx{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {
        IIBEx ex = new IIBEx(1,2);
        System.out.println(ex);
    }
}

package org.example;

public record RecordEx(String name, int age) {
    private final static String school;
    static {
        school = "san academy";
    }

    /*
    * compact constructor
    * */
    public RecordEx {
        name = "ganesh";
        age = 12;
    }

    public static String getSchool() {
        return school;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age();
    }


}

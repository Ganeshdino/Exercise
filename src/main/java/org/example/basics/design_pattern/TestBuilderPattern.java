package org.example.basics.design_pattern;

class Employee {
    // Required fields
    private final String firstName;
    private final String lastName;

    // Optional fields
    private final int age;
    private final String address;
    private final String phoneNumber;

    // Private constructor to prevent direct instantiation from outside
    private Employee(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
    }

    // Static nested Builder class
    public static class Builder {
        // Required fields
        private final String firstName;
        private final String lastName;

        // Optional fields with default values
        private int age = 0;
        private String address = "";
        private String phoneNumber = "";

        // Constructor for the builder with required fields
        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }


        // Setter method for optional field 'age'
        public Builder age(int age) {
            this.age = age;
            return this;  // Returning the Builder itself (fluent interface)
        }

        // Setter method for optional field 'address'
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        // Setter method for optional field 'phoneNumber'
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        // Build method to create the actual Employee object
        public Employee build() {
            return new Employee(this);  // Passing the builder instance to the Employee constructor
        }
    }

    @Override
    public String toString() {
        return "Employee: " + firstName + " " + lastName + ", Age: " + age +
                ", Address: " + address + ", Phone: " + phoneNumber;
    }
}

public class TestBuilderPattern {
    public static void main(String[] args) {
        // Using the builder to construct an Employee object
        Employee employee = new Employee.Builder("John", "Doe")
                .age(30)
                .address("1234 Elm Street")
                .phoneNumber("123-456-7890")
                .build();  // Build the Employee object


        System.out.println(employee);


    }
}

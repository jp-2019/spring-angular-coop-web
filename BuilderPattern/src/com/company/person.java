package com.company;

public class person {
    private String firstName;
    private String lastName;

    public person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static class Builder{
        private String firstName;
        private String lastName;

        public Builder() {}

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Person build() {
            return new Person(firstName,lastName);
        }

    }

}

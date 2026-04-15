package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String eyeColor;
    private String nation;

    public Person( String firstName, String lastName,int age) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String eyeColor, String gender, String nation) {
        this.eyeColor = eyeColor;
        this.gender = gender;
        this.nation = nation;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }
    public boolean isTeen(){
     if(age >= 13 && age <= 19){
         return true;
     }
     return false;
    }
}

package com.example.models;

public class SingletonPerson {
    private static volatile SingletonPerson instance;
    private String firstName="";
    private String lastName="";
    private int age=0;
    private String occupation="";

    private SingletonPerson(String firstName, String lastName, int age, String occupation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public static SingletonPerson getInstance(String firstName, String lastName, int age, String occupation){
        SingletonPerson result = instance;
        if(result==null){
            synchronized (SingletonPerson.class){
                result=instance;
                if(result==null){
                    instance = result = new SingletonPerson(firstName, lastName, age, occupation);
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "SingletonPerson{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}

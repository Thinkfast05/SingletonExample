package com.example.main;

import com.example.models.Person;
import com.example.models.SingletonPerson;

public class Example {
    public static void main(String[] args) {
        Person p =new Person("John","Doe",24,"Software Developer");
        Person q =new Person("Max","Williams",30,"Data Analyst");
        SingletonPerson sp = SingletonPerson.getInstance("Tyler","Johnnatan",20,"Builder");
        SingletonPerson sq=SingletonPerson.getInstance("Ana","Karenina",30,"Writer");;
        System.out.println("Hashcode of person p is:"+p.hashCode());
        System.out.println("Hashcode of person q is:"+q.hashCode());
        System.out.println("Hashcode of person sp is:"+sp.hashCode());
        System.out.println("Hashcode of person sq is:"+sq.hashCode());
        System.out.println(sp.toString());
        System.out.println(sq.toString());
    }
}

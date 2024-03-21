# Singleton Design Pattern Example

This project showcases the Singleton Design Pattern implemented in Java. The Singleton pattern ensures that a class has only one instance and provides a global point of access to that instance.

## Classes

### 1. Person

This class represents a simple Plain Old Java Object (POJO) describing a person with attributes such as first name, last name, age, and occupation. Instances of this class can be created freely.

#### Code:
```java
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String occupation;

    // Constructor, getters, setters, and toString method omitted for brevity
}
```

### 2. SingletonPerson

This class also represents a POJO for a person, but it follows the Singleton principle. It ensures that only one instance of this class is created and provides a static method to access that instance.

#### Code:
```java
public class SingletonPerson {
    private static volatile SingletonPerson instance;
    private String firstName;
    private String lastName;
    private int age;
    private String occupation;

    // Private constructor
    private SingletonPerson(String firstName, String lastName, int age, String occupation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
    }

    // Method to get the singleton instance
    public static SingletonPerson getInstance(String firstName, String lastName, int age, String occupation){
        SingletonPerson result = instance;
        if(result == null){
            synchronized (SingletonPerson.class){
                result = instance;
                if(result == null){
                    instance = result = new SingletonPerson(firstName, lastName, age, occupation);
                }
            }
        }
        return result;
    }

    // Getters, setters, and toString method omitted for brevity
}
```

## Main Method

The main method demonstrates the usage of both the `Person` class and the `SingletonPerson` class.

#### Code:
```java
public static void main(String[] args) {
    Person p = new Person("John", "Doe", 24, "Software Developer");
    Person q = new Person("Max", "Williams", 30, "Data Analyst");
    SingletonPerson sp = SingletonPerson.getInstance("Tyler", "Johnnatan", 20, "Builder");
    SingletonPerson sq = SingletonPerson.getInstance("Ana", "Karenina", 30, "Writer");

    System.out.println("Hashcode of person p is: " + p.hashCode());
    System.out.println("Hashcode of person q is: " + q.hashCode());
    System.out.println("Hashcode of person sp is: " + sp.hashCode());
    System.out.println("Hashcode of person sq is: " + sq.hashCode());
    System.out.println(sp.toString());
    System.out.println(sq.toString());
}
```

## Output Explanation

- `p` and `q` are instances of the `Person` class, and each has its own hashcode.
- `sp` and `sq` are instances of the `SingletonPerson` class, but they both point to the same instance because of the Singleton pattern. Hence, they share the same hashcode.
- The `toString()` method is called on both `sp` and `sq` to display their attributes.

## Conclusion

The Singleton Design Pattern ensures that a class has only one instance and provides a global access point to that instance. It is useful when exactly one object is needed to coordinate actions across the system.

---

Feel free to modify and expand upon this project to suit your needs. Happy coding! 🚀

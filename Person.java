package myFiles;

public class Person {

    String name;
    int age;

    Person(String name, int age) {

        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void changeName(String new_name) {
        this.name = new_name;
    }

    public void changeAge(int new_age) {
        this.age = new_age;
    }

}   

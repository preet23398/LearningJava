package myFiles;

public class Parent extends Person implements Family {

    private String[] children;

    public Parent(String name, int age, String[] children) {
        super(name, age);
        this.children = children;
    }

    public int numberOfchildren() {
        return children.length;
    }
}

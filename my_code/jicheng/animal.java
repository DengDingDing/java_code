package jicheng;

public  abstract class animal {
    private String name;
    private int age;

    public animal() {
    }
    public animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat() {
        System.out.println("Animal is eating");
    }
    
}
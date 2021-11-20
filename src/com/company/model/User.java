package com.company.model;

public class User {

    private int id;
    private String name;
    private int age;
    private boolean isDeveloper;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isDeveloper=" + isDeveloper +
                '}';
    }

    public User() {
    }

    public User(int id, String name, int age, boolean isDeveloper) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isDeveloper = isDeveloper;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDeveloper() {
        return isDeveloper;
    }

    public void setDeveloper(boolean developer) {
        isDeveloper = developer;
    }
}

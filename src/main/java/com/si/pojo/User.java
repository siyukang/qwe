package com.si.pojo;

/**
 * Created by Administrator on 2018/1/11.
 */
public class User {
    private int id;
    private String name;
    private int age;
    private String text;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", text='" + text + '\'' +
                '}';
    }

    public User(int id, String name, int age, String text) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.text = text;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User() {
    }
}

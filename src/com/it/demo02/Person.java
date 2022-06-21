package com.it.demo02;

import com.sun.deploy.util.StringUtils;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable{
    private String name;

    private int age;

    private int height;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Person) {
            int result = this.age - ((Person) o).getAge();
            if (result == 0) {
                // return this.getName().compareTo(((Person) o).getName());
                return ((Person) o).getName().compareTo(this.getName());
            }
            return result;
        }
        return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                height == person.height &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height);
    }
}

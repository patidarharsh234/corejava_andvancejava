package com.rays.string;

public class exampal {
    public void display() {
        System.out.println("Object created using Class.forName() and newInstance()");
    }

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("com.rays.string.exampal");
            exampal example = (exampal) clazz.getDeclaredConstructor().newInstance();
            example.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


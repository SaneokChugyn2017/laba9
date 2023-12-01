package org.example;

@Table(title = "Tabl1Hare")
public class Hare {

    public enum Color {
        Grey, Black, White
    }

    public Hare(String name, int age, int maxRunDistance, Color color) {
        this.name = name;
        this.age = age;
        this.maxRunDistance = maxRunDistance;
        this.color = color;
    }
    @Column
    private String name;

    @Column
    private int age;

    @Column
    private int maxRunDistance;

    //@Column
    private Color color;

}

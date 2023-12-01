package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        Hare[] hareArray = {
                new Hare("Коля", 2, 1000, Hare.Color.White),
                new Hare("Витя", 2, 500, Hare.Color.Grey),
                new Hare("Вильгельм", 6, 700, Hare.Color.Black),
                new Hare("Кузя", 4, 345,Hare.Color.Grey)
        };
        Tigor tigor = new Tigor("Кузя", 5, 345,Tigor.Color.Grey);
        Annotation.createTable(Tigor.class);
        Annotation.insertIntoTable(tigor);



        Annotation.createTable(Hare.class);
        for (Hare hare : hareArray){
            Annotation.insertIntoTable(hare);
        };


    }
}
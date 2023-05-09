package org.example;

import java.util.ArrayList;

public class Main {
    static final String bracket= "World!";
    public static void main(String[] args) {

        System.out.println("Hello ".concat(bracket));

        Character player1 = new Character();
        player1.setName("bracket");

        System.out.println("Player 1 name : "+player1.getName());

        // 11 of stranger things or number 11 of Futboil Club Barcelona (Neymar)
        //Persona eleven = new Persona(11);

        Player<Number> player2 = new Player<>();
        player2.setName(11);

        System.out.println("Player 2 name : "+player2.getName());

        //making a team

        Integer num1 = 3;
        Number num2 = 2;
        double num3 = 3.4;

        ArrayList<Number> team1 = new ArrayList<>();
        team1.add(num1);
        team1.add(num2);
        team1.add(num3);

        showTeamName(team1);




        ArrayList<? super Nameable> team2 = new ArrayList<>();

        team2.add(player1);
        team2.add(player2);

        showTeamGenerics((ArrayList<? extends Nameable>) team2);



    }

    public static void showTeamName(ArrayList<? super Integer> list){
        list.forEach(System.out::println);
    }

    //plus
    public static void showTeamGenerics(ArrayList<? extends Nameable> list){
        list.forEach((x)-> System.out.println(x.getClass().getName() +" nombre "+x.getName()));
    }


}
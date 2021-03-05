package com.company;

public class Main {

    public static void main(String[] args) {
	String str = "E D C B A";
	String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("\nСтрока до реверса: " + str);
        System.out.println("Строка в обратном порядке,после реверса: " + reverse);
    }
}

package org.example.Task12;

public class Task12 {
    public static void main(String[] args) {

        String input = "I like Java!!!";


        if (input.contains("Java")) {
            System.out.println("Строка содержит 'Java'");
        }


        if (input.startsWith("I like")) {
            System.out.println("Строка начинается с 'I like'");
        }


        if (input.endsWith("!!!")) {
            System.out.println("Строка заканчивается на '!!!'");
        }


        if (input.contains("Java") && input.startsWith("I like") && input.endsWith("!!!")) {
            String upperCaseString = input.toUpperCase();
            System.out.println("Строка в верхнем регистре: " + upperCaseString);
        }


        String replacedString = input.replace('a', 'o');
        String substring = replacedString.substring(replacedString.indexOf("Jovo"), replacedString.indexOf("Jovo") + "Jovo".length());
        System.out.println("Подстрока 'Jovo': " + substring);
    }
}

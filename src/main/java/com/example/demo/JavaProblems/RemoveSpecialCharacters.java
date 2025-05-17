package com.example.demo.JavaProblems;

public class RemoveSpecialCharacters {

    public static void main(String[] args) {

        String text = "Saran@1234#$%^&*(";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {

            if(text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                result.append(text.charAt(i));
            }
            if(text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                result.append(text.charAt(i));
            }
            if(text.charAt(i) >= '0' && text.charAt(i) <= '9') {
                result.append(text.charAt(i));
            }
        }

        System.out.println(result);
    }
}

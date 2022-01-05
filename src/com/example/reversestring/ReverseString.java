package com.example.reversestring;

public class ReverseString {

    public static void main(String[] args) {
        String r = reverse("Hej. Mam na imię Nikodem. Chciałbym zostać jednym z najlepszych programistów.");
        System.out.println(r);
    }

    public static String reverse(String s) {
        char[] letters = new char[s.length()];

        int letterIndex = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            letters[letterIndex] = s.charAt(i);
            letterIndex++;
        }
        String reversedString = "";

        for(int i = 0; i < s.length(); i++) {
            reversedString = reversedString + letters[i];
        }
        return reversedString;
    }
}

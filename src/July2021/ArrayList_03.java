package July2021;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayList_03 {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        ArrayList<Character> listVowel = new ArrayList<>();
        ArrayList<Character> listOthers = new ArrayList<>();

        for(int i = 0; i < string.length(); i++) {
            if (isVowel(string.charAt(i))) {
                listVowel.add(string.charAt(i));
            }
            else if (string.charAt(i) != ' ') listOthers.add(string.charAt(i));
        }


        for (Character ch : listVowel) {
            System.out.print(ch + " ");
        }

        System.out.println();

        for (Character ch : listOthers) {
            System.out.print(ch + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}

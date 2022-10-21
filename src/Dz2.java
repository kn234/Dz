import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.min;

public class Dz2 {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random rand = new Random();
        String seekWord = words[rand.nextInt(words.length)];
        System.out.println(seekWord);
        while (true) {
            for (String word : words){
                System.out.print(word+" ");
            }
            System.out.println("Введите слово");
            Scanner sc = new Scanner(System.in);
            String humanWord= sc.next();
            if (humanWord.equals(seekWord)) {
                System.out.println("Win");
                break;
            } else {
                StringBuilder helper = new StringBuilder();
                int min = min(seekWord.length(), humanWord.length());
                for (int i = 0; i < min; i++) {
                    if (humanWord.charAt(i) == seekWord.charAt(i)) {
                        helper.append(humanWord.charAt(i));
                    } else {
                        helper.append("*");
                    }
                }
                helper.append("*".repeat(14 - min));
                System.out.println(helper);
            }
        }
    }
}

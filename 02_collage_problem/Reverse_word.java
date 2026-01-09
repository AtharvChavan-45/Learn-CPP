import java.util.Scanner;

class Main {

    static void reverseBoth(String line) {

        // 1️⃣ Character reverse
        String charReverse = "";
        for (int i = line.length() - 1; i >= 0; i--) {
            charReverse += line.charAt(i);
        }

        // 2️⃣ Word reverse
        String[] words = line.split(" ");
        String wordReverse = "";
        for (int i = words.length - 1; i >= 0; i--) {
            wordReverse += words[i] + " ";
        }

        // Output
        System.out.println(charReverse);
        System.out.println(wordReverse.trim());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        reverseBoth(line);
    }
}
import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int[] result = countVowelsAndConsonants(inputString);

        System.out.println("Number of vowels: " + result[0]);
        System.out.println("Number of consonants: " + result[1]);

        scanner.close();
    }

    private static int[] countVowelsAndConsonants(String str) {
        int[] counts = new int[2]; 
        String vowels = "aeiouAEIOU";

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) {
               
                    counts[0]++;
                } else {
                    counts[1]++;
                }
            }
        }

        return counts;
    }
}

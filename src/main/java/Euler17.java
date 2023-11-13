public class Euler17 {
    public static String countWords(int number) {
        String[] ones1_19 = {
                "",
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine",
                "ten",
                "eleven",
                "twelve",
                "thirteen",
                "fourteen",
                "fifteen",
                "sixteen",
                "seventeen",
                "eighteen",
                "nineteen"};

        String[] tens20_90 = {
                "",
                "",
                "twenty",
                "thirty",
                "forty",
                "fifty",
                "sixty",
                "seventy",
                "eighty",
                "ninety"};

        String words = "";

        if (number <= 19) {
            words += ones1_19[number];
        } else if (number >= 20 && number < 100) {
            words += tens20_90[number / 10] + ones1_19[number % 10];
        } else if (number >= 100 && number < 1000) {
            words += ones1_19[number / 100] + "hundred";
            if (number % 100 != 0) {
                words += "and";
                if (number % 100 <= 19) {
                    words += ones1_19[number % 100];
                } else {
                    words += tens20_90[(number % 100) / 10] + ones1_19[number % 10];
                }
            }
        } else if (number == 1000) {
            words += "onethousand";
        }

        return words;
    }

    public static void main(String[] args) {
        int totalLetters = 0;
        for (int i = 1; i <= 1000; i++) {
            String words = countWords(i);
            totalLetters += words.length();
        }
        System.out.println(totalLetters);
    }
}
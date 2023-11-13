public class Euler26 {
    public static void main(String[] args) {
        int maxLength = 0;
        int d = 0;

        for (int i = 2; i < 1000; i++) {
            int cycleLength = getCycleLength(i);
            if (cycleLength > maxLength) {
                maxLength = cycleLength;
                d = i;
            }
        }

        System.out.println(d);
    }

    public static int getCycleLength(int d) {
        int[] remainders = new int[d];
        int value = 1;
        int position = 0;

        while (remainders[value] == 0 && value != 0) {
            remainders[value] = position;
            value = (value * 10) % d;
            position++;
        }

        return (value == 0) ? 0 : position - remainders[value];
    }
}


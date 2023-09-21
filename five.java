//A loop to sum up the odd numbers from 0 to 99 and print it at the end

class five {
    public static void main(String[] args) {
        int sumOfOdds = 0;
        for (int i = 1; i < 100; i += 2) {
            sumOfOdds += i;
        }
    System.out.println("The odd numbers add up to be: " + sumOfOdds);
    }
}

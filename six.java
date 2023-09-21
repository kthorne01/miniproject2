//A loop to sum up the even numbers from 0 to 99 and print it at the end

class six {
    public static void main(String[] args) {
        int sumOfEvens = 0;
        for (int i = 0; i < 100; i += 2) {
            sumOfEvens += i;
        }
    System.out.println("The even numbers add up to be: " + sumOfEvens);
    }
}
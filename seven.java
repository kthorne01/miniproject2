//A loop that finds the sum of numbers between two numbers given by the user,
//...including the numbers the user gives

import java.util.Scanner;

class seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int startNum = scanner.nextInt();
        System.out.print("Enter your last number: ");
        int endNum = scanner.nextInt();

        int sumOfRange = 0;
        for (int i = startNum; i <= endNum; i++) {
            sumOfRange += i;
        }
        System.out.println("All of the numbers added together would be: " + sumOfRange);
        scanner.close();
    }
}

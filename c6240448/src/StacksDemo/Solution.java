
package StacksDemo;

public class Solution {

    public static int[] reverseArray(int[] numbers) {

        // Create ArrayStack with initial capacity 2
        ArrayStack<Integer> stack = new ArrayStack<>(2);

        // Push all numbers into the stack
        for (int i = 0; i < numbers.length; i++) {
            stack.push(numbers[i]);
        }

        // Create a new array
        int[] reversed = new int[numbers.length];

        // Pop elements into the new array
        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = stack.pop();
        }

        return reversed;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int[] result = reverseArray(numbers);

        System.out.print("Reversed array: ");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

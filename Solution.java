public class Solution {
    private static boolean isPrime(int number) {
        if (number == 0 || number == 1)
            return true;

        return div(number, 2);
    }

    private static boolean div(int number, int divider) {
        if (number == divider)
            return true;
        if (number % divider == 0)
            return false;
        else
            return div(number, divider + 1);
    }
    public static void main(String[] args) {
        System.out.println(div(12, 2));
    }
}
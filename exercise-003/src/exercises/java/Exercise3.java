package exercises.java;

public class Exercise3 {
    public static void main(String[] args) {
        int[] number = new int[] {1, 22, 54, 3, 101};
        int sum = 0;
        for (int item :
                number) {
            sum += item;
        }
        System.out.println(sum);
    }
}
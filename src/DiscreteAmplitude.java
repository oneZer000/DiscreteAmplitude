import java.util.Scanner;

public class DiscreteAmplitude {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        while (x < 1) {
            System.out.print("Enter positive integer: ");
            x = in.nextInt();
        }
        for (int i = -(x-1); i < (x); i++){
            System.out.printf("%d ", i);
        }
        in.close();
    }
}

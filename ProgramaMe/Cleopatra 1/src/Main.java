import java.util.Scanner;
public class Main {
    public static int distA, distC;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRepeticiones = sc.nextInt();
        for (int i = 0; i < numRepeticiones; i++) {
            int numA = sc.nextInt();
            int numB = sc.nextInt();
            int numC = sc.nextInt();

            if (numA * numB > 0) {
                distA = Math.abs(numA - numB);
            } else {
                distA = Math.abs(numA - numB) - 1;
            }

            if (numC * numB > 0) {
                distC = Math.abs(numA - numB);
            } else {
                distC = Math.abs(numA - numB) - 1;
            }

            if (distA>distC){
                System.out.println(numC);
            } else if (distC>distA){
                System.out.println(numA);
            } else {
                System.out.println("EMPATE");
            }
        }
    }
}
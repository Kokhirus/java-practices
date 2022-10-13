import java.util.ArrayDeque;
import java.util.Scanner;

public class pr7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> firstArr = new ArrayDeque<Integer>();
        ArrayDeque<Integer> secondArr = new ArrayDeque<Integer>();

        for (int i = 0; i < 5; ++i) {
            firstArr.add(sc.nextInt());
        }
        for (int i = 0; i < 5; ++i) {
            secondArr.add(sc.nextInt());
        }

        int counter = 0;
        while (counter < 106 && !firstArr.isEmpty() && !secondArr.isEmpty()) {
            int frst = firstArr.pop();
            int scnd = secondArr.pop();
            if (frst > scnd && frst!=9 && scnd!=0 || frst == 0 && scnd == 9) {
                firstArr.add(frst);
                firstArr.add(scnd);
            }
            else {
                secondArr.add(frst);
                secondArr.add(scnd);
            }
            ++counter;
        }

        if(firstArr.isEmpty()) System.out.println("Second wins in " + counter + " steps");
        else if(secondArr.isEmpty()) System.out.println("First wins in " + counter + " steps");
        else System.out.println("No winner?");
    }
}

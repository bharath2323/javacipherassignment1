//Q.8:
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program8 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.println("Number of elements you want to enter:");
        int n= sc.nextInt();
        ArrayList<Integer> list= new ArrayList<>(n);
        int a;
        for(int i=1;i<=n;i++) {
            try
            {
                a=sc.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Sorry You entered String");
                break;
            }
            list.add(a);
        }
        for (Integer integer : list) {
            System.out.println((0.67)*integer);
        }
    }
}
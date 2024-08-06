package conditional;
import java.util.Scanner;
public class straight_line {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x1: ");
        int x1 = sc.nextInt();

        System.out.println("Enter the x2: ");
        int x2 = sc.nextInt();

        System.out.println("Enter the x3: ");
        int x3 = sc.nextInt();

        System.out.println("Enter the y1: ");
        int y1 = sc.nextInt();

        System.out.println("Enter the y2: ");
        int y2 = sc.nextInt();

        System.out.println("Enter the y3: ");
        int y3 = sc.nextInt();

        int m1 = (y2-y1)/(x2-x1);
        int m2 = (y3-y2)/(x3-x2);

        if(m1==m2){
            System.out.println("This is the straight line ");

        }
        else{
            System.out.println("This is not the straight line");
        }
    }

}

import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Fubu Calculator, May i please know your name:");
        String x = sc.nextLine();
        System.out.println("Perfect!!,Choose your Mathematical Operations:");
        System.out.println(" 1)Addition\n 2)Substraction\n 3)Multiplication\n 4)Division\n 5)Modulus");
        int z = sc.nextInt();
        switch(z)
        {
            case 1:
            System.out.println("Addition");
            System.out.println("Enter first digit");
            int y = sc.nextInt();
            System.out.println("Enter second digit");
            int u = sc.nextInt();
            int sum = y+u;
            System.out.println("Answer is: " + sum);
            break;

            case 2:
            System.out.println("Substraction");
            System.out.println("Enter first digit");
            int r = sc.nextInt();
            System.out.println("Enter second digit");
            int a = sc.nextInt();
            int subs = r-a;
            System.out.println("Answer is: " + subs);
            break;

            case 3:
            System.out.println("Multiplication");
            System.out.println("Enter first digit");
            int w = sc.nextInt();
            System.out.println("Enter second digit");
            int g = sc.nextInt();
            int f = w*g;
            System.out.println("Answer is: " + f);
            break;

            case 4:
            System.out.println("Division");
            System.out.println("Enter first digit");
            int v = sc.nextInt();
            System.out.println("Enter second digit");
            int s = sc.nextInt();
            float div = v/s;
            System.out.println("Answer is: " + div);
            break;

            case 5:
            System.out.println("Modulus");
            System.out.println("Enter first digit");
            int i = sc.nextInt();
            System.out.println("Enter second digit");
            int m = sc.nextInt();
            float t = i%m;
            System.out.println("Answer is: " + t);
            break;

            default:
            System.out.println("Hello Everyone,My name is Parth Rohilla,Hope you liked my Calculator.\nplease do share it with your friends,i will be gratefull if you did it,Thank you very much for reviewing it.");
            break;
        }}}
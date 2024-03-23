package Mini_inventory;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        System.out.println("Welcome to  Calculator!");
        System.out.println("=================================");
        System.out.println("           /\\");
        System.out.println("          /  \\");
        System.out.println("         /    \\");
        System.out.println("        /______\\");
        System.out.println("        |      |");
        System.out.println("        |  @   |");
        System.out.println("        |  \\__/|");
        System.out.println("        \\____/ |");
        System.out.println("         |  |__|");
        System.out.println("         |  |  |");
        System.out.println("       __|__|__|__");
        System.out.println("     /\\           /\\");
        System.out.println("    /__\\_________/__\\");
        System.out.println("   |  __   __   __  |");
        System.out.println("   | /  \\ /  \\ /  \\ |");
        System.out.println("   | \\__/ \\__/ \\__/ |");
        System.out.println("   \\________________/");
        System.out.println("=================================");

        Scanner S= new Scanner(System.in);
        System.out.println("Enter your first numer:");
        int a=S.nextInt();
        System.out.println("Enter the second numer");
        int d=S.nextInt();
        System.out.println("Enter the operator you want to use : ");
        char c=S.next().charAt(0);

        if ( c=='+'){
            System.out.print("The result of num 1 and 2 is");
            System.out.print((a+d));}
        else if ( c=='-'){
            System.out.print("The result of num 1 and 2 is");
            System.out.print((a-d));}
        else if ( c=='/'){
            System.out.print("The result of num 1 and 2 is");
            System.out.print((a/d));}
        else if ( c=='*'){
            System.out.print("The result of num 1 and 2 is");
            System.out.print((a*d));}
        else if ( c=='%'){
            System.out.print("The result of num 1 and 2 is");
            System.out.print((a%d));}
        else
            System.out.print("good Luck");
    }
}

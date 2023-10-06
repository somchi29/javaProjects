import java.util.Scanner;

import static java.lang.System.out;

public class MyNameHello {
    public static void main(String[] args) {
        out.print("What's your name: ");
        Scanner Scan = new Scanner(System.in);
        String name = Scan.nextLine();

        String number = null;
        if (name.endsWith(name)) {
            System.out.println("hello " + name);
        }
        else
            out.println("invalid input");


    }
}


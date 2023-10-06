import java.util.Objects;

public class Seven_segments {
    public static void main(String[] args) {
        String[][] score = new String[][]{{"|", "|", "|", "|"}, {"|", "|", "|", "|"}, {"|", "|", "|", "|"}, {"|", "|", "|", "|"}, {"|", "|", "|", "|"}};
        for (int strings = 0; strings < score.length; strings+=2) {
            for (int i = 1; i < score.length; i++) {

                for (int j = 0; j < score.length; j++) {

                    for (int k = 1; k < score.length; k++) {


                    }
                    if (score[j][i].equals("x")) score[j][i] = " ";
                    System.out.print(score[j][j] + "  ");
                }
                System.out.println();

            }

        }
    }
}



//import java.util.Scanner;
//
//public class Seven_segments {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        switch (n) {
//            case 0:
//                System.out.println("-\n  || \n  ||");
//
//
//        }
//    }
//}









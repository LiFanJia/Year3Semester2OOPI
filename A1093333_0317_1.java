import java.util.Scanner;

public class A1093333_0317_1 {

//    TODO the user needs to enter the values n and m and generate the
//     value of n*m and store it in a loop to the 2D array, and read out the data in the array via the for-each loop.
public static void main(String[] args) {

        int  n, m;
        Scanner input = new Scanner(System.in);
        int[][] arrValues = new int[2][2];
        int result;

        for (int i = 0; i < arrValues.length; i++) {
            for (int j = 0; j < arrValues.length; j++) {
                System.out.println("Enter values for row: ");
                n= input.nextInt();
                System.out.println("Enter values for column: ");
                 m= input.nextInt();
                result=n*m;
                arrValues[i][j] = result;
            }
        }
        for(int[] num:arrValues){
            for(int element:num) {
                System.out.print(element + " ");
                System.out.println();
            }
        }
   }
}

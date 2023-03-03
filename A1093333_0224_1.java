import java.util.Scanner;
public class A1093333_0224_1 {

    public void checkOddOrEven(int n){

        if(n%2==0){
            System.out.println("Your number is even");
        }
        else
        {
            System.out.println("Your number is odd");

        }
    }
    public static void main(String[] args){

        int num1;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number to check odd or even: ");
        num1=input.nextInt();
        A1093333_0224_1 check=new A1093333_0224_1();


        check.checkOddOrEven(num1);

    }
}

import java.util.Scanner;

public class A1093333_0421_1 {

    public static void verify(String email){
        if(email.contains("@")&&email.contains(".com")){
            System.out.println("Is Valid email address!");
        }
        else{
            System.out.println("Not valid email address!");
        }

    }
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your email address: ");
        String e= input.nextLine();
        verify(e);
    }
}

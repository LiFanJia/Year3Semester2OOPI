import java.util.Scanner;

public class A1093333_0421_2 {
    public static void greet(){
        Scanner input=new Scanner(System.in);
        System.out.println("Hello, please choose which date format you would like: ");
        System.out.println("Choose Option 1 for YYYY/MM/DD");
        System.out.println("Choose Option 2 for DD/MM/YYYY");
        int option= input.nextInt();


        if(option==1){
            option1();
        }
        else if(option==2){
            option2();
        }
        else{
            System.out.println("Invalid choice!");
        }

    }
    public static void option1(){
        String date;
        System.out.println("Enter the date in format YYYY/MM/DD...");
        System.out.println("Be sure to also enter this sign: \"/\" to separate the values ");


        Scanner input=new Scanner(System.in);

        date=input.nextLine();
        String n=date.substring(0,4);
        int year=Integer.parseInt(n);
        String i=date.substring(5,7);
        int month=Integer.parseInt(i);
        String j=date.substring(8,10);
        int day=Integer.parseInt(j);

        if((year/1000!=0)&&(month<=12)&&(day<=31)) {
            System.out.println(date);
        }
        else
        {
            System.out.println("Wrong format!");
        }
        System.out.print(year + " ");
        switch (month) {
            case 1 -> System.out.print("January");
            case 2 -> System.out.print("February");
            case 3 -> System.out.print("March");
            case 4 -> System.out.print("April");
            case 5 -> System.out.print("May");
            case 6 -> System.out.print("June");
            case 7 -> System.out.print("July");
            case 8 -> System.out.print("August");
            case 9 -> System.out.print("September");
            case 10 -> System.out.print("October");
            case 11 -> System.out.print("November");
            case 12 -> System.out.print("December");
        }
        System.out.print(" "+ day);
    }

    public static void option2(){
        String date;
        System.out.println("Enter the date in format DD/MM/YYYY...");
        System.out.println("Be sure to also enter this sign: \"/\" separate the values ");

        Scanner input=new Scanner(System.in);
        date=input.nextLine();
        String n=date.substring(0,2);
        int day=Integer.parseInt(n);

        String i=date.substring(3,5);
        int month=Integer.parseInt(i);

        String j=date.substring(6,10);
        int year=Integer.parseInt(j);

        if((day<=31)&&(month<=12)&&(year/1000!=0)){
            System.out.println(date);
        }

        else
        {
            System.out.println("Wrong format!");
        }

        System.out.print(day + " ");
        switch (month) {
            case 1 -> System.out.print("January");
            case 2 -> System.out.print("February");
            case 3 -> System.out.print("March");
            case 4 -> System.out.print("April");
            case 5 -> System.out.print("May");
            case 6 -> System.out.print("June");
            case 7 -> System.out.print("July");
            case 8 -> System.out.print("August");
            case 9 -> System.out.print("September");
            case 10 -> System.out.print("October");
            case 11 -> System.out.print("November");
            case 12 -> System.out.print("December");
        }
        System.out.print(" "+ year);
    }

    public static void main(String[] args) {

        greet();

    }


}

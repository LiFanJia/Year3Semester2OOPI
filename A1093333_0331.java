import java.util.Scanner;

public class A1093333_0331 {
    protected static void showInfo() {
        System.out.println("******************");
        System.out.println("歡迎進入冰雪奇緣系統");
        System.out.println("******************");
    }
   //method to accept user input
    static int collectInput() {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value: ");
        x = input.nextInt();
        return x;
    }
   protected static class Animal {
       String name;
       int bodyWeight;
       int speed;
       int age;
       String sound;

       protected Animal() {
           this.name = name;
           this.bodyWeight = bodyWeight;
           this.speed = speed;
           this.age = age;
           this.sound = sound;

       }

       protected double calcDistance(int x, double y) {

           double distance = (x * y * speed);

           return distance;
       }
       protected double calcDistance(int x) {

           double distance = (x * speed);

           return distance;
       }
       protected String show() {
           return " Name: " + name + " Bodyweight: " + bodyWeight + "kg"+ " Speed: " + speed + " Age: " + age + " Sound: " + sound;
       }
   }
       public static class Human extends Animal {
           String gender;

           public Human(){
               this.name=name;
               this.gender=gender;
               this.age=age;
               this.bodyWeight=bodyWeight;
               this.sound=sound;
               this.speed=speed;

           }
           public Human(String name){
               this.name=name;
               this.gender=gender;
               this.age=age;
               this.bodyWeight=bodyWeight;
               this.sound=sound;
               this.speed=speed;

           }
           @Override
           protected String show() {
               int gen=0;
               if(this.gender=="male") {
                   gen+=1;
               }
               else{
                   gen+=2;
               }
               return " Name: " + name + " Bodyweight: " + bodyWeight + "kg "+" Speed: " + speed + " Age: " + age + " Sound: " + sound+"\n"+" Gender: "+gender+ " Gender Code: "+ gen;
           }

       }
    protected static class SnowQueen extends Human {
        int freezingSkill;

        protected SnowQueen(int freezingSkill){
            this.freezingSkill=freezingSkill;

        }
        protected SnowQueen(){

        }
        protected String icePower(int freezingSkill){
            if(this.freezingSkill>0)
                return("Yes");

            else
                return("X");
        }
        protected String show() {
            System.out.println("Original Freezing Power: "+ freezingSkill);
          freezingSkill++;
            return " Name: " + name + " Bodyweight: " + bodyWeight + "kg "+" Speed: " + speed + " Age: " + age + " Sound: " + sound+"\n"+"Freezing Skill Activated! New power: "+(freezingSkill+9000)+ "\nYOur Freezing!...It's over 9000!";
        }

        @Override
        protected double calcDistance(int x, double y) {

            double distance = (x * y * speed)*2;

            return distance;
        }
        @Override
        protected double calcDistance(int x) {

            double distance = (x * speed)*2;

            return distance;
        }
    }
       public static void main(String[] args) {
           showInfo();
        int time;
        double acceleration;

               Animal animal1 = new Animal();
               animal1.name = "Tiger";
               animal1.sound = "Roar!";
               animal1.speed = 15;
               animal1.age = 4;
               animal1.bodyWeight = 70;
           System.out.print("Enter Tiger's time. ");
            time= collectInput();

           System.out.print("Enter Tiger's acceleration. ");
            acceleration=collectInput();

           System.out.println("__________________________________________________");

           Animal animal2 = new Animal();
           animal2.name = "Squirrel";
           animal2.sound = "Squeak!";
           animal2.speed = 7;
           animal2.age = 2;
           animal2.bodyWeight = 15;
           System.out.print("Enter Squirrel's time. ");
           time= collectInput();

           System.out.println("__________________________________________________");

               Human Anna=new Human();
               Anna.name="Anna";
               Anna.gender="female";
               Anna.age=25;
               Anna.speed=20;
               Anna.sound="Hi! Nice to meet you!";
               Anna.bodyWeight=70;
           System.out.print("Enter Anna's time. ");
            time= collectInput();

           System.out.print("Enter Anna's acceleration. ");
            acceleration=collectInput();

           System.out.println("__________________________________________________");

           Human Arkhans=new Human("Arkhans");
           Arkhans.gender="male";
           Arkhans.age=28;
           Arkhans.speed=40;
           Arkhans.sound="What's up?";
           Arkhans.bodyWeight=90;
           System.out.print("Enter Arkhans' time. ");
            time= collectInput();

           System.out.print("Enter Arkhans' acceleration. ");
            acceleration=collectInput();

           System.out.println("__________________________________________________");

          SnowQueen queen=new SnowQueen();
          queen.name="Elsa";
           queen.age=22;
           queen.freezingSkill=30;
           queen.speed=10;
           queen.sound="The cold never bothered me anyway...";
           queen.bodyWeight=45;
           System.out.print("Enter Elsa's time. ");
           time= collectInput();
           System.out.print("Enter Elsa's Acceleration. ");
           acceleration= collectInput();

           System.out.println("****************************************************************************************************");
           System.out.println("Printing Tiger Info...");
           System.out.println(animal1.show());
           System.out.println("Distance= "+ animal1.calcDistance(time,acceleration));
           System.out.println("__________________________________________________");
           System.out.println("Printing Squirrel Info...");
           System.out.println(animal2.show());
           System.out.println("Distance= "+ animal2.calcDistance(time));
           System.out.println("__________________________________________________");
           System.out.println("Printing Anna's Info...");
           System.out.println(Anna.show());
           System.out.println("Distance= "+ Anna.calcDistance(time,acceleration));
           System.out.println("__________________________________________________");
           System.out.println("Printing Arkhan's Info...");
           System.out.println(Arkhans.show());
           System.out.println("Distance= "+ Arkhans.calcDistance(time,acceleration));
           System.out.println("__________________________________________________");
           System.out.println("Printing Elsa's Info...");
           System.out.println(queen.show());
           System.out.println("Distance= "+ queen.calcDistance(time));
           System.out.println("Icepower: "+queen.icePower(queen.freezingSkill));
           System.out.println("__________________________________________________");
       }
}

import java.util.Scanner;

class Animal {
    String name;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    int height;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    int weight;
    int speed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    Animal(String name, int height, int weight, int speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;

    }
    Animal(){
        this.name = name;
        this.height = height;
        this.speed = speed;
    }


    double calcDistance() {
        int x;
        double y;

        double distance;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your time in minutes: ");
        x = input.nextInt();
        System.out.println("Enter your acceleration:");
        y = input.nextDouble();
        distance = x * y * this.speed;

        return distance;

    }

    int calcDistance(int x) {

        int distance;
        distance = x * this.speed;

        return distance;
    }

       public void show() {
        System.out.println("Name: " + this.name + " height: " + this.height + " weight: " + this.weight+ " speed: "+ this.speed);
    }


}
public class A1093333_0324_1 {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Chimp", 54, 80, 55);
        animal1.show();
        System.out.println(animal1.calcDistance(6));
        System.out.println("__________________________________");

        Animal animal2 = new Animal();
        animal2.name="Toucan";
        animal2.speed=5;
        animal2.height=6;
        animal2.weight=23;
        animal2.show();
        System.out.println(animal1.calcDistance());
        System.out.println("__________________________________");


        Animal animal3 = new Animal("Elephant",3,100,10);
        animal3.show();

        System.out.println(animal1.calcDistance());
        System.out.println("__________________________________");


    }


}

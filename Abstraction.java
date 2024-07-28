//1.Abstract Class
// abstract class Animal{
//     abstract void walk();
//     void breathe(){
//         System.out.println("This animal breathes air");
//     }
//     Animal(){
//         System.out.println("You are creating an animal");
//     }
// }
// class Horse extends Animal{
//     Horse(){
//         System.out.println("Now you created a horse");
//     }
//     void walk(){
//         System.out.println("Horse walks on 4 legs");
//     }
// }
// class Chicken extends Animal{
//     void walk(){
//         System.out.println("Chicken walks on 2 legs");
//     }
// }
// public class Abstraction {
//     public static void main(String[] args) {
//         Horse horse=new Horse();
//         horse.breathe();
//         horse.walk();
//     }
    
// }

//2.Interfaces
interface Animal{
    void walk();
}
class Horse implements Animal{
    public void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}
class Chicken implements Animal{
    public void walk(){
        System.out.println("Chicken walk on 2 legs");
    }
}
public class Abstraction{
    public static void main(String[] args) {
        Horse Dangerous=new Horse();
        Dangerous.walk();
        Chicken Sandeep=new Chicken();
        Sandeep.walk();
    }
}
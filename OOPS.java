// // class Student{
// //         String name;
// //         int age;
// //         public void getInfo(){
// //             System.out.println("The name of the student is "+this.name);
// //             System.out.println("The age of the student is "+this.age);
// //         }
// //     }
// //     public class OOPS{
// //         public static void main(String[] args) {
// //             Student s1=new Student();
// //             s1.name="Akash";
// //             s1.age=21;
// //             s1.getInfo();

// //             Student s2=new Student();
// //             s2.name="Priyanka";
// //             s2.age=20;
// //             s2.getInfo();
// //         }
// // }
// // class Pen{
// //     String color;
// //     String type;
// //     public void printColor(){
// //         System.out.println("The color of the pen is "+this.color);
// //     }
// //     public void printType(){
// //         System.out.println("The type of the pen is "+this.type);
// //     }
// // }
// //     public class OOPS{
// //         public static void main(String[] args) {
// //             Pen p1=new Pen();
// //             p1.color="Blue";
// //             p1.type="Ball Pointing";

// //             Pen p2=new Pen();
// //             p2.color="Red";
// //             p2.type="Gel";

// //             p1.printColor();
// //             p1.printType();
// //             p2.printColor();
// //             p2.printType();
// //         }
// //     }
// class Student{ //Compile Time Polymorphism
//     String name;
//     int age;
//     int roll;
//     String gender;
//     public void displayInfo(String name){
//         System.out.println(name);
//     }
//     public void displayInfo(int age){
//         System.out.println(age);
//     }
//     public void displayInfo(String name,int age,int roll,String gender){
//         System.out.println("The name of the student is "+this.name);
//         System.out.println("The age of the student is "+this.age);
//         System.out.println("The roll of the student is "+this.roll);
//         System.out.println("The gender of the student is "+this.gender);
//     }
// }
// public class OOPS{
//     public static void main(String[] args) {
//         Student s1=new Student();
//         s1.name="Akash";
//         s1.age=22;
//         s1.roll=01;
//         s1.gender="Male";

//         Student s2=new Student();
//         s2.name="Priyanka";
//         s2.age=21;
//         s2.roll=63;
//         s2.gender="Female";
        
//         s1.displayInfo(null, 0, 0, null);
//         s2.displayInfo(null, 0, 0, null);

//     }

// }
//Types of Inheritance//
//1.Single Inheritance
class shape{
    public void area(){
        System.out.println("Displays area of shape");
    }
}
class Triangle extends shape{
    public void area(int height,int base){
        System.out.println((1/2)*height*base);
    }
    }

//2.Hierarchial Inheritance
class Shape{
    public void area(){
        System.out.println("Displays area of shape");
    }
}
class Triangle extends shape{
    public void area(int height,int base){
        System.out.println((1/2)*height*base);
    }
    }
class circle extends shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

//3.Multi Level Inheritance
class shape{
    public void area(){
        System.out.println("Displays area of shape");
    }
}
class Triangle extends shape{
    public void area(int height,int base){
        System.out.println((1/2)*height*base);
    }
    }
class equilateralTriangle extends Triangle{
    int side;
}

//4.Hybrid Inheritance:It is a combination of simple,multi level and hierarchial inheritance



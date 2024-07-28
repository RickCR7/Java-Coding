public class Exception {
    public static void main(String[] args) {
//ArrayIndexOutOfBounds Exception
        // int a[]=new int[5];
        // a[5]=30;
        // System.out.println(a[5]);
        

//DivisionByZero Exception
        // int a = 10;
        // int b = 5;
        // int c = 5;
        // int x,y;
        // try{
        //     x=a/(b-c);
        // } catch (ArithmeticException e){
        //     System.out.println("Division by zero");
        //     System.out.println("Exception type = "+e);
        // }
        // y=a/(b+c);
        // System.out.println("Y = "+y);


//Nested Try Block
        // try{
        //     int a=2,b=4,c=2,x=7,z;
        //     int p[]={2};
        //     p[3]=33;
        //     try{
        //         z=x/((b*b)-(4*a*c));
        //         System.out.println(("Value of z is "+z));
        //     } catch (ArithmeticException e){
        //         System.out.println("Arithmetic Exception : "+e);
        //     }
        // } catch (ArrayIndexOutOfBoundsException e){
        //     System.out.println("Array Index Out Of Bounds");
        // }

        
//NumberFormat Exception        
        // try{
        //         int a,b,c;
        //         a=Integer.parseInt(args[0]);
        //         b=Integer.parseInt(args[1]);
        //         // try{
        //         //         c=a/b;
        //         //         System.out.println("C = "+c);
        //         // } catch (ArithmeticException e) {
        //         //         System.out.println("Zero Division Error");
        //         // }
        // } catch (NumberFormatException e) {
        //         System.out.println("Input is not an integer "+ e);
        // }
}
}

//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class Program3 {
    public static void main(String[] args){
        //Make a scanner
        Scanner myScanner = new Scanner(System.in);
        //Create my variables
        int length = 0;
        int width = 0;
        int area = 0;
        int perimeter=0;
        
        //Ask user for input
        System.out.println("Enter the length:");
      
          //Get the input
        length = myScanner.nextInt();
        
        System.out.println("Enter the width:");
        
        
        width = myScanner.nextInt();
      
        //Calculate 
        area = length * width;
        perimeter = 2 * length + 2 * width;
        
        //Output 
        System.out.println("The length is: " + length);  
        System.out.println();
        System.out.println("The width is: " + width);
        System.out.println();
    
        System.out.println("The area is: " + area);
        System.out.println();
        
        System.out.println("The perimeter is: " + perimeter);
        System.out.println();
        
        
        
    }
}


//Paste console output below:
/*
Enter the length:
5
Enter the width:
6
The length is: 5

The width is: 6

The area is: 30

The perimeter is: 22

*/

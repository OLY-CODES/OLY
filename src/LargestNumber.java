<<<<<<< HEAD
import java.util.Scanner;

    public class LargestNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number");
            double number1=scanner.nextDouble();
            System.out.println("Enter second number");
            double number2=scanner.nextDouble();

            if(number1>number2){
                System.out.println("The largest number is " +number1);
            }else if(number2>number1){
                System.out.println("The largest number is " +number2);
            }else {
                System.out.println("the numbers are equal");
            }
        }
    }


=======
package PACKAGE_NAME;

public class LargestNumber {
}
>>>>>>> d9fba785e99eb03082ba78640c92d5e1d27da26f

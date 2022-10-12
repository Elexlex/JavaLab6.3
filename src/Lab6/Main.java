package Lab6;
import java.util.Scanner;
public class Main {
    //asks the amount of elements, inputs every element and show the work of 2 methods
    public static void main(String[] args){
        Interface[] inter = {new One(), new Two()};
        Scanner num = new Scanner(System.in);
        int number;
        do{
            System.out.print("Enter the size of the array (min 5): ");
            number = num.nextInt();
        } while (number<5);
        int[] arr = new int[number];
        for (int i = 0; i<number; i++){
            System.out.print("Element #" + (i+1) + ": ");
            arr[i] = num.nextInt();
        }
        System.out.println("\nThe amount of even elements: " + inter[0].fold(arr));
        System.out.println("\nThe amount of not even elements: " + inter[1].fold(arr));
    }
}

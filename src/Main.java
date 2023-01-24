import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int [] arr=new int[10];
        //Creating an array
        Scanner src=new Scanner(System.in);//Creating scanner to take input and insert in the array.
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=src.nextInt();
        }//Taking input array
        for(int val:arr)
        {
            System.out.println(val);
        }//Printing the array
    }
}
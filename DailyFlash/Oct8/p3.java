//WAP for 2d jagged array from useer and print the sum of all elements

import java.util.Scanner;
class Program {
        public static void main(String[] args) {

                //create connection of system.in with the scanner class
                Scanner sc = new Scanner(System.in);

                //var to store the sum
                int sum = 0;
                System.out.println("Enter how may rows are there for an array: :");
                int row  = sc.nextInt(), col = 0;
                //declare an array of row
                int[][] arr = new int[row][];

                for(int olc =0; olc<row; olc++) {
                        //take how many elements for row olc
                        System.out.println("Enter how many elements are there for row " + olc +": ");
                        col= sc.nextInt();

                        //declare an 1D array
                        arr[olc] = new int[col];
                        System.out.println("Enter elements: ");
                        for(int ilc=0; ilc < col; ilc++) {
                                arr[olc][ilc] = sc.nextInt();
                                sum +=arr[olc][ilc];
                        }

                }

                //print entered array
                System.out.println("Entered array: ");
                for(int olc = 0; olc < arr.length; olc++) {
                        for(int ilc=0; ilc<arr[olc].length; ilc++) {
                                System.out.print(arr[olc][ilc] + "  ");
                        }
                        System.out.println();
                }

                System.out.println("Sum of all elements : "+sum);

        }
}

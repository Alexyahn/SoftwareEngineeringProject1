package project1;

import java.util.Scanner;
/*
 * @author Alex Yahn
 * Project Name: Pet Database
 */
public class Project1 {

   static String[] names = new String[1000];
   static Integer[] ages = new Integer[1000];
   static Scanner input = new Scanner(System.in);
   static int counter = 0;
   
   public static void main(String[] args) {
       System.out.println("Pet Database Program.");
       while(true) {
           System.out.println("What would you like to do?\n" +
                   " 1) View all pets\n" +
                   " 2) Add more pets\n" +
                   " 7) Exit program");
           System.out.print("Your choice: ");
           
           int choice = input.nextInt();
           
           switch(choice) {
           case 1:
               display();
               break;
           case 2:
               add();
               break;
           case 7:
               System.out.println("\nGoodbye!");
               System.exit(0);
               break;
           }
       }
   }
   
      private static void display() {
       // TODO Auto-generated method stub
       System.out.println("+-----------------------+" + 
               "\n| ID |  NAME     |  AGE |" + 
               "\n+-----------------------+");
       for(int i = 0; i < counter; i++) {
           //Format better with System.out.printf();
           System.out.println("|  " + i + " | \t"  + names[i] + "\t" + "|  " + ages[i] + "   |");
       }
       System.out.println("+-----------------------+\n");
       System.out.println(counter + " rows in set.\n\n");
      }
   
   
      private static void add() {
       Scanner input2 = new Scanner(System.in);
       int count = 0;
       String dataIn = "";       
       while(counter <= 4) {
           System.out.print("add pet (name, age):");
           String entry = input2.nextLine();
           String[] arr = entry.split(" ");
           String name = arr[0];
           Integer age = Integer.valueOf(arr[1]);
          
           if(arr.length != 2) {
               System.out.println("Error:" + entry + " is not a valid input");
               break;
           }
           else if(age < 1 || age > 100 ) {
               System.out.println("Error: " + age + " is not a valid age.");
               break;
           }
           else{
                names[counter] = name;
                ages[counter] = age;
                count++;
                counter++;
           }

       }
       
       if(count == counter) {
           System.out.println(counter + " pets added");
       }
   }

}


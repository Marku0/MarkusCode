import java.util.Scanner;
/*
 * Author: Marku
 * Proeject aim: testing diffrent string methods that user typs in
 */

public class T25 {
    public static void main(String []args){

            Scanner inputs = new Scanner (System.in);
            
            System.out.print("Please enter a String :   ");
                String jomle = inputs.nextLine();

            System.out.print("please enter a number :    ");
                int number = inputs.nextInt();

            outer:
            if (number <=7){
            switch (number) {
                case 1:
                    jomle.length();
                    break;
                case 2:
                    char a = jomle.charAt(5);
                        System.out.println(a);
                    break;
                case 3:
                    String b = jomle.substring(3, 9);
                        System.out.println(b);
                    break;
                case 4:
                    String z = jomle.trim();
                        System.out.println(z);
                    break;
                case 5:
                    String c = jomle.replace("kir", "kos");
                        System.out.println(c); 
                    break;
                case 6:
                    String f = jomle.toLowerCase();
                        System.out.println(f);
                    break;
                case 7:
                    boolean l = jomle.equals("kir");
                        System.out.println(l);
                    break;
            
                default:
                    break;
            }
        }
            else{System.out.println("you have entered the wrong number !!!");}
    }
}

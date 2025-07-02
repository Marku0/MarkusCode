import java.util.Scanner;
/*
 * Author: Marku
 * Project aim: Checking your Card number
 */
public class VMBanking {
    public static void main(String[] args) {
        System.out.print("Please enter your Card number:   ");
            Scanner input = new Scanner(System.in);
        String cardInteger = input.nextLine();
            String regex = "\\d{4}\\s\\d{4}\\s\\d{4}\\s\\d{4}";

        boolean checkCard = cardInteger.matches(regex);
        if (checkCard) { System.out.println(true);}
        else {System.out.println(false);}
    }
    
}

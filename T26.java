

public class T26 {
    /*
     * Author: Marku
     * Project aim: regex(regular expressions)
     */
    public static void main(String[] args) {
            
        String load = "09121234567";
            String regex = "^0912\\d{7}$";
        
        boolean check = load.matches(regex);
            if (check){
                System.out.println(true);}
            else {System.out.println(false);}
            
    }
    
}

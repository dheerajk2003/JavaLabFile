import java.util.*;
class LeapYear{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0)
                    System.out.println("Leap Year");
                else
                    System.out.println("Not a Leap Year");
                return;
            }
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
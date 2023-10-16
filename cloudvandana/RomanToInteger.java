import java.util.HashMap;
import java.util.Scanner;


public class RomanToInteger {
    public static void main(String[] args) {
       System.out.println("Enter the roman letter");
        Scanner sc=new Scanner(System.in); 
        String romanNumeral=sc.nextLine();
        int result = romanToInt(romanNumeral);
        System.out.println(romanNumeral + " = " + result);
        sc.close();
    }

    public static int romanToInt(String s) {
        
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

       
        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanValues.get(s.charAt(i));

            
            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }

            prevValue = currValue;
        }

        return result;
    }
}

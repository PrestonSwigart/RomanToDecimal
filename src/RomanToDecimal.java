import java.util.Scanner;

public class RomanToDecimal {
    public static int romanToDecimal(String roman){
        int sum = 0;
        roman = roman.toUpperCase();
        for(int i = 0; i < roman.length(); i++) {
            char temp = roman.charAt(i);
            if (temp == 'I')
                sum += 1;
            else if(temp == 'V')
                sum += 5;
            else if(temp == 'X')
                sum += 10;
            else if(temp == 'L')
                sum += 50;
            else if(temp == 'C')
                sum += 100;
            else if(temp == 'D')
                sum += 500;
            else if(temp == 'M')
                sum += 1000;
            else
                return -1;
        }

        if(roman.indexOf("IV") != -1)
            sum -= 2;
        if(roman.indexOf("IX") != -1)
            sum -= 2;
        if(roman.indexOf("XL") != -1)
            sum -= 20;
        if(roman.indexOf("XC") != -1)
            sum -= 20;
        if(roman.indexOf("CD") != -1)
            sum -= 200;
        if(roman.indexOf("CM") != -1)
            sum -= 200;

        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a roman numeral: ");
        String roman = in.nextLine();
        System.out.println(romanToDecimal(roman));

    }
}

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

        return sum;
    }

    public static void main(String[] args) {
        for(String roman : args) {
            System.out.println("input " + roman + " output " + romanToDecimal(roman));
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1;
        int num2;
        int result;
        char operator;
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        String[] parsedExpr = expression.split(" ");
        operator = parsedExpr[1].charAt(0);

        try {
            num1 = Integer.parseInt(parsedExpr[0]);
            num2 = Integer.parseInt(parsedExpr[2]);
            if (num1 <1 || num1 > 10 || num2 < 1 || num2 > 10 ){
                throw new IllegalArgumentException("Out of range!!");
            }

            result = Calculator.calculate(num1,num2,operator);
            System.out.println(result);

        }catch (IllegalArgumentException e){

            num1 = RomanNumeral.romanToArabic(parsedExpr[0]);
            num2 = RomanNumeral.romanToArabic(parsedExpr[2]);
            if (num1 <1 || num1 > 10 || num2 < 1 || num2 > 10 ){
                throw new IllegalArgumentException("Out of range!!");
            }

            result = Calculator.calculate(num1,num2,operator);
            System.out.println(RomanNumeral.arabicToRoman(result));

        }

    }
}

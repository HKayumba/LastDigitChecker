public class Main {
    public static void main(String[] args) {

    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if((num1 < 10 || num1 > 1000) || (num2 < 10 || num2 > 1000) || (num3 < 10 || num3 > 1000)){
            return false;
        } else if ((num1 % 10 == num2 % 10 || num1 % 10 == num3 % 10) || (num2 % 10 == num1 % 10 ||
                num2 % 10 == num3 % 10) || (num3 % 10 == num1 % 10 || num3 % 10 == num2 % 10)) {
            return true;
        }
        return false;
    }
    public static boolean isValid(int number){
        if(number < 10 || number > 1000){
            return false;
        }else {
            return true;
        }
    }
}
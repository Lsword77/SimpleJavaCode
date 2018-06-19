public class Main {
    public static void main(String[] args) {
       // System.out.println("sum of digit: " + sumDigits(155));
       // System.out.println("Hello");
        System.out.println("Reverse number compare: " + isPalindrome(121));
    }

    public static int sumDigits(int digit){
        if(digit<10){
            return -1;
        }

        int sum =0;
        int temp =0;
        while (digit >0){
            temp = digit %10;
            sum += temp;
            digit = digit/10;
       }

       return  sum;
    }

    public static boolean isPalindrome(int number){

        int reverse =0;
        while (number>0){
            int temp = number%10;
            reverse = (reverse * 10)+temp;
            number /= number;
        }

        if (number == reverse){
            return true;
        }
        else{
            return false;
        }
    }
}

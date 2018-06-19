public class Main {
    public static void main(String[] args) {
        System.out.println("Hello worldv ");
       // System.out.println("Result of 1234 is: "+ sumFirstAndLastDigit(4253));
    }

    public static int sumFirstAndLastDigit(int num){
        if (num < 0){
            return -1;
        }

        int result =0;
        while(num >0){
            int temp = num%10;
            num = num/10;

            if(num <10){
                result = temp + num;
            }
        }
        return result;
    }
}

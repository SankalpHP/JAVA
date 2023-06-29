package Code;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        //System.out.println(findNumbers(nums));
        System.out.println(digits2(537282));
    }

    static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums) {
            if(even(num)){
                count++;
            }
        }
       return count;
    }

    static boolean even(int num){
         int numberofDigits = digits2(num);
         /*
          if (numberofDigits  % 2 == 0) {
            return true;
        }
        return false;
         */
        return numberofDigits % 2 == 0;
    }

    //Shortcut to find a digits
    static int digits2(int num){

        if (num < 0){
            num *= -1;
        }
        if(num == 0){
            return 1;
        }

        return (int)(Math.log10(num)) + 1;
    }

    //long cut to find digits

//    static int digits(int num){
//
//        if (num < 0){
//            num *= -1;
//        }
//        if(num == 0){
//            return 1;
//        }
//
//        int count = 0;
//        while (num > 0){
//            count++;
//            num /= 10;
//        }
//        return count;
//    }


}

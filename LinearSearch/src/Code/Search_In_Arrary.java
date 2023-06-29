package Code;

public class Search_In_Arrary {

    public static void main(String[] args) {

        int[] arr = {23,45,1,2,8,19,-3,16,-11,28};
        int target = 19;
//        int ans = linersearch(arr,target);
//        System.out.println(ans);

//        int ans2 = linersearch2(arr,target);
//        System.out.println(ans2);

        boolean ans3 = linersearch3(arr,target);
        System.out.println(ans3);

    }

    // search in the array: return the index if item found
    //otherwise if item not found return -1

//    static int linersearch(int[] nums,int target){
//        if (nums.length == 0){
//            return -1;
//        }
//
//        //run a for loop
//        for (int Index = 0; Index < nums.length; Index++) {
//            int element = nums[Index];
//            if(element == target){
//                return Index;
//            }
//        }
//        // this line will execute if none of the statement above have executed
//        //hence the target not found
//        return -1;
//    }

    //Search the target and return the element

//    static int linersearch2(int[] nums,int target){
//        if (nums.length == 0){
//            return -1;
//        }
//
//        //run a for loop
//        for (int element : nums) {
//            if (element == target) {
//                return element;
//            }
//        }
//        // this line will execute if none of the statement above have executed
//        //hence the target not found
//        return -1;
//    }

    //Search the target and return the true or false

    static boolean linersearch3(int[] nums,int target){
        if (nums.length == 0){
            return false;
        }

        //run a for loop
        for (int element : nums) {
            if (element == target) {
                return true;
            }
        }
        // this line will execute if none of the statement above have executed
        //hence the target not found
        return false;
    }


}

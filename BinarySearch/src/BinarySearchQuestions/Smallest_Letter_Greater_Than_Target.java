package BinarySearchQuestions;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
//Similar as Ceiling problem
//just ignore that target == mid conditions
//also if target not found return the 1st element in the array

public class Smallest_Letter_Greater_Than_Target {

    public static void main(String[] args) {
           char[] letter = {'c','f','j'};
           char target = 'c';
          char ans =  nextGreatestLetter(letter,target);
        System.out.println(ans);

    }

    public static char nextGreatestLetter(char[] letters, char target) {
           int start = 0;
           int end = letters.length - 1;

           while (start <= end){
                int mid = start + (end - start)/2;

               if (target < letters[mid]) {
                   end = mid - 1;

               }else {
                   start = mid + 1;
               }
           }
           return letters[start % letters.length];
    }
}

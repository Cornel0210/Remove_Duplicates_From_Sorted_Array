import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        System.out.println(removeDuplicates2(new int[]{1,1,2,2,3,3,3,4,9,9,9}));
        System.out.println(removeDuplicates2(new int[]{1,1,2}));
    }

    //remove duplicates from a sorted array and move in-place elements
    //return number of unique elements
    public static int removeDuplicates(int[] nums) {
        int initPos = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]){
                nums[initPos++] = nums[i];
            }
        }
        return initPos;
    }

    public static int removeDuplicates2(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if (set.add(nums[i])){
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
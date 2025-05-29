package Array;
import java.util.*;

class SortColors75 {
    public static void sortColors(int[] nums) {
        int n = nums.length;
        int[] count = new int[3];

        for(int i =0;i<n;i++){
            if(nums[i] == 0){
                count[0]++;
            }
            else if(nums[i] == 1){
                count[1]++;
            }
            else{
                count[2]++;
            }
        }
        int j =0;
        for(int i =0;i<=2;i++){
            while(count[i] != 0 && i == 0){
                nums[j++] = 0;
                count[i]--;
            }
            while(count[i] != 0 && i == 1){
                nums[j++] = 1;
                count[i]--;
            }
            while(count[i] != 0 && i == 2){
                nums[j++] = 2;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {2, 0, 2, 1, 1, 0};
        sortColors(nums);

        for(int i =0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
}

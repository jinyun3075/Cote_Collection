package programmers.week_5;

import java.util.HashSet;
//import java.util.ArrayList;


public class Pro1845 {
    public static void main(String[] args) {
        int[] a = {3,4,1,2};
        System.out.println(solution(a));
    }

    public static int solution(int[] nums) {
        // 옛날에 풀었던것
        // ArrayList<Integer> arr =new ArrayList<>();
        // arr.add(nums[0]);
        // for(int i=1;i<nums.length;i++){
        //     if(!arr.contains(nums[i])){
        //         arr.add(nums[i]);
        //     }
        // }
        // if(arr.size()>nums.length/2)
        //     return nums.length/2;
        // return arr.size();

        HashSet<Integer> tree = new HashSet<Integer>() ;
        for(int e : nums) {
            tree.add(e);
        }
        return Math.min(tree.size(),nums.length/2);
    }
}

import java.util.ArrayList;
import java.util.List;

public class LeetCode0004 extends BaseLeetCode  {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> nums3 = new ArrayList<>();
        int i = 0,j = 0;
        nums1 = dealArray(nums1);
        nums2 = dealArray(nums2);
        int size1 = nums1.length,size2 = nums2.length;
        for (;i<size1&&j<size2;) {
            if (nums1[i] < nums2[j]) {
                nums3.add(nums1[i]);
                i++;
            } else if(nums2[j] < nums1[i]) {
                nums3.add(nums2[j]);
                j++;
            } else if(nums2[j] == nums1[i]) {
                nums3.add(nums1[i]);
                i++;
            }
        }
        for (;i<size1;i++) {
            nums3.add(nums1[i]);
        }
        for (;j<size2;j++) {
            nums3.add(nums2[j]);
        }
        int number = nums3.size();
        if (number%2 == 0) {
            int middle = number/2;
            return (nums3.get(middle-1) * 1.0 + nums3.get(middle))/2;
        } else {
            int middle = number/2;
            return nums3.get(middle);
        }
    }

    private int[] dealArray(int[] origin) {
        if(origin == null||origin.length == 0) {
            return new int[0];
        }
        if(origin.length == 1) {
            return origin;
        }
        int first = 0,finanlly = origin.length-1;
        if(origin[first] == origin[finanlly]||origin[first] < origin[finanlly]) {
            return origin;
        }
        int i = origin.length-1;
        List<Integer> middle = new ArrayList<>();
        for (;i>=0;i--) {
            middle.add(origin[i]);
        }
        for (i=0;i<origin.length;i++) {
            origin[i] = middle.get(i);
        }
        return origin;
    }

    public static void main(String[] args) {
        LeetCode0004 leetCode0004 = new LeetCode0004();
        int[] nums1 = new int[]{1,1,1,1,1,1,1,1,1,1,4,4};
        int[] nums2 = new int[]{1,3,4,4,4,4,4,4,4,4,4};
        System.out.println(leetCode0004.findMedianSortedArrays(nums1,nums2));
    }
}

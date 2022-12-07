public class LeetCode0003 extends BaseLeetCode  {
    public int lengthOfLongestSubstring(String s) {
        int  size,i=0,j,k,max=0;
        size = s.length();
        for(j = 0;j<size;j++){
            for(k = i;k<j;k++)
                if(s.charAt(k)==s.charAt(j)){
                    i = k+1;
                    break;
                }
            if(j-i+1 > max)
                max = j-i+1;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode0003().lengthOfLongestSubstring("aaa"));
    }
}

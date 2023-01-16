import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode0017 extends BaseLeetCode {

    private static List<List<String>> BOOK;

    static {
        BOOK = new ArrayList<>();
        List<String> book = new ArrayList<>();
        BOOK.add(book);
        book = new ArrayList<>();
        BOOK.add(book);
        book = Arrays.asList("a","b","c");
        BOOK.add(book);
        book = Arrays.asList("d","e","f");
        BOOK.add(book);
        book = Arrays.asList("g","h","i");
        BOOK.add(book);
        book = Arrays.asList("j","k","l");
        BOOK.add(book);
        book = Arrays.asList("m","n","o");
        BOOK.add(book);
        book = Arrays.asList("p","q","r","s");
        BOOK.add(book);
        book = Arrays.asList("t","u","v");
        BOOK.add(book);
        book = Arrays.asList("w","x","y","z");
        BOOK.add(book);
    }

    public static void main(String[] args) {
        solution(new LeetCode0017().letterCombinations("234"));
    }

    public List<String> letterCombinations(String digits) {
        int length = digits.length();
        if(length == 0) {
            return new ArrayList<>();
        }
        return digui(digits);
    }

    private List<String> digui(String digits) {
        int length = digits.length();
        if(length == 1) {
            int index = Integer.parseInt(digits);
            return BOOK.get(index);
        }
        int index = Integer.parseInt(digits.substring(length-1));
        List<String> book = BOOK.get(index);
        List<String> before = digui(digits.substring(0,length-1));
        List<String> result = new ArrayList<>();
        for (int i=0;i<before.size();i++) {
            for (int j=0;j<book.size();j++) {
                result.add(before.get(i) + book.get(j));
            }
        }
        return result;
    }
}
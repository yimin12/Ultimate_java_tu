package AGenius.Algorithm.Datastructure.stack.monotonousStack;

/**
 * Given string A representing a positive integer which has N digits, remove any k digits of the number, the remaining
 * digits are arranged according to the original order to become a new positive integer.
 * Input: A = "178542", k = 4
 * Output:"12"
 */
public class DeleteDigit {


    /**
     *@param A: A positive integer which has N digits, A is a string.
     *@param k: Remove k digits.
     *@return: A string
     *
     * Time: O(nk)
     * Space: O(n) worst case
     */
    public String DeleteDigits(String A, int k) {
        StringBuffer sb = new StringBuffer(A);
        int i, j;
        for (i = 0; i < k ; i ++) {
            for(j = 0; j < sb.length() - 1 && sb.charAt(j) <= sb.charAt(j + 1); j ++) {}
            sb.delete(j, j + 1);

        }
        while (sb.length() > 1 && sb.charAt(0) == '0') sb.delete(0, 1);
        return sb.toString();
    }
}

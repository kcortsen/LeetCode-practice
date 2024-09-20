public class IsPalindrome {

    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        StringBuilder numReversed = new StringBuilder();

        numReversed.append(num);
        numReversed.reverse();

        if (num.equals(numReversed.toString())) {
            return true;
        }
        return false;
    }
}

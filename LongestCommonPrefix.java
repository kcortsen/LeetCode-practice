public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        int count = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].charAt(count) == strs[i + 1].charAt(count)) {
                prefix += strs[i].charAt(count);
                count++;
            }
        }
        return prefix;
    }
}

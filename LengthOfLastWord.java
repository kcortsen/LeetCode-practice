public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int wordLength = 0;

        String improvedS = s.trim();

        for (int i = 0; i < improvedS.length(); i++) {
            if (improvedS.charAt(i) == ' ') {
                wordLength = 0;
            } else {
                wordLength++;
            }
        }
        return wordLength;
    }
}

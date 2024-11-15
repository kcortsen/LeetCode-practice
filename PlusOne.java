public class PlusOne {

    public int[] plusOne(int[] digits) {
        int length = digits.length;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] newArray = new int[length + 1];
        newArray[0] = 1;

        return newArray;
    }
}

public class MaximumLengthString {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "kiwi", "strawberry", "grape"};

        int longestLength = findLongestLength(arr);
        System.out.println("The length of the longest string is: " + longestLength);
    }

    static int findLongestLength(String[] arr) {
        int maxLength = 0;


        for (String str : arr) {
            if (str.length() > maxLength) {
                maxLength = str.length();

            }
        }

        return maxLength;
    }
}

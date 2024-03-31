public class remove_duplicate {
    public static void main(String[] args) {
        String input = "abrakadabra";
        String result = removeDuplicates(input);
        System.out.println("Original string: " + input);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        char[] chars = str.toCharArray();
        int length = chars.length;

        // Loop through each character in the string
        for (int i = 0; i < length; i++) {
            char currentChar = chars[i];

            // Check if the current character is already processed
            if (currentChar == '\0') {
                continue;
            }

            // Loop through the remaining characters
            for (int j = i + 1; j < length; j++) {
                // If a duplicate character is found, replace it with '\0'
                if (currentChar == chars[j]) {
                    chars[j] = '\0';
                }
            }
        }

        // Create a new string without the duplicate characters
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (c != '\0') {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}

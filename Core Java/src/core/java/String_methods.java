package core.java;

public class String_methods {
    public static void main(String[] args) {

        // Create Strings
        String str = "  Hello Java World  ";
        String str2 = "hello java world";

        System.out.println("Original String: '" + str + "'");

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. charAt()
        System.out.println("Character at index 4: " + str.charAt(4));

        // 3. toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // 4. toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // 5. trim()
        System.out.println("Trimmed: '" + str.trim() + "'");

        // 6. substring()
        System.out.println("Substring(2, 9): " + str.substring(2, 9));

        // 7. equals()
        System.out.println("Equals str & str2: " + str.equals(str2));

        // 8. equalsIgnoreCase()
        System.out.println("Equals Ignore Case: " + str.trim().equalsIgnoreCase(str2));

        // 9. contains()
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // 10. replace()
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));

        // 11. split()
        String[] words = str.trim().split(" ");
        System.out.println("Split words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 12. indexOf()
        System.out.println("Index of 'Java': " + str.indexOf("Java"));

        // 13. lastIndexOf()
        System.out.println("Last Index of 'o': " + str.lastIndexOf('o'));

        // 14. startsWith()
        System.out.println("Starts with '  He': " + str.startsWith("  He"));

        // 15. endsWith()
        System.out.println("Ends with 'ld  ': " + str.endsWith("ld  "));

        // 16. concat()
        System.out.println("Concatenate: " + str.trim().concat(" Rocks!"));

        // 17. isEmpty()
        String emptyStr = "";
        System.out.println("Is empty string: " + emptyStr.isEmpty());

        // 18. matches() - regex check
        System.out.println("Matches only letters & spaces: " + str.trim().matches("[a-zA-Z ]+"));
    }
}

/**
 * OOPSBannerApp UC8 – Use Map for Character Patterns and Render via Function
 *
 * This use case extends UC7 by utilizing the Java Collections Framework
 * to manage character patterns using a HashMap. The application retrieves
 * and displays the "OOPS" banner using these mappings.
 *
 * @author Developer
 * @version 8.0
 */

import java.util.HashMap;

public class OOPSBannerApp {

    /**
     * Creates a HashMap containing ASCII art patterns for supported characters.
     * Each character maps to an array of strings where each string represents
     * one line of the character's ASCII art pattern.
     *
     * @return HashMap<Character, String[]> storing character patterns
     */
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        charMap.put('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        charMap.put('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        return charMap;
    }

    /**
     * Displays a banner message using ASCII patterns from the map.
     *
     * @param message The word to display
     * @param charMap Map storing character patterns
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = charMap.get(ch);

                sb.append(pattern[line]).append(" ");
            }

            System.out.println(sb.toString());
        }
    }

    /**
     * Main method – Entry point of the program
     */
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}
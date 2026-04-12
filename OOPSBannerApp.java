/**
 * OOPSBannerApp UC7 – Store Character Pattern in a Class
 *
 * This use case extends UC6 by implementing a CharacterPatternMap class
 * to encapsulate character-to-pattern mappings. The application retrieves
 * and displays the "OOPS" banner using these mappings.
 *
 * @author Developer
 * @version 7.0
 */

// Extend the User Story 6 to implement a CharacterPatternMap class encapsulating character patterns
// The application retrieves and displays the "OOPS" banner using these mappings
// This addresses the drawback of not having a centralized pattern management system

// Key Requirements:
// 1. Create CharacterPatternMap class to hold character and its pattern
// 2. Implement methods to create and retrieve character patterns
// 3. Use CharacterPatternMap to display the "OOPS" banner
// 4. Implement modular and reusable character pattern management

public class OOPSBannerApp {

    /**
     * CharacterPatternMap – Inner class for storing character-to-pattern mappings
     * Encapsulates a single character and its corresponding ASCII art pattern.
     */
    static class CharacterPatternMap {

        /** The character being represented */
        private char character;

        /** ASCII art pattern lines for the character */
        private String[] pattern;

        /**
         * Constructor
         * @param character the character to map
         * @param pattern ASCII pattern representation
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return stored character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return ASCII pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }


    /**
     * Static method to create and initialize CharacterPatternMap array
     * @return array containing mappings for O, P, S and space
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] characterPatternMap = new CharacterPatternMap[4];

        characterPatternMap[0] = new CharacterPatternMap('O', new String[]{
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        });

        characterPatternMap[1] = new CharacterPatternMap('P', new String[]{
                "***** ",
                "*   * ",
                "*   * ",
                "***** ",
                "*     ",
                "*     ",
                "*     "
        });

        characterPatternMap[2] = new CharacterPatternMap('S', new String[]{
                " *****",
                "*     ",
                "*     ",
                " **** ",
                "     *",
                "     *",
                "***** "
        });

        characterPatternMap[3] = new CharacterPatternMap(' ', new String[]{
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      "
        });

        return characterPatternMap;
    }


    /**
     * Retrieves ASCII pattern for a given character
     * @param ch character to search
     * @param charMaps pattern map array
     * @return ASCII pattern
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        return new String[]{
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      ",
                "      "
        };
    }


    /**
     * Prints a message as ASCII banner
     * @param message word to display
     * @param charMaps character pattern map
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        int height = 7;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = getCharacterPattern(ch, charMaps);
                line.append(pattern[i]).append(" ");
            }

            System.out.println(line);
        }
    }


    /**
     * Main method – Entry point
     */
    public static void main(String[] args) {

        // Create pattern map array
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        // Message to display
        String message = "OOPS";

        // Print banner
        printMessage(message, charMaps);
    }
}
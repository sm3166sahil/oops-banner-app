public class UC7_OOPS_Banner_ClassBased {

    public static void main(String[] args) {
        CharacterPatternMap O = new CharacterPatternMap('O', buildOPattern());
        CharacterPatternMap P = new CharacterPatternMap('P', buildPPattern());
        CharacterPatternMap S = new CharacterPatternMap('S', buildSPattern());
        CharacterPatternMap[] word = { O, O, P, S };
String[] banner = new String[7];
 for (int row = 0; row < 7; row++) {

            StringBuilder sb = new StringBuilder();

            for (CharacterPatternMap cp : word) {
                sb.append(cp.getPattern()[row]);
            }

            banner[row] = sb.toString();
        }
for (String line : banner) {
            System.out.println(line);
        }
    }
static class CharacterPatternMap {

        private char character;
        private String[] pattern;
public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }
public String[] getPattern() {
            return pattern;
        }
    }
public static String[] buildOPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        };
    }

public static String[] buildPPattern() {
        return new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        };
    }
 public static String[] buildSPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                " *       ",
                "  *****  ",
                "       * ",
                " *     * ",
                "  *****  "
        };
    }
}
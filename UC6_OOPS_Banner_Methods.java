public class UC6_OOPS_Banner_Methods {
public static void main(String[] args) {
String[] O = buildO();
String[] P = buildP();
String[] S = buildS();
String[] banner = new String[7];
for (int i = 0; i < 7; i++) {
banner[i] = String.join("",
O[i],  
O[i],   
P[i],
S[i]
 );
 }
for (String line : banner) {
System.out.println(line);
 }
}
public static String[] buildO() {
return new String[] {
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        };
    }
public static String[] buildP() {
return new String[] {
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        };
    }
public static String[] buildS() {
return new String[] {
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
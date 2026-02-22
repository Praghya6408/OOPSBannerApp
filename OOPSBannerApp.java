public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
            " *****   *****   *****   ***** ",
            "*     * *     * *     * *      ",
            "*     * *     * *     * *      ",
            "*     * *     * *****   *****  ",
            "*     * *     * *           *  ",
            "*     * *     * *            * ",
            " *****   *****   *       *****  "
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
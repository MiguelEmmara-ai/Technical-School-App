package Technical_School_App;

/**
 * Enumeration of Grades.
 * @author Miguel Emmara - 18022146
 **/

public enum Grade {
    // Enum
    APLUS(100, 90, true), A(89, 85, true), AMINUS(84, 80, true),
    BPLUS(79, 75, true), B(74, 70, true), BMINUS(69, 65, true),
    CPLUS(64, 60, true), C(59, 55, true), CMINUS(54, 50, true),
    D(49, 0, false);

    // Instance data
    private int high;
    private int low;
    private boolean pass;

    // Constructors
    Grade(int high, int low, boolean pass) {
        this.high = high;
        this.low = low;
        this.pass = pass;
    }

    /**
     * toString Method.
     * @return {@code message} Print out the status whether passed or failed.
     *                         Passed if this.pass = true, or otherwise.
     * @author Miguel Emmara - 18022146
     */
    public String toString() {
        String message = "";

        if (isPass())
            message = ", " + Colour.ANSI_GREEN + "Status: " + Colour.ANSI_BLUE + "Passed!" + Colour.ANSI_RESET;
        else
            message = ", " + Colour.ANSI_GREEN + "Status: " + Colour.ANSI_RED + "Failed!" + Colour.ANSI_RESET;

        return message;
    }

    // Getter Methods
    private int getHigh() {
        return high;
    }

    private int getLow() {
        return low;
    }

    /**
     * Boolean to determine  true if the Grade is a pass and false otherwise.
     * @return {@code true} if the grade is greater than or equal 50
     * @author Miguel Emmara - 18022146
     */
    public boolean isPass() {
        pass = getHigh() >= 50 || getLow() >= 50;
        return pass;
    }
}

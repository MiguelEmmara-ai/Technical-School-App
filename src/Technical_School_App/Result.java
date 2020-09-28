package Technical_School_App;

/**
 * Result class will stores Module and Grade objects
 * And print modules and grades.
 * @author Miguel Emmara - 18022146
 **/

public class Result {
    // Instance data
    Module modules;
    Grade grades;

    // Constructors
    public Result(Module modules, Grade grades) {
        this.setModules(modules);
        this.setGrades(grades);
    }

    /**
     * toString Method
     * @return toString representation of modules and grades.
     * @author Miguel Emmara - 18022146
     */
    @Override
    public String toString() {
        switch (getGrades().name()) {
            case "APLUS":
                return getModules() + Colour.ANSI_CYAN + "A+" + Colour.ANSI_RESET + getGrades();
            case "AMINUS":
                return getModules() + Colour.ANSI_CYAN + "A-" + Colour.ANSI_RESET + getGrades();
            case "BPLUS":
                return getModules() + Colour.ANSI_CYAN + "B+" + Colour.ANSI_RESET + getGrades();
            case "BMINUS":
                return getModules() + Colour.ANSI_CYAN + "B-" + Colour.ANSI_RESET + getGrades();
            case "CPLUS":
                return getModules() + Colour.ANSI_CYAN + "C+" + Colour.ANSI_RESET + getGrades();
            case "CMINUS":
                return getModules() + Colour.ANSI_CYAN + "C-" + Colour.ANSI_RESET + getGrades();
            default:
                return getModules() + Colour.ANSI_CYAN + getGrades().name() + Colour.ANSI_RESET + getGrades();
        }
    }

    // Getter and Setter Methods
    public Module getModules() {
        return modules;
    }

    public void setModules(Module modules) {
        this.modules = modules;
    }

    public Grade getGrades() {
        return grades;
    }

    public void setGrades(Grade grades) {
        this.grades = grades;
    }
}

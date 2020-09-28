package Technical_School_App;

/**
 * This class will maintains the Semester 1 Module Offerings
 * @author Miguel Emmara - 18022146
 **/

public class TechnicalSchool {
    // Instance data
    private Module[] offerings;

    // Constructor
    public TechnicalSchool() {
        this.offerings = TechnicalSchool.semesterOneModuleOfferings();
    }

    // Methods

    /**
     * Returns a primitive array populated by 13 Module objects.
     *
     * @return {@code Module[]} Corresponding to each row of the table.
     * @author Miguel Emmara - 18022146
     */
    private static Module[] semesterOneModuleOfferings() {
        return new Module[]{
                new Module("Programming", "PROG101", Level.ONE, ModuleType.TAUGHT),
                new Module("Statistics", "STAT102", Level.ONE, ModuleType.TAUGHT),
                new Module("Database Design", "DATA222", Level.TWO, ModuleType.TAUGHT),
                new Module("Object-Oriented Programming", "PROG202", Level.TWO, ModuleType.TAUGHT),
                new Module("Information Systems", "INSY313", Level.THREE, ModuleType.TAUGHT),
                new Module("Web Services", "WEBS332", Level.THREE, ModuleType.TAUGHT),
                new Module("Technology Applications", "TECH103", Level.ONE, ModuleType.SELF_STUDY),
                new Module("Theory of Computation", "THEO111", Level.ONE, ModuleType.SELF_STUDY),
                new Module("Model Checking", "MODC233", Level.TWO, ModuleType.SELF_STUDY),
                new Module("Topology", "TOPG233", Level.TWO, ModuleType.SELF_STUDY),
                new Module("Logic", "LOGI321", Level.THREE, ModuleType.SELF_STUDY),
                new Module("Web App Dev", "PROJ399", Level.THREE, ModuleType.PROJECT),
                new Module("Great Code Company", "EXTO396", Level.THREE, ModuleType.CLIENT_PROJECT),
        };
    }

    /**
     * Search the offerings array.
     *
     * @param code take Code as a parameter.
     * @return {@code module} return a module with the matching code, otherwise null is return.
     * @author Miguel Emmara - 18022146
     */
    public Module lookup(String code) {
        for (Module module : offerings) {
            if (code.equalsIgnoreCase(module.getCode())) {
                return module;
            }
        }
        return null;
    }

    /**
     * isCertified method in which return true if the person is passed according to the following criteria:
     *
     * @param student take Student as a first parameter.
     * @return {@code true} • at least three modules passed at level 1, either taught or self-study AND
     * • at least three modules passed at level 2, more than one must be self-study AND
     * • at least four modules passed at level 3, at least two must be taught AND
     * • at least one project module passed (either of project or client project).
     * @author Miguel Emmara - 18022146
     */
    /*public boolean isCertified(Student student) {
        // Array
        var studentTranscript = student.getTranscript();

        // Instance data
        boolean criteria1 = false;
        boolean criteria2 = false;
        boolean criteria3 = false;

        int indexCriteria1 = 0;

        int indexCriteria2 = 0;
        int indexCriteria2SelfStudy = 0;

        int indexCriteria3 = 0;
        int indexCriteria3Taught = 0;
        int indexCriteria3Project = 0;

        for (int i = 0; i < student.getNumberOfResults(); i++) {
            String lookupCode = studentTranscript[i].getModules().getCode();
            Module compare = lookup(lookupCode);

            if (studentTranscript[i].getGrades() != Grade.D && compare.getLevel() == Level.ONE)
                indexCriteria1++;

            if (indexCriteria1 >= 3)
                criteria1 = true;

            if (studentTranscript[i].getGrades() != Grade.D && compare.getLevel() == Level.TWO)
                indexCriteria2++;

            if (compare.getType() == ModuleType.SELF_STUDY && studentTranscript[i].getGrades() !=
                    Grade.D && compare.getLevel() == Level.TWO)
                indexCriteria2SelfStudy++;

            if (indexCriteria2 >= 3 && indexCriteria2SelfStudy >1)
                criteria2 = true;

            if (studentTranscript[i].getGrades() != Grade.D && compare.getLevel() == Level.THREE)
                indexCriteria3++;

            if (compare.getType() == ModuleType.TAUGHT && studentTranscript[i].getGrades() !=
                    Grade.D && compare.getLevel() == Level.THREE)
                indexCriteria3Taught++;

            if (compare.getType() == ModuleType.CLIENT_PROJECT || compare.getType() ==
                    ModuleType.PROJECT  && studentTranscript[i].getGrades() !=
                    Grade.D && compare.getLevel() == Level.THREE)
                indexCriteria3Project++;

            if (indexCriteria3 >= 4 && indexCriteria3Taught >= 2 && indexCriteria3Project >= 1)
                criteria3 = true;
        }

        return criteria1 && criteria2 && criteria3;
    }*/
    public boolean isCertified(Student student) {
        Result[] result = student.getTranscript();

        int first = 0;
        int second = 0;
        int third = 0;
        int fourth = 0;
        int taught = 0;
        int self_study = 0;

        for (int i = 0; i < result.length; i++) {
            ModuleType module = result[i].getModules().getType();
            Level level = result[i].getModules().getLevel();
            boolean pass = result[i].getGrades().isPass();

            if (pass) {
                if (level == Level.ONE) {
                    if(module == ModuleType.TAUGHT || module == ModuleType.SELF_STUDY) {
                        first++;
                    }
                }
                else if (level == Level.TWO) {
                    second++;

                    if (module == ModuleType.TAUGHT) {
                        taught++;
                    }
                    if (module == ModuleType.SELF_STUDY) {
                        self_study++;
                    }
                }
                else if (level == Level.THREE) {
                    third++;

                    if (module == ModuleType.TAUGHT) {
                        taught++;
                    }
                    if (module == ModuleType.SELF_STUDY) {
                        self_study++;
                    }

                }
                if (module == ModuleType.PROJECT || module == ModuleType.CLIENT_PROJECT) {
                    fourth++;
                }
            }
        }

        if (first >= 3 && (second >= 3 && self_study > 1) && (third >= 4 && taught >= 2) && fourth >= 1) {
            return true;
        }
        else {
            return false;
        }
    }

    // Getter Method
    private Module[] getOfferings() {
        return offerings;
    }
}
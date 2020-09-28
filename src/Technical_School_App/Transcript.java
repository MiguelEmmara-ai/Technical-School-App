package Technical_School_App;

/**
 * Instantiate the student
 * And add their program code and grades to transcript.
 * @author Miguel Emmara - 18022146
 **/

public class Transcript {
    /**
     * Student Transcript list of Miguel.
     * @return {@code miguel}
     * @author Miguel Emmara - 18022146
     */
    public static Student miguel() {
        var school = new TechnicalSchool();
        var miguel = new Student("Miguel");

        miguel.addResultToTranscript(school.lookup("PROG101"), Grade.APLUS);
        miguel.addResultToTranscript(school.lookup("STAT102"), Grade.APLUS);
        miguel.addResultToTranscript(school.lookup("DATA222"), Grade.APLUS);
        miguel.addResultToTranscript(school.lookup("PROG202"), Grade.APLUS);
        miguel.addResultToTranscript(school.lookup("INSY313"), Grade.APLUS);
        miguel.addResultToTranscript(school.lookup("WEBS332"), Grade.APLUS);
        miguel.addResultToTranscript(school.lookup("TECH103"), Grade.APLUS);
        miguel.addResultToTranscript(school.lookup("THEO111"), Grade.APLUS);
        miguel.addResultToTranscript(school.lookup("MODC233"), Grade.APLUS);
        miguel.addResultToTranscript(school.lookup("TOPG233"), Grade.APLUS);
        miguel.addResultToTranscript(school.lookup("LOGI321"), Grade.APLUS);
        miguel.addResultToTranscript(school.lookup("PROJ399"), Grade.APLUS);
        miguel.addResultToTranscript(school.lookup("EXTO396"), Grade.APLUS);

        String result = "";
        if (school.isCertified(miguel))
            result = "Certified";
        else
            result = "Not Certified";

        System.out.println("Student name: " + miguel.getName() +  ", Certification: " +
                miguel.getName()  + " is " + result);

        return miguel;
    }

    /**
     * Student Transcript list of Robin.
     * @return {@code robin}
     * @author Miguel Emmara - 18022146
     */
    public static Student robin() {
        var school = new TechnicalSchool();
        var robin = new Student("Robin");

        robin.addResultToTranscript(school.lookup("PROG101"), Grade.C);
        robin.addResultToTranscript(school.lookup("DATA222"), Grade.C);
        robin.addResultToTranscript(school.lookup("INSY313"), Grade.CPLUS);
        robin.addResultToTranscript(school.lookup("WEBS332"), Grade.CPLUS);
        robin.addResultToTranscript(school.lookup("TECH103"), Grade.CPLUS);
        robin.addResultToTranscript(school.lookup("MODC233"), Grade.CMINUS);
        robin.addResultToTranscript(school.lookup("TOPG233"), Grade.CMINUS);
        robin.addResultToTranscript(school.lookup("PROJ399"), Grade.APLUS);

        String result = "";
        if (school.isCertified(robin))
            result = "Certified";
        else
            result = "Not Certified";

        System.out.println("Student name: " + robin.getName() +  ", Certification: " +
                robin.getName()  + " is " + result);

        return robin;
    }

    /**
     * Student Transcript list of kate.
     * @return {@code kate}
     * @author Miguel Emmara - 18022146
     */
    public static Student kate() {
        var school = new TechnicalSchool();
        var kate = new Student("kate");

        kate.addResultToTranscript(school.lookup("PROG101"), Grade.APLUS);
        kate.addResultToTranscript(school.lookup("STAT102"), Grade.AMINUS);
        kate.addResultToTranscript(school.lookup("TECH103"), Grade.BPLUS);
        kate.addResultToTranscript(school.lookup("MODC233"), Grade.A);
        kate.addResultToTranscript(school.lookup("TOPG233"), Grade.C);
        kate.addResultToTranscript(school.lookup("DATA222"), Grade.A);
        kate.addResultToTranscript(school.lookup("INSY313"), Grade.BPLUS);
        kate.addResultToTranscript(school.lookup("WEBS332"), Grade.AMINUS);
        kate.addResultToTranscript(school.lookup("PROJ399"), Grade.B);
        kate.addResultToTranscript(school.lookup("EXTO396"), Grade.B);

        String result = "";
        if (school.isCertified(kate))
            result = "Certified";
        else
            result = "Not Certified";

        System.out.println("Student name: " + kate.getName() +  ", Certification: " +
                kate.getName()  + " is " + result);

        return kate;
    }

    /**
     * Student Transcript list of axel.
     * @return {@code axel}
     * @author Miguel Emmara - 18022146
     */
    public static Student axel() {
        var school = new TechnicalSchool();
        var axel = new Student("Axel");

        axel.addResultToTranscript(school.lookup("PROG101"), Grade.BPLUS);
        axel.addResultToTranscript(school.lookup("STAT102"), Grade.C);
        axel.addResultToTranscript(school.lookup("DATA222"), Grade.A);
        axel.addResultToTranscript(school.lookup("INSY313"), Grade.AMINUS);
        axel.addResultToTranscript(school.lookup("WEBS332"), Grade.A);
        axel.addResultToTranscript(school.lookup("TECH103"), Grade.D);
        axel.addResultToTranscript(school.lookup("MODC233"), Grade.B);
        axel.addResultToTranscript(school.lookup("TOPG233"), Grade.B);
        axel.addResultToTranscript(school.lookup("PROJ399"), Grade.CMINUS);
        axel.addResultToTranscript(school.lookup("EXTO396"), Grade.C);

        String result = "";
        if (school.isCertified(axel))
            result = "Certified";
        else
            result = "Not Certified";

        System.out.println("Student name: " + axel.getName() +  ", Certification: " +
                axel.getName()  + " is " + result);

        return axel;
    }

    /**
     * Student Transcript list of jim.
     * @return {@code jim}
     * @author Miguel Emmara - 18022146
     */
    public static Student jim() {
        var school = new TechnicalSchool();
        var jim = new Student("Jim");

        jim.addResultToTranscript(school.lookup("PROG101"), Grade.A);
        jim.addResultToTranscript(school.lookup("STAT102"), Grade.BPLUS);
        jim.addResultToTranscript(school.lookup("DATA222"), Grade.CPLUS);
        jim.addResultToTranscript(school.lookup("PROG202"), Grade.C);
        jim.addResultToTranscript(school.lookup("INSY313"), Grade.C);
        jim.addResultToTranscript(school.lookup("WEBS332"), Grade.CPLUS);
        jim.addResultToTranscript(school.lookup("TECH103"), Grade.CMINUS);
        jim.addResultToTranscript(school.lookup("THEO111"), Grade.D);
        jim.addResultToTranscript(school.lookup("MODC233"), Grade.APLUS);
        jim.addResultToTranscript(school.lookup("TOPG233"), Grade.A);
        jim.addResultToTranscript(school.lookup("LOGI321"), Grade.B);
        jim.addResultToTranscript(school.lookup("PROJ399"), Grade.BMINUS);
        jim.addResultToTranscript(school.lookup("EXTO396"), Grade.APLUS);

        String result = "";
        if (school.isCertified(jim))
            result = "Certified";
        else
            result = "Not Certified";

        System.out.println("Student name: " + jim.getName() +  ", Certification: " +
                jim.getName()  + " is " + result);

        return jim;
    }
}

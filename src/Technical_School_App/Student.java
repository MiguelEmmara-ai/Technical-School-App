package Technical_School_App;

/**
 * This class wil maintain an array of results of each student
 * @author Miguel Emmara - 18022146
 **/

public class Student {
    // Instance data
    private Result[] transcript;
    private static final int MAX_TRANSCRIPT_LENGTH = 20;
    private String name;
    private int numberOfResults;

    // Constructor
    public Student(String name) {
        this.setName(name);
        this.setTranscript(new Result[MAX_TRANSCRIPT_LENGTH]);
    }

    /**
     * toString Method
     * @return {@code message} print the transcript of each student,
     * Along with transcript line
     * @author Miguel Emmara - 18022146
     */
    @Override
    public String toString() {
        var transcriptLinePrompt = new TranscriptLinePrompt();
        transcriptLinePrompt.printTranscriptLine();

        String message = "";

        for (int i = 0; i < this.numberOfResults; i++) {
            System.out.println(getTranscript()[i]);
        }
        transcriptLinePrompt.printTranscriptLine();

        return message;
    }

    // Method
    /**
     * Creates a Result object and adds it to the end of the transcript and
     * Updates numberOfResults.
     * @param module take Module as a first parameter.
     * @param grade take Grade as a second parameter.
     * @author Miguel Emmara - 18022146
     */
    public void addResultToTranscript(Module module, Grade grade) {
        if (this.transcript[numberOfResults] == null) {
            var result = new Result(module, grade);
            transcript[numberOfResults] = result;
            numberOfResults++;
        }
    }

    // Getter and Setter Methods
    /**
     * Returns an array of Result objects.
     * @return {@code theTranscript}
     * @author Miguel Emmara - 18022146
     */
    public Result[] getTranscript() {
       var theTranscript = new Result[numberOfResults];

        if (this.numberOfResults >= 0) System.arraycopy(transcript, 0, theTranscript,
                0, this.numberOfResults);
        return theTranscript;
    }

    public void setTranscript(Result[] transcript) {
        this.transcript = transcript;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfResults() {
        return numberOfResults;
    }

    private void setNumberOfResults(int numberOfResults) {
        this.numberOfResults = numberOfResults;
    }
}

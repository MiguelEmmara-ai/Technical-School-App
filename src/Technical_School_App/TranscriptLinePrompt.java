package Technical_School_App;

/**
 * Print the transcript line.
 * @author Miguel Emmara - 18022146
 **/

public class TranscriptLinePrompt {
    /**
     * Method to Print the transcript line
     * @author Miguel Emmara - 18022146
     */
    public void printTranscriptLine() {
        for (int i = 0; i < 25; i++) {
            System.out.print("=");
        }

        System.out.print(" Transcript ");

        for (int i = 0; i < 25; i++) {
            System.out.print("=");
        }

        System.out.println();
    }
}

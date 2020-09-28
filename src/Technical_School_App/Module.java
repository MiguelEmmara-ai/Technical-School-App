package Technical_School_App;

/**
 * Maintains instance variables for type, title, code, and level
 * Print out the paper, tittle, and grade to the console.
 * @author Miguel Emmara - 18022146
 **/

public class Module {
    // Instance data
    private String title;
    private String code;
    private Level level;
    private ModuleType type;

    // Constructor
    public Module(String title, String code, Level level, ModuleType type) {
        this.setTitle(title);
        this.setCode(code);
        this.setLevel(level);
        this.setType(type);
    }

    // toString Method
    @Override
    public String toString() {
        return Colour.ANSI_GREEN + "Paper: " + Colour.ANSI_CYAN + getCode()
                + Colour.ANSI_RESET + "," + Colour.ANSI_GREEN +" Title: "
                + Colour.ANSI_CYAN + getTitle() + Colour.ANSI_RESET + ","
                + Colour.ANSI_GREEN + " Grade: " + Colour.ANSI_RESET;
    }

    // Getter and Setter Methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.isEmpty())
            this.title = "UNKNOWN";
        else
            this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if (code.isEmpty())
            this.code = "UNKNOWN";
        else
            this.code = code;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        if (level == null)
            this.level = Level.ONE;
        else
            this.level = level;
    }

    public ModuleType getType() {
        return type;
    }

    public void setType(ModuleType type) {
        if (type == null)
            this.type = ModuleType.TAUGHT;
        else
            this.type = type;
    }
}

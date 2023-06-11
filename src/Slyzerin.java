import java.util.Objects;

class Slyzerin extends Hogwarts {
    private int cunning;
    private int resoluteness;
    private int ambition;
    private int smart;
    private int autocratic;

    public Slyzerin(String name, int magicLevel, int trLevel, int cunning, int resoluteness, int ambition, int smart, int autocratic) {
        super(name, magicLevel, trLevel);
        this.cunning = cunning;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.smart = smart;
        this.autocratic = autocratic;
    }

    public Slyzerin(String name, String surname, int magicLevel, int trLevel) {
        super(name, magicLevel, trLevel);
        cunning = (int) (Math.random() * 100);
        resoluteness = (int) (Math.random() * 100);
        ambition = (int) (Math.random() * 100);
        smart = (int) (Math.random() * 100);
        autocratic = (int) (Math.random() * 100);
    }
    @Override
    int calculateSpecificScore() {
        return this.cunning + this.resoluteness + this.ambition + this.smart + this.autocratic;
    }

    @Override
    void printCompareOfStudents(Hogwarts best, Hogwarts worst) {
        System.out.println(String.format("%s лучший Слизеринец, чем %s", best.getName(), worst.getName()));
    }

    @Override
    public String toString() {
        return "Slytherin {" +
                "cunning = " + cunning +
                ", resoluteness = " + resoluteness +
                ", ambition = " + ambition +
                ", smart = " + smart +
                ", autocratic = " + autocratic +
                "} " + super.toString();
    }
}
import java.util.Objects;

public class Kogtevran extends Hogwarts {
    private int mentality;
    private int wisdom;
    private int wit;
    private int creativity;

    public Kogtevran(String name, int magicLevel, int trLevel, int mentality, int wisdom, int wit, int creativity) {
        super(name, magicLevel, trLevel);
        this.mentality = mentality;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public Kogtevran(String name, int magicLevel, int trLevel) {
        super(name, magicLevel, trLevel);
        mentality = (int) (Math.random() * 100);
        wisdom = (int) (Math.random() * 100);
        wit = (int) (Math.random() * 100);
        creativity = (int) (Math.random() * 100);
    }

    @Override
    int calculateSpecificScore() {
        return this.mentality + this.wisdom + this.wit + this.creativity;
    }

    @Override
    void printCompareOfStudents(Hogwarts best, Hogwarts worst) {
        System.out.println(String.format("%s лучший Когтевранец, чем %s", best.getName(), worst.getName()));
    }

    @Override
    public String toString() {
        return "Ravenclaw {" +
                "mentality = " + mentality +
                ", wisdom = " + wisdom +
                ", wit = " + wit +
                ", creativity = " + creativity +
                "} " + super.toString();
    }
}
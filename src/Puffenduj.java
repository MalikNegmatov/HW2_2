import java.util.Objects;

public class Puffenduj extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Puffenduj(String name, int magicLevel, int trLevel, int diligence, int loyalty, int honesty) {
        super(name, magicLevel, trLevel);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public Puffenduj(String name, String surname, int magicLevel, int trLevel) {
        super(name, magicLevel, trLevel);
        diligence = (int) (Math.random() * 100);
        loyalty = (int) (Math.random() * 100);
        honesty = (int) (Math.random() * 100);
    }

    @Override
    int calculateSpecificScore() {
        return this.diligence + this.loyalty + this.honesty;
    }

    @Override
    void printCompareOfStudents(Hogwarts best, Hogwarts worst) {
        System.out.println(String.format("%s лучший Пуффендуец, чем %s", best.getName(), worst.getName()));
    }

    @Override
    public String toString() {
        return "Hufflepuff {" +
                "diligence = " + diligence +
                ", loyalty = " + loyalty +
                ", honesty = " + honesty +
                "} " + super.toString();
    }
}
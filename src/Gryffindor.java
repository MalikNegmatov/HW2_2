import java.util.Objects;

class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magicLevel, int trLevel, int nobility, int honor, int bravery) {
        super(name, magicLevel, trLevel);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public Gryffindor(String name, int magicLevel, int trLevel) {
        super(name, magicLevel, trLevel);
        nobility = (int) (Math.random() * 100);
        honor = (int) (Math.random() * 100);
        bravery = (int) (Math.random() * 100);
    }

    @Override
    int calculateSpecificScore() {
        return this.nobility + this.honor + this.bravery;
    }
    @Override
    void printCompareOfStudents(Hogwarts best, Hogwarts worst) {
        System.out.println(String.format("%s лучший Гриффиндорец, чем %s", best.getName(), worst.getName()));
    }

    @Override
    public String toString() {
        return "Gryffindor {" +
                "nobility = " + nobility +
                ", honor = " + honor +
                ", bravery = " + bravery +
                "} " + super.toString();
    }
}
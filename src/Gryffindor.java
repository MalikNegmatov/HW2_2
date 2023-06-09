import java.util.Objects;

class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, int magicLevel, int trLevel, int nobility, int honor, int bravery) {
        super(name, surname, magicLevel, trLevel);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public Gryffindor(String name, String surname, int magicLevel, int trLevel) {
        super(name, surname, magicLevel, trLevel);
        nobility = (int) (Math.random() * 100);
        honor = (int) (Math.random() * 100);
        bravery = (int) (Math.random() * 100);
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gryffindor that)) return false;
        if (!super.equals(o)) return false;
        return getNobility() == that.getNobility() && getHonor() == that.getHonor() && getBravery() == that.getBravery();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNobility(), getHonor(), getBravery());
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
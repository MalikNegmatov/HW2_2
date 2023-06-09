import java.util.Objects;

public class Kogtevran extends Hogwarts {
    private int mentality;
    private int wisdom;
    private int wit;
    private int creativity;

    public Kogtevran(String name, String surname, int magicLevel, int trLevel, int mentality, int wisdom, int wit, int creativity) {
        super(name, surname, magicLevel, trLevel);
        this.mentality = mentality;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public Kogtevran(String name, String surname, int magicLevel, int trLevel) {
        super(name, surname, magicLevel, trLevel);
        mentality = (int) (Math.random() * 100);
        wisdom = (int) (Math.random() * 100);
        wit = (int) (Math.random() * 100);
        creativity = (int) (Math.random() * 100);
    }

    public int getMentality() {
        return mentality;
    }

    public void setMentality(int mentality) {
        this.mentality = mentality;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kogtevran kogtevran)) return false;
        if (!super.equals(o)) return false;
        return getMentality() == kogtevran.getMentality() && getWisdom() == kogtevran.getWisdom() && getWit() == kogtevran.getWit() && getCreativity() == kogtevran.getCreativity();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMentality(), getWisdom(), getWit(), getCreativity());
    }

    @Override
    public String toString() {
        return "Kogtevran{" +
                "mentality=" + mentality +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }
}
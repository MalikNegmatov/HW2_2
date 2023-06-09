import java.util.Objects;

public class Puffenduj extends Hogwarts {
    private int hardworking;
    private int loyalty;
    private int honesty;

    public Puffenduj(String name, String surname, int magicLevel, int trLevel, int hardworking, int loyalty, int honesty) {
        super(name, surname, magicLevel, trLevel);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public Puffenduj(String name, String surname, int magicLevel, int trLevel) {
        super(name, surname, magicLevel, trLevel);
        hardworking = (int) (Math.random() * 100);
        loyalty = (int) (Math.random() * 100);
        honesty = (int) (Math.random() * 100);
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Puffenduj puffenduj)) return false;
        if (!super.equals(o)) return false;
        return getHardworking() == puffenduj.getHardworking() && getLoyalty() == puffenduj.getLoyalty() && getHonesty() == puffenduj.getHonesty();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getHardworking(), getLoyalty(), getHonesty());
    }

    @Override
    public String toString() {
        return "Puffenduj{" +
                "hardworking=" + hardworking +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}
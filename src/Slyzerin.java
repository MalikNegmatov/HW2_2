import java.util.Objects;

class Slyzerin extends Hogwarts {
    private int cunning;
    private int resoluteness;
    private int ambition;
    private int smart;
    private int autocratic;

    public Slyzerin(String name, String surname, int magicLevel, int trLevel, int cunning, int resoluteness, int ambition, int smart, int autocratic) {
        super(name, surname, magicLevel, trLevel);
        this.cunning = cunning;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.smart = smart;
        this.autocratic = autocratic;
    }

    public Slyzerin(String name, String surname, int magicLevel, int trLevel) {
        super(name, surname, magicLevel, trLevel);
        cunning = (int) (Math.random() * 100);
        resoluteness = (int) (Math.random() * 100);
        ambition = (int) (Math.random() * 100);
        smart = (int) (Math.random() * 100);
        autocratic = (int) (Math.random() * 100);
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public void setResoluteness(int resoluteness) {
        this.resoluteness = resoluteness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getAutocratic() {
        return autocratic;
    }

    public void setAutocratic(int autocratic) {
        this.autocratic = autocratic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Slyzerin slyzerin)) return false;
        if (!super.equals(o)) return false;
        return getCunning() == slyzerin.getCunning() && getResoluteness() == slyzerin.getResoluteness() && getAmbition() == slyzerin.getAmbition() && getSmart() == slyzerin.getSmart() && getAutocratic() == slyzerin.getAutocratic();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCunning(), getResoluteness(), getAmbition(), getSmart(), getAutocratic());
    }

    @Override
    public String toString() {
        return "Slyzerin{" +
                "cunning=" + cunning +
                ", resoluteness=" + resoluteness +
                ", ambition=" + ambition +
                ", smart=" + smart +
                ", autocratic=" + autocratic +
                '}';
    }
}
import java.util.Objects;

public class Hogwarts {
    private String name;
    private String surname;
    private int magicLevel;
    private int trLevel;

/*
    Абсолютно все ученики школы Хогвартс умеют колдовать с мощностью в сколько-то
    баллов и могут трансгрессировать на какое-то расстояние. Сила магии и расстояние трансгресии
    у каждого ученика своё и выражается в целочисленном эквиваленте.
*/

    /** Конструктор объекта с описанием свойств, присущих всем ученикам школы Хогвартс
     * @param name         --  имя ученика
     * @param surname      --  фамилия ученика
     * @param magicLevel   --  уровень волшебства
     * @param trLevel      --  уровень трансгресии
     */
    public Hogwarts(String name, String surname, int magicLevel, int trLevel) {
        this.name = name;
        this.surname = surname;
        this.magicLevel = magicLevel;
        this.trLevel = trLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMagicLevel() {
        return magicLevel;
    }

    public void setMagicLevel(int magicLevel) {
        this.magicLevel = magicLevel;
    }

    public int getTrLevel() {
        return trLevel;
    }

    public void setTrLevel(int trLevel) {
        this.trLevel = trLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hogwarts hogwarts)) return false;
        return getMagicLevel() == hogwarts.getMagicLevel() && getTrLevel() == hogwarts.getTrLevel() && Objects.equals(getName(), hogwarts.getName()) && Objects.equals(getSurname(), hogwarts.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getMagicLevel(), getTrLevel());
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", magicLevel=" + magicLevel +
                ", trLevel=" + trLevel +
                '}';
    }
}

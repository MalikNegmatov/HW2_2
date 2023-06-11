import java.util.Objects;

public abstract class Hogwarts {
    private String name;
    private int magicLevel;
    private int trLevel;

/*
    Абсолютно все ученики школы Хогвартс умеют колдовать с мощностью в сколько-то
    баллов и могут трансгрессировать на какое-то расстояние. Сила магии и расстояние трансгресии
    у каждого ученика своё и выражается в целочисленном эквиваленте.
*/

    /** Конструктор объекта с описанием свойств, присущих всем ученикам школы Хогвартс
     * @param name         --  имя ученика
     * @param magicLevel   --  уровень волшебства
     * @param trLevel      --  уровень трансгресии
     */
    public Hogwarts(String name, int magicLevel, int trLevel) {
        this.name = name;
        this.magicLevel = magicLevel;
        this.trLevel = trLevel;
    }

    abstract int calculateSpecificScore();
    abstract void printCompareOfStudents(Hogwarts best, Hogwarts worst);
    private int calculateGeneralScore() {
        return this.magicLevel + this.trLevel;
    }

    public void compare(Hogwarts hogwarts) {
        if (this.getClass().equals(hogwarts.getClass())) {
            this.compareBySpecific(hogwarts);
        } else {
            this.compareByGeneral(hogwarts);
        }
    }

    private void compareBySpecific(Hogwarts hogwarts) {
        int thisScore = this.calculateGeneralScore() + this.calculateSpecificScore();
        int otherScore = hogwarts.calculateGeneralScore() + hogwarts.calculateSpecificScore();

        if (thisScore > otherScore) {
            printCompareOfStudents(this, hogwarts);
        } else if (thisScore < otherScore) {
            printCompareOfStudents(hogwarts, this);
        } else {
            System.out.println("Ученики одного факультета равны по силе");
        }
    }

    private void compareByGeneral(Hogwarts hogwarts) {
        int thisScore = this.calculateGeneralScore();
        int otherScore = hogwarts.calculateGeneralScore();

        if (thisScore > otherScore) {
            System.out.println(String.format("Ученик %s сильнее ученика %s", this.name, hogwarts.name));
        } else if (thisScore < otherScore) {
            System.out.println(String.format("Ученик %s сильнее ученика %s", hogwarts.name, this.name));
        } else {
            System.out.println("Ученики равны по силе");
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Hogwarts {" +
                "name = '" + name + '\'' +
                ", magicLevel = " + magicLevel +
                ", trLevel = " + trLevel +
                '}';
    }
}


public class Main {

    public static void main(String[] args) {

        Hogwarts harry = new Gryffindor("Harry Potter", 100, 100 );
        Hogwarts draco = new Slyzerin("Draco Malfoy", 85, 85, 90, 70, 90, 80, 100);
        Hogwarts gregoryGoyle = new Slyzerin("Gregory Goyle", 50, 50, 50, 80, 50, 50, 50);
        Hogwarts hermione = new Gryffindor("Hermione Granger", 80, 88);
        Hogwarts parvati = new Gryffindor("Parvati Patil", 77, 33);

        gregoryGoyle.compare(draco);
        harry.compare(draco);
        parvati.compare(hermione);

        hermione.printCompareOfStudents(draco, harry); // нужно ли и можно ли скрыть метод класса от таких вызовов?
    }
}
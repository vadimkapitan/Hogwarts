package OOP1;

public class Slyzerin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resource;
    private int power;

    public Slyzerin(String fullName, int magic, int transgression, int cunning, int determination, int ambition, int resource, int power) {
        super(fullName, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resource = resource;
        this.power = power;
    }

    public static void compareInFaculty(Slyzerin studyOne, Slyzerin studyTwo) {
        int studyOneSum = studyOne.getCunning() + studyOne.getDetermination() + studyOne.getAmbition() + studyOne.getResource() + studyOne.getPower();
        int studyTwoSum = studyTwo.getCunning() + studyTwo.getDetermination() + studyTwo.getAmbition() + studyTwo.getResource() + studyTwo.getPower();
        if (studyOneSum > studyTwoSum) {
            System.out.println(studyOne.getFullName() + " Лучший СЛИЗЕРИНЕЦ, чем " + studyTwo.getFullName());
        } else if (studyTwoSum > studyOneSum) {
            System.out.println(studyTwo.getFullName() + " Лучший СЛИЗЕРИНЕЦ, чем " + studyOne.getFullName());
        } else
            System.out.println("У " + studyOne.getFullName() + " и " + studyTwo.getFullName() + " силы равны.");
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResource() {
        return resource;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Хитрость: " + cunning +
                " Решительность: " + determination +
                " Амбициозность: " + ambition +
                " Находчивость: " + resource +
                " Жажда власти: " + power;
    }
}

package OOP1;

public class Puffendui extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Puffendui(String fullName, int magic, int transgression, int hardWork, int loyalty, int honesty) {
        super(fullName, magic, transgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public static void compareInFaculty(Puffendui studyOne, Puffendui studyTwo) {
        int studyOneSum = studyOne.getHardWork() + studyOne.getLoyalty() + studyOne.getHonesty();
        int studyTwoSum = studyTwo.getHardWork() + studyTwo.getLoyalty() + studyTwo.getHonesty();

        if (studyOneSum > studyTwoSum) {
            System.out.println(studyOne.getFullName() + " Лучший ПУФФЕНДУЕЦ, чем " + studyTwo.getFullName());
        } else if (studyTwoSum > studyOneSum) {
            System.out.println(studyTwo.getFullName() + " Лучший ПУФФЕНДУЕЦ, чем " + studyOne.getFullName());
        } else
            System.out.println("У " + studyOne.getFullName() + " и " + studyTwo.getFullName() + " силы равны.");
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Трудолюбие: " + hardWork +
                " Верность: " + loyalty +
                " Честность: " + honesty;
    }
}

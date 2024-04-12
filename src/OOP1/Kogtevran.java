package OOP1;

public class Kogtevran extends Hogwarts {
    private int clever;
    private int wisdom;
    private int wit;
    private int art;

    public Kogtevran(String fullName, int magic, int transgression, int clever, int wisdom, int wit, int art) {
        super(fullName, magic, transgression);
        this.clever = clever;
        this.wisdom = wisdom;
        this.wit = wit;
        this.art = art;
    }

    public static void compareInFaculty(Kogtevran studyOne, Kogtevran studyTwo) {
        int studyOneSum = studyOne.getClever() + studyOne.getWisdom() + studyOne.getWit() + studyOne.getArt();
        int studyTwoSum = studyTwo.getClever() + studyTwo.getWisdom() + studyTwo.getWit() + studyTwo.getArt();

        if (studyOneSum > studyTwoSum) {
            System.out.println(studyOne.getFullName() + " Лучший КОГТЕВРАНЕЦ, чем " + studyTwo.getFullName());
        } else if (studyTwoSum > studyOneSum) {
            System.out.println(studyTwo.getFullName() + " Лучший КОГТЕВРАНЕЦ, чем " + studyOne.getFullName());
        } else
            System.out.println("У " + studyOne.getFullName() + " и " + studyTwo.getFullName() + " силы равны.");
    }

    public int getClever() {
        return clever;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getArt() {
        return art;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Ум: " + clever +
                " Мудрость: " + wisdom +
                " Остроумие: " + wit +
                " Творчество: " + art;
    }
}

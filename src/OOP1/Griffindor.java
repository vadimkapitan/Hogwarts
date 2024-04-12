package OOP1;

public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String fullName, int magic, int transgression, int nobility, int honor, int bravery) {
        super(fullName, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public static void compareInFaculty(Griffindor studyOne, Griffindor studyTwo) {
        int studyOneSum = studyOne.getNobility() + studyOne.getHonor() + studyOne.getBravery();
        int studyTwoSum = studyTwo.getNobility() + studyTwo.getHonor() + studyTwo.getBravery();

        if (studyOneSum > studyTwoSum) {
            System.out.println(studyOne.getFullName() + " Лучший ГРИФФИНДОРЕЦ, чем: " + studyTwo.getFullName());
        } else if (studyTwoSum > studyOneSum) {
            System.out.println(studyTwo.getFullName() + " Лучший ГРИФФИНДОРЕЦ, чем: " + studyOne.getFullName());
        } else
            System.out.println("У " + studyOne.getFullName() + " и " + studyTwo.getFullName() + " силы равны.");
    }


    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Благородство: " + nobility +
                " Честь: " + honor +
                " Храбрость: " + bravery;
    }
}



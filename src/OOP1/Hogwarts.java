package OOP1;

public class Hogwarts {
    private String fullName;
    private int magic;
    private int transgression;

    public Hogwarts(String fullName, int magic, int transgression) {
        this.fullName = fullName;
        this.magic = magic;
        this.transgression = transgression;
    }

    public static void compareInHogwarts(Hogwarts one, Hogwarts two) {
        if (one.getMagic() > two.getMagic()) {
            System.out.println(one.getFullName() + " обладает бОльшей магией чем: " + two.getFullName());
        } else if (two.getMagic() > one.getMagic()) {
            System.out.println(two.getFullName() + " обладает бОльшей магией чем: " + one.getFullName());
        } else
            System.out.println("У студента: " + one.getFullName() + " и студента: " + two.getFullName() + " силы магии равны!");

        if (one.getTransgression() > two.getTransgression()) {
            System.out.println(one.getFullName() + " обладает бОльшей трансгрессией чем: " + two.getFullName());
        } else if (two.getTransgression() > one.getTransgression()) {
            System.out.println(two.getFullName() + " обладает бОльшей трансгрессией чем: " + one.getFullName());
        } else
            System.out.println("У студента: " + one.getFullName() + " и студента: " + two.getFullName() + " сила трансгрессии равна!");
    }


    public String getFullName() {
        return fullName;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }

    @Override
    public String toString() {
        return "Студент: " + fullName +
                " Магия: " + magic +
                " Траснгрессия: " + transgression;
    }
}


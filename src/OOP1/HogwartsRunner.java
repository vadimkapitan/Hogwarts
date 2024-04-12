package OOP1;

public class HogwartsRunner {
    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Harry Potter", 1, 2, 3, 4, 5);
        Griffindor germionaGranger = new Griffindor("Germiona Granger", 2, 7, 99, 9, 10);
        Griffindor ronYizly = new Griffindor("Ron Yizly", 7, 2, 99, 9, 10);

        Puffendui zahariaSmith = new Puffendui("Zaharia Smith", 16, 17, 18, 19, 20);
        Puffendui cedrickDiggory = new Puffendui("Cedrick Diggory", 21, 22, 23, 24, 25);
        Puffendui jastinFinchFletcher = new Puffendui("Jastin Finch-Fletcher", 26, 27, 28, 29, 30);

        Kogtevran chzhouChang = new Kogtevran("Chzhou Chang", 31, 32, 33, 34, 35, 1);
        Kogtevran padmaPatil = new Kogtevran("Padma Patil", 36, 37, 38, 39, 40, 1);
        Kogtevran marcusBelby = new Kogtevran("Marcus Belby", 41, 42, 43, 44, 45, 1);

        Slyzerin drakoMalfoy = new Slyzerin("Drako Malfoy", 7, 12, 48, 49, 50, 51, 52);
        Slyzerin grahamMantegu = new Slyzerin("Graham Mantegu", 53, 54, 55, 56, 57, 58, 59);
        Slyzerin gregoryGoil = new Slyzerin("Gregory Goil", 60, 61, 62, 63, 64, 65, 66);

        Hogwarts.compareInHogwarts(ronYizly, drakoMalfoy);

        Griffindor.compareInFaculty(ronYizly, germionaGranger);
        Griffindor.compareInFaculty(harryPotter, ronYizly);
        Puffendui.compareInFaculty(cedrickDiggory, jastinFinchFletcher);
        Kogtevran.compareInFaculty(padmaPatil, chzhouChang);
        Slyzerin.compareInFaculty(drakoMalfoy, gregoryGoil);

        System.out.println(germionaGranger);
        System.out.println(zahariaSmith);
        System.out.println(marcusBelby);
        System.out.println(grahamMantegu);

    }
}

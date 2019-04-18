public class main {
    public static void main(String[] args) {
        avto man = new avto("Vasia Pupkin");

        System.out.println("isAlive=" + man.isAlive);
        System.out.println("Name=" + man.name);



        System.out.println("Cells=" + man.cells);

        System.out.println("Man age: " + man.age);
        System.out.println("Man height: " + man.heightInCm);
        man.personGrowUp();
        System.out.println("Man height: " + man.heightInCm);

    }
}

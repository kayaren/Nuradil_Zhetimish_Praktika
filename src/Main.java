public class Main {
    public static void main(String[] args) {
        String[] commands = {"сидеть", "лежать"};
        Shelter shelter = new Shelter("mir", "lenina 1 ");
        Dog dog = new Dog("космос", "алабай", commands, Color.BLACK, shelter);
        System.out.println(dog.getInfo());
        dog.MakeVoice();
        dog.MakeVoice("гув гув ");
        dog.MakeVoice("ауу ауу");
        System.out.println("-----------------");

        Shelter shelter1 = new Shelter("lil", "alamedin1");
        Dog dog2 = new Dog("плутон", "хаски", Color.GRAY, shelter1);
        System.out.println(dog2.getInfo());
        dog2.MakeVoice();
        dog2.MakeVoice("ауу ауу ");
        dog2.MakeVoice("гав гав");
        System.out.println("--------------");

        Dog dog3 = new Dog("алек","кандек",shelter);
        Shelter shelter3  = new Shelter("fox" , "tokmok");
        System.out.println(dog3.getInfo());
        dog3.MakeVoice();
        dog3.MakeVoice("gav gav ");
        dog3.MakeVoice("guv guv");

    }
}
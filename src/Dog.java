import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Arrays;

public final class Dog extends  Pet {
    private String name;
    private String breed;
    private String[] commands;

    public String getName() {
        return name;
    }

    public Dog(String name, String  breed,Shelter shelter){
        this.setShelter(shelter);
        this.name = name;
        this.breed = breed;
    }


    public Dog(String name, String breed, String[] commands, Color color, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setColor(color);
        super.setShelter(shelter);
    }

    public Dog(String name, String breed, Color color, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        super.setColor(color);
        super.setShelter(shelter);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    @Override
    public void  MakeVoice(){
        System.out.println("гав гав ");

    }
    public void  MakeVoice(String voice){
        System.out.println(voice);

    }

    public String getInfo(){
        return super.getInfo() +
                "\nname:" + name +
                "\nbreed:" + breed +
                "\ncommands:" + Arrays.toString(commands);
    }
}

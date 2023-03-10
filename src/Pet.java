import java.util.Random;

public class Pet {
    private int age = GenerateDefaultAge();
    private  Color color;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int GenerateDefaultAge(){
        Random random = new Random();
        return  random.nextInt(15) +1;
    }

    public String getInfo(){

        return "age:" + age + "\ncolor:" + color  + "\nshelter name: " + shelter.getName() +
                "\nshelter address:" + shelter.getAddress();
     }

     public void MakeVoice(){
         System.out.println("животное издает звук");
     }
}

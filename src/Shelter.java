public class Shelter {
    private static String name;
    private String address;

    public Shelter(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

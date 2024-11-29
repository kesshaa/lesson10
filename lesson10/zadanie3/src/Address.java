public class Address extends Contact {
    private final String city;
    private final String address;

    public Address(String name, String city, String address) {
        super(name);
        this.city = city;
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String getCongratulation() {
        return "Дорогой " + name + "! С Новым годом! Желаю всего наилучшего в новом году из " + city + "!";
    }
}
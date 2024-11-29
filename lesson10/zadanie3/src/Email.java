class Email extends Contact {
    private final String emailAddress;

    public Email(String name, String emailAddress) {
        super(name);
        this.emailAddress = emailAddress;
    }

    @Override
    public String getCongratulation() {
        return "Привет, " + name + "! С Новым годом! Напиши мне!";
    }
}
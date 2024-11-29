class Phone extends Contact {
    private final String phoneNumber;

    public Phone(String name, String phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getCongratulation() {
        return "Здравствуй, " + name + "! С Новым годом! Позвони мне!";
    }
}
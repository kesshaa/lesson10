class SocialNetworkContact extends Contact {
    private final String socialNetwork;
    private final String username;

    public SocialNetworkContact(String name, String socialNetwork, String username) {
        super(name);
        this.socialNetwork = socialNetwork;
        this.username = username;
    }

    @Override
    public String getCongratulation() {
        return "Здравствуй, " + name + "! С Новым годом! Найди меня в " + socialNetwork + "!";
    }
}
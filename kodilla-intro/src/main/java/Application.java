public class Application {
    public static void main(String[] args) {
        String name = "Adam";
        double age = 40.5;
        double height = 178;

        User user = new User(name, age, height);
        UserValidator.validateUser(user);
    }
}
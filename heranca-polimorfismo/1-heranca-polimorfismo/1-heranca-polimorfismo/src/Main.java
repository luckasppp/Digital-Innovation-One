public class Main {
    public static void main(String[] args) throws Exception {
        Manager manager = new Manager();

        manager.setName("Lucas Damasceno");
        manager.setLogin("luckasppp");
        manager.setPassword("12345678");

        System.out.println(manager.getName());
        System.out.println(manager.getLogin());
        System.out.println(manager.getPassword());
    }
}

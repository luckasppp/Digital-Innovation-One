public class Main {
    public static void main(String[] args) throws Exception {
        // printEmployee(new Manager());
        // printEmployee(new Salesman());
    }

    /*
     * // Testar com Java 17+
     * public static void printEmployee(Employee employee) {
     * if (employee instanceof Manager manager) {
     * employee.setName("Lucas Damasceno");
     * manager.setLogin("luckasppp");
     * manager.setPassword("12345678");
     * 
     * System.out.printf("======= %s =======\n", employee.getClass());
     * System.out.println(employee.getName());
     * System.out.println(manager.getLogin());
     * System.out.println(manager.getPassword());
     * System.out.printf("=============================\n");
     * } if (employee instanceof Salesman salesman) {
     * employee.setName("Lucas Damasceno");
     * salesman.setLogin("luckasppp");
     * salesman.setPassword("12345678");
     * 
     * System.out.printf("======= %s =======\n", employee.getClass());
     * System.out.println(employee.getName());
     * System.out.println(salesman.getLogin());
     * System.out.println(salesman.getPassword());
     * System.out.printf("=============================\n");
     * }
     * }
     * 
     * 
     * switch(employee) {
     * case Manager manager -> {
     * manager.setCode("123");
     * manager.setName("João da Silva");
     * manager.setSalary(2800);
     * manager.setLogin("luckasppp");
     * manager.setPassword("12345678");
     * manager.setComission(1200);
     * 
     * System.out.printf("======= %s =======\n", manager.getClass());
     * System.out.println(manager.getCode());
     * System.out.println(manager.getName());
     * System.out.println(manager.getSalary());
     * System.out.println(manager.getLogin());
     * System.out.println(manager.getPassword());
     * System.out.println(manager.getComission());
     * }
     * case Salesman salesman -> {
     * salesman.setCode("124");
     * salesman.setName("Lucas Damasceno");
     * salesman.setSalary(4000);
     * salesman.setLogin("luckasppp");
     * salesman.setPassword("12345678");
     * salesman.setComission(1000);
     * 
     * System.out.printf("======= %s =======\n", salesman.getClass());
     * System.out.println(salesman.getCode());
     * System.out.println(salesman.getName());
     * System.out.println(salesman.getSalary());
     * System.out.println(salesman.getLogin());
     * System.out.println(salesman.getPassword());
     * System.out.println(salesman.getComission());
     * }
     * }
     */
}

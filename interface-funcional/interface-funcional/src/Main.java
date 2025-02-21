// import java.util.List;
// import java.util.function.Consumer;
// import java.util.function.Function;

// public class Main {
//     public static void main(String[] args) {
//         List<User> users = List.of(
//                 new User("Maria", 25),
//                 new User("João", 32),
//                 new User("Eduardo", 40),
//                 new User("Ana", 19));

//         // Opção com bastante código
//         // var consumer = new Consumer<User>() {

//         // @Override
//         // public void accept(final User user) {
//         // System.out.println(user);
//         // }
//         // };
//         // users.forEach(consumer);

//         // Opção com um pouco menos de código
//         // users.forEach(
//         // new Consumer<User>() {
//         // @Override
//         // public void accept(final User user) {
//         // System.out.println(user);
//         // }
//         // });

//         // Opção com lambda
//         users.forEach(user -> System.out.println(user));
//         // No java, a interface funcional é a base para a criação de lambdas

//         // Segunda opção com Method References
//         // users.forEach(System.out::println);

//         printStringValue(User::name, users);
//         printStringValue(user -> String.valueOf(user.age), users);
//     }

//     private static void printStringValue(Function<User, String> callBack, List<User> users) {
//         users.forEach(user -> System.out.println(callBack.apply(user)));

//     }
// }

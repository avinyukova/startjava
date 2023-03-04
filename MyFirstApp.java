import java.util.Scanner;

public class MyFirstApp {
    public static void main(String[] args) {
        System.out.println("Написано однажды, работает везде");
        Scanner console = new Scanner(System.in, "chcp 866");
        System.out.print("Введите свое имя: Анна");
        System.out.println(console.nextLine());
    }
}
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        PriorityQueue lotery = new PriorityQueue<>(new ToyComparator(Sort.Descending));
        Scanner scanner = new Scanner(System.in);

        Toy toy1 = new Toy("Bear");
        Toy toy2 = new Toy("Rabbit");
        Toy toy3 = new Toy("Car");
        Toy toy4 = new Toy("Humster");
        Toy toy5 = new Toy("Parrot");
        Toy toy6 = new Toy("Hero");


        System.out.println("What toys will be drawn in a lottery?");
        Toy toy7 = new Toy(scanner.nextLine());
        Toy toy8 = new Toy(scanner.nextLine());
        Toy toy9 = new Toy(scanner.nextLine());

        lotery.add(toy1);
        lotery.add(toy2);
        lotery.add(toy3);
        lotery.add(toy4);
        lotery.add(toy5);
        lotery.add(toy6);
        lotery.add(toy7);
        lotery.add(toy8);
        lotery.add(toy9);




        try (FileWriter writer = new FileWriter("LotteryToys.txt")) {
            for (int i = lotery.size(); i > 0; i--) {
                Toy priz = (Toy) lotery.remove();
                System.out.println("You won: \n" + priz + "\n");
                writer.write(priz.toString() + "\n");
            }
            System.out.println("Congrats!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
//Добавлены необходимые библиотеки
import java.util.PriorityQueue;
import java.io.FileWriter;
import java.io.IOException;

//Добавлены классы Toy и ToyRaffle, созданы игрушки toy1, toy2, toy3 и очередь игрушек toyQueue с приоритетом по частоте.
class Toy {
    int id;
    String name;
    int frequency;

public Toy(int id, String name, int frequency) {
    this.id = id;
    this.name = name;
    this.frequency = frequency;
    }
}
public class ToyRaffle {

    public static void main(String[] args) {
        Toy toy1 = new Toy(1, "Doll", 3);
        Toy toy2 = new Toy(2, "Car", 2);
        Toy toy3 = new Toy(3, "Teddy Bear", 5);

        PriorityQueue<Toy> toyQueue = new PriorityQueue<>(10, (t1, t2) -> t2.frequency - t1.frequency);

        toyQueue.add(toy1);
        toyQueue.add(toy2);
        toyQueue.add(toy3);

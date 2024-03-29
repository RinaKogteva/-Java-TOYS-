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
        Toy toy3 = new Toy(3, "Teddy Bear", 3);

        PriorityQueue<Toy> toyQueue = new PriorityQueue<>(10, (t1, t2) -> t2.frequency - t1.frequency);

        toyQueue.add(toy1);
        toyQueue.add(toy2);
        toyQueue.add(toy3);

// Добавлена запись результатов в файл results.txt после каждого выбора игрушки из очереди
        try (FileWriter writer = new FileWriter("results2.txt")) {
            for (int i = 0; i < 10; i++) {
                Toy selectedToy = toyQueue.poll();
                writer.write("Toy id: " + selectedToy.id + " - " + selectedToy.name + "\n");
                toyQueue.add(selectedToy); 
            }//Добавлено возвращение выбранной игрушки обратно в очередь после записи результатов

       } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
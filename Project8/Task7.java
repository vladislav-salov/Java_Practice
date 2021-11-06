import java.util.Random; // Импорт стандартного класса Random, инкапсулирующего в себе последовательность псевдослучайных чисел.
import java.util.HashMap; // Импорт стандартного класса HashMap, реализующего интерфейс ассоциативного массива.

public class Task7 // Класс, реализующий отображение из сгенерированного набора случайных чисел с подсчитанным кол-вом повторов.
{
    public static void main(String[] args) // Основная функция.
    {
        Random random = new Random(); // Объявление объекта random класса Random.
        HashMap<Integer, Integer> hashMap = new HashMap<>(); // Объявление объекта hashMap класса HashMap.
        for (int i = 0; i < 100; i++) // Создание 100 случайных чисел.
        {
            int number = random.nextInt(5); // Задание диапазона чисел: [0, 5) ∈ ℤ.
            Integer frequency = hashMap.get(number); // Возврат null при отстутствии ключа, иначе: возврат асс. значения.
            hashMap.put(number, frequency == null ? 1 : frequency + 1); // Если frequency равно null, то кол-во повторов = 1, иначе – увеличить кол-во повторов на 1.
        }
        System.out.println(hashMap); // Отображение набора.
    }
}
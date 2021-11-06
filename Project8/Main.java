import java.util.Scanner; // Импорт стандартного класса Scanner, использующегося для считывания данных.
import java.util.HashMap; // Импорт стандартного класса HashMap, реализующего интерфейс ассоциативного массива.

public class Main // Класс, реализующий отображение из домашних животных.
{
    public static void main(String[] args) // Основная функция.
    {
        HashMap<String, Pet> hashMap = new HashMap<>(); // Объявление объекта hashMap класса HashMap.
        Scanner input = new Scanner(System.in); // Объявление объекта input класса Scanner.

        // Получение набора котов.
        System.out.println("Введите кол-во котов:"); // Вывод в консоль "Введите кол-во котов:".
        int size_arrayCats = input.nextInt(); // Считывание введённого числа и его запись в переменную size_arrayCats.
        String[] arrayCats = new String[size_arrayCats]; // Создание массива arrayCats типа String размера size_arrayCats.
        System.out.println("Вводите имена котов через пробел:"); // Вывод в консоль ""Вводите имена котов через пробел:".
        for (int i = 0; i < size_arrayCats; i++) // Проход по всему массиву arrayCats.
        {
            arrayCats[i] = input.next(); // Заполнение массива arrayCats считанными элементами.
        }
        System.out.print("Получен набор котов:"); // Вывод в консоль "Получен набор котов:".
        for (int i = 0; i < size_arrayCats; i++) // Проход по всему массиву arrayCats.
        {
            System.out.print(" " + arrayCats[i]); // Вывод на экран элементов массива arrayCats, разделённых пробелом.
            hashMap.put(arrayCats[i], new Cat(arrayCats[i])); // Добавление элементов массива arrayCats в ассоциативный массив hashMap.
        }
        System.out.println(); // Переход на следующую строку.

        // Получение набора собак.
        System.out.println("Введите кол-во собак:"); // Вывод в консоль "Введите кол-во собак:".
        int size_arrayDogs = input.nextInt(); // Считывание введённого числа и его запись в переменную size_arrayDogs.
        String[] arrayDogs = new String[size_arrayDogs]; // Создание массива arrayDogs типа String размера size_arrayDogs.
        System.out.println("Вводите имена собак через пробел:"); // Вывод в консоль ""Вводите имена собак через пробел:".
        for (int i = 0; i < size_arrayDogs; i++) // Проход по всему массиву arrayDogs.
        {
            arrayDogs[i] = input.next(); // Заполнение массива arrayDogs считанными элементами.
        }
        System.out.print("Получен набор собак:"); // Вывод в консоль "Получен набор собак:".
        for (int i = 0; i < size_arrayDogs; i++) // Проход по всему массиву arrayDogs.
        {
            System.out.print(" " + arrayDogs[i]); // Вывод на экран элементов массива arrayDogs, разделённых пробелом.
            hashMap.put(arrayDogs[i], new Dog(arrayDogs[i])); // Добавление элементов массива arrayDogs в ассоциативный массив hashMap.
        }
        System.out.println(); // Переход на следующую строку.

        // Получение набора сов.
        System.out.println("Введите кол-во сов:"); // Вывод в консоль "Введите кол-во сов:".
        int size_arrayOwls = input.nextInt(); // Считывание введённого числа и его запись в переменную size_arrayOwls.
        String[] arrayOwls = new String[size_arrayOwls]; // Создание массива arrayOwls типа String размера size_arrayOwls.
        System.out.println("Вводите имена сов через пробел:"); // Вывод в консоль ""Вводите имена сов через пробел:".
        for (int i = 0; i < size_arrayOwls; i++) // Проход по всему массиву arrayOwls.
        {
            arrayOwls[i] = input.next(); // Заполнение массива arrayOwls считанными элементами.
        }
        System.out.print("Получен набор сов:"); // Вывод в консоль "Получен набор сов:".
        for (int i = 0; i < size_arrayOwls; i++) // Проход по всему массиву arrayOwls.
        {
            System.out.print(" " + arrayOwls[i]); // Вывод на экран элементов массива arrayOwls, разделённых пробелом.
            hashMap.put(arrayOwls[i], new Owl(arrayOwls[i])); // Добавление элементов массива arrayOwls в ассоциативный массив hashMap.
        }
        System.out.println(); // Переход на следующую строку.

        System.out.println(); // Вывод пустой строки для визуального разделения введённых данных от выходных данных.

        System.out.println("Создано отображение полученного набора:"); // Вывод в консоль "Создано отображение полученного набора:".
        System.out.println(hashMap); // Отображение полученного набора.

        System.out.println(); // Вывод пустой строки для визуального разделения выходных данных от последующих добавочных данных.

        // Добавление новых элементов.
        hashMap.put("!Мурзик!", new Cat("Мурзик"));
        System.out.println("Добавлен кот Мурзик. Его ключ: \"!Мурзик!\"."); // Вывод в консоль "Добавлен кот Мурзик. Его ключ: "!Мурзик!".".
        hashMap.put("!Бобик!", new Dog("Бобик"));
        System.out.println("Добавлен пёс Бобик. Его ключ: \"!Бобик!\"."); // Вывод в консоль "Добавлен пёс Бобик. Его ключ: "!Бобик!".".
        hashMap.put("!Кеша!", new Owl("Кеша"));
        System.out.println("Добавлен Кеша. Его ключ: \"!Кеша!\"."); // Вывод в консоль "Добавлен Кеша. Его ключ: "!Кеша!".".

        System.out.println(); // Вывод пустой строки для визуального разделения добавочных данных от последующих выходных данных.

        System.out.println("Создано отображение после добавления элементов:"); // Вывод в консоль "Создано отображение после добавления элементов:".
        System.out.println(hashMap); // Отображение после добавления новых элементов.
    }
}
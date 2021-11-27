import java.util.*;
import java.io.File;


public class Main
{
	public static void main(String args[])
	{
	    // Задание 1. Тестирование.
	    System.out.println("Задание 1. Тестирование.");
	    
	    // Объявление целочисленного массива intArr и его инициализация (заполнение) элементами 1, 2, 3, 4, 5, 6.
	    Integer[] intArr = {1, 2, 3, 4, 5, 6};
	    
	    // Объявление строкового массива strArr и его инициализация (заполнение) элементами "ab", "cd", "ef", "gh", "ij", "kl".
	    String[] strArr = {"ab", "cd", "ef", "gh", "ij", "kl"};
	    
	    // Объявление списка list1 и его инициализация результатом работы метода newArrayList (с аргументом intArr) класса Solution.
	    ArrayList list1 = Solution.newArrayList(intArr);  // Конвертация массива intArr в список list1.
	    // Вывод списка list1.
        System.out.println(list1);

        // Объявление списка list2 и его инициализация результатом работы метода newArrayList (с аргументом strArr) класса Solution.
	    ArrayList list2 = Solution.newArrayList(strArr);  // Конвертация массива strArr в список list2. 
	    // Вывод списка list2.
        System.out.println(list2);
	
	    // Задания 2 и 3. Тестирование.
	    System.out.println("Задания 2 и 3. Тестирование.");
	    
	    // Объявление целочисленного массива intArr2 и его инициализация объектом класса Array с элементами массива intArr.
	    Array<Integer> intArr2 = new Array(intArr);
	    System.out.println(intArr2.get(4));  // Вывод элемента массива intArr2 с индексом 4 с помощью метода get класса Array.
	    
	    // Объявление строкового массива strArr2 и его инициализация объектом класса Array с элементами массива strArr.
	    Array<String> strArr2 = new Array(strArr);
	    System.out.println(strArr2.get(4));  // Вывод элемента массива strArr2 с индексом 4 с помощью метода get класса Array.
	    
	    // Задание 4. Тестирование.
	    System.out.println("Задание 4. Тестирование.");
	    // Вызов метода catContents (c аргументом "C:\\") класса Solution.
	    Solution.catContents("C:\\");  // Вывод первых пяти элементов каталога, имеющего путь "C:\\".
	    
	    // Задание 5. Тестирование.
	    System.out.println("Задание 5. Тестирование.");
	    
	    // Объявление целочисленного множества intSet.
	    HashSet<Integer> intSet = new HashSet();
	    // Добавление элементов в множество intSet.
	    intSet.add(1);
        intSet.add(3);
        intSet.add(2);
        
	    // Объявление строкового множества strSet.
	    HashSet<String> strSet = new HashSet();
	    // Добавление элементов в множество strSet.
	    strSet.add("One");
        strSet.add("Three");
        strSet.add("Two");
        
	    // Объявление множества set1 и его инициализация результатом работы метода newHashSet (с аргументом intSet) класса Solution.
	    HashSet set1 = Solution.newHashSet(intSet);  // Конвертация множества intSet в множество set1.
	    // Вывод множества set1.
	    System.out.println(set1);
        
        // Объявление множества set2 и его инициализация результатом работы метода newHashSet (с аргументом strSet) класса Solution.
	    HashSet set2 = Solution.newHashSet(strSet);  // Конвертация множества strSet в множество set2.
	    // Вывод множества set2.
	    System.out.println(set2);
        
        // Объявление ассоц. массива map1 и его иниц. результатом работы метода newHashMap (с арг. list1, list2) класса Solution.
	    HashMap map1 = Solution.newHashMap(list1, list2);  // Конвертация списков list1, list2 в ассоц. массив map1.
	    // Вывод ассоц. массива map1.
        System.out.println(map1);
        
        // Объявление ассоц. массива map2 и его иниц. результатом работы метода newHashMap (с арг. list2, list1) класса Solution.
	    HashMap map2 = Solution.newHashMap(list2, list1);  // Конвертация списков list2, list1 в ассоц. массив map2.
	    // Вывод элементов ассоц. массива map2.
        System.out.println(map2);
	}
}


class Solution
{
	// Задание 1. Метод для конвертации массива из строк/чисел (элементов любого типа) в список.
	public static <T> ArrayList<T> newArrayList(T ... elements)
    {
        ArrayList list = new ArrayList<>();
        for (T element: elements)
            list.add(element);
        return list;
    }
    
    // Задание 5. Вспомогательный метод класса Solution для конвертации множества из элементов любого типа в множество.
    public static <T> HashSet<T> newHashSet(T ... elements)
    {
        HashSet set = new HashSet<>();
        for (T element: elements)
            set.add(element);
        return set;
    }
    
    /* Задание 5. Вспомогательный метод класса Solution для конвертации двух списков любого типа 
    (с элементами ключевых и информационных полей соответственно) в ассоциативный массив. */
    public static <K, V> HashMap<K, V> newHashMap(List<? extends K> keys, List<? extends V> values) 
    {
        HashMap<K, V> map = new HashMap<>();
        if (keys.size() == values.size())
            for (int i = 0; i < keys.size(); i++)
                map.put(keys.get(i), values.get(i));
        else
            throw new IllegalArgumentException();
        return map;
    }
	
	// Задание 4. Функция для сохранения содержимого каталога в список и вывода первых пяти элементов на экран.
    public static void catContents(String path)
    {
    	File file = new File(path);
    	String[] fileArray = null;
    	if (file.exists() || file.isDirectory())
    	    fileArray = file.list(null);
    	else
    	    System.out.println("[Ошибка]: Не найден каталог.");
    	ArrayList<String> list = new ArrayList(Arrays.asList(fileArray));
    	for (int i = 0; i < list.size(); i++)
    		if (i < 5)
    		    System.out.println(list.get(i));
    }
}


// Задание 2. Класс, который умеет хранить в себе массив из элементов любого типа.
class Array <T>
{
    private ArrayList<T> arr;
    
	public Array (T[] elements)
	{
	    this.arr = new ArrayList<T>();
	    for(T element: elements)
	        arr.add(element);
	}
	
	// Задание 3. Метод, который возвращает любой элемент массива по индексу.
	public T get(int index)
	{
		return this.arr.get(index);
	}
}

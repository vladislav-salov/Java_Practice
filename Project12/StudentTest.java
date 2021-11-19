package Project12;

import Project12.Student;
import Project12.StudentNotFoundException;
import Project12.IStudent;

import java.util.Scanner;


public class StudentTest implements IStudent
{
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws StudentNotFoundException
    {
        System.out.print("Укажите количество студентов: ");
        int length = in.nextInt();
        Student[] newStudents = new Student[length];
        for (int i = 0; i < length; ++i)
        {
            System.out.println("___________________________________________");
            System.out.println("Студент №" + (i + 1) + ":");
            System.out.print("Введите Ф.И.О. студента: ");
            in.nextLine();
            String newName = in.nextLine();
            System.out.print("Введите итоговый балл студента: ");
            double finalscore = in.nextDouble();
            newStudents[i] = new Student(i, finalscore, newName);
        }
        System.out.println("========================================");
        while (true)
        {
            System.out.println("Введите число:");
            System.out.println("1 – для получения информации о студенте;");
            System.out.println("2 – для вывода списка студентов;");
            System.out.println("3 – для сортировки списка студентов;");
            System.out.println("0 – для завершения работы программы.");
            System.out.print("Ваше число: ");
            int choice = in.nextInt();
            in.nextLine();
            System.out.println();
            switch (choice)
            {
                case 1:
                    getInfo(newStudents);
                    System.out.println();
                    break;
                case 2:
                    printStudents(newStudents);
                    System.out.println();
                    break;
                case 3:
                    sort(newStudents);
                    printStudents(newStudents);
                    System.out.println();
                    break;
                case 0:
                    return;
            }
        }
    }

	// Процедура вывода информации о студенте с заданными Ф.И.О.
	private static void getInfo(Student[] students) throws StudentNotFoundException
	{
		System.out.print("Введите Ф.И.О. студента: ");
		String name = in.nextLine();
		System.out.println(students[find(students, name)]);
	}

	// Процедура вывода списка студентов.
	private static void printStudents(Student[] students)
	{
		System.out.printf("%3s|%50s|%14s\n", "ID", "Ф.И.О.", "Итоговый балл");
		System.out.println("______________________________________________________________________________________");
		for (Student newStudents : students)
		{
			System.out.printf("%3d|%50s|%14f\n", newStudents.getID(), newStudents.getName(), newStudents.getFS());
		}
	}

	// Процедура обмена местами для двух элементов массива.
	private static void swap(Comparable<Student>[] array, int i, int j)
	{
		var temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	// Сортировка массива студентов по итоговому баллу.
	public static void sort(Student[] students)
	{
		final int len = students.length;
		for (int i = 0; i < len - 1; ++i)
		{
			for (int j = i + 1; j < len; ++j)
			{
				if (students[i].compareTo(students[j]) > 0)
					swap(students, i, j);
			}
		}
	}

	// Функция поиска студента по Ф.И.О.
	public static int find(Student[] students, String name) throws StudentNotFoundException
	{
		for (int i = 0; i < students.length; ++i)
		{
			if (students[i].getName().equals(name))
				return i;
		}
		throw new StudentNotFoundException("[Ошибка]: Студент \"" + name + "\" отсутствует в базе данных.");
    }
}

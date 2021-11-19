package Project12;

import Project12.Student;
import Project12.StudentNotFoundException;


public interface IStudent
{
    // Процедура сортировки массива студентов по итоговому баллу.
    static void sort(Student[] students) {}

    // Функция, выполняющая поиск студента по Ф.И.О., возвращающая индекс первого вхождения студента в массив.
    static int find(Student[] students, String name) throws StudentNotFoundException
    {
        return 1; 
    }
}

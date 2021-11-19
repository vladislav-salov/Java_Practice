package Project12;


public class Student implements Comparable<Student>
{
    private final int id;  // Объявление целочисленного поля класса Student: "ID студента".
    private final double finalscore;  // Объявление поля с двойной точностью класса Student: "Итоговый балл".
    private final String name;  // Объявление строкового поля класса Student: "Ф.И.О. студента".

    // Конструктор класса Student.
    public Student(int id, double finalscore, String name)
    {
        this.id = id;
        this.finalscore = finalscore;
        this.name = name;
    }

    // Геттер для поля "ID студента".
    public int getID()
    {
        return this.id;
    }

    // Геттер для поля "Итоговый балл".
    public double getFS()
    {
        return this.finalscore;
    }

    // Геттер для поля "Ф.И.О. студента".  
    public String getName()
    {
        return this.name;
    }

    // Функция для сравения итогового балла текущего студента с итоговым баллом другого студента.
    public int compareTo(Student other)
    {
        return Double.compare(this.finalscore, other.getFS());
    }

    // Функция для объединения информации о студенте в одну строку.
    @Override
    public String toString()
    {
        return "Студент {ID: " + this.id + ", " + "Ф.И.О.: " + this.name + ", " + "Итоговый балл: " + this.finalscore + "}";
    }
}

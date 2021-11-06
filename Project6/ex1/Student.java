package ex1;

public class Student
{
    private int idNumber;

    // Конструктор.
    public Student(int idNumber)
    {
        this.idNumber = idNumber;
    }

    // Геттеры и сеттеры.

    public int getIdNumber()
    {
        return idNumber;
    }

    public void setIdNumber(int idNumber)
    {
        this.idNumber = idNumber;
    }

    @Override
    public String toString()
    {
        return idNumber + " ";
    }
}

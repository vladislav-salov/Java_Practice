package Project12;


public class StudentNotFoundException extends Exception
{
    // Обработка исключения при отсутствии студента в базе данных.
    public StudentNotFoundException(String errMsg)
    {
        super(errMsg);
    }
}

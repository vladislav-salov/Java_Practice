package Project12;


public class InvalidTINException extends Exception
{
    // Обработка исключения для ИНН.
    public InvalidTINException(String errMsg)
    {
        super(errMsg);
    }
}

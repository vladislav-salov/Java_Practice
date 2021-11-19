package Project12;

import Project12.InvalidTINException;

import java.util.Scanner;
import java.util.HashMap;


public class TINTest
{
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        var database = new HashMap<String, String>(5);
        database.put("0123456789", "Иванов Иван Иванович");
        database.put("1234567890", "Петров Пётр Петрович");
        database.put("2345678901", "Васильев Василий Васильевич");
        database.put("3456789012", "Сергеев Сергей Сергеевич");
        database.put("4567890123", "Александров Александр Александрович");
        System.out.print("Введите Ф.И.О.: ");
        String name = in.nextLine();
        System.out.print("Введите ИНН: ");
        String tin = in.next();
        try
        {
            String dbName = database.get(tin);
            if (!name.equals(dbName))
            {
                throw new InvalidTINException("[ОШИБКА]: ИНН \"" + tin + "\" не действителен для \"" + name + "\".");
            }
            System.out.println("ИНН \"" + tin + "\" действителен для \"" + name + "\".");
        }
        catch (InvalidTINException exception)
        {
            System.err.println(exception.getMessage());
        }
    }
}

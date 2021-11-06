public class Dog extends Pet // Производный класс Dog.
{
    public Dog(String name) // Конструктор класса Dog.
    {
        super(name); // Вызов конструктора базового класса Pet для передачи поля name в конструктор класса Dog.
    }
}
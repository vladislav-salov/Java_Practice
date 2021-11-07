public class PingPong  // Основной класс.
{
    public static void main(String[] args)
    {
        Object lock = new Object();  // Объявление объекта lock, который будет необходим для подачи доступа в метод потокам.
        Thread ping = new Thread(new PingPongThread(lock, "Ping"));  // Объявление потока "ping" как объекта класса PingPongThread.
        Thread pong = new Thread(new PingPongThread(lock, "Pong"));  // Объявление потока "pong" как объекта класса PingPongThread.
        ping.start();  // Запуск потока "ping".
        pong.start();  // Запуск потока "pong".
    }
}


class PingPongThread implements Runnable
{
    private Object lock;  // Объявление поля lock.
    private String name;  // Объявление поля name.

    public PingPongThread(Object lock, String name)  // Конструктор класса.
    {
        this.lock = lock;
        this.name = name;
    }

    @Override  // Так как в Java уже есть встроенный метод run() для потоков.
    public void run()  // Метод для потока, который запустится после запуска потока методом start().
    {
        synchronized (lock)  // Данный блок может выполняться только одним потоком одновременно.
        {
            while(true)  // Выполнять:
            {
                System.out.println(name);  // Вывод текущего имени ("ping" или "pong").
                try  // При отсутствии исключений:
                {
                    Thread.sleep(1000);  // Приостановка потока на 1 секунду (добавление остановок при выводе).
                }
                catch (InterruptedException e)  // В случае исключения:
                {
                    e.printStackTrace();  // Указание точной строки, в которой метод вызвал исключение, а также название метода.
                }
                lock.notify();  // Продолжение работы того потока, который находится в режиме ожидания (у которого ранее был вызван метод wait()).
                try  // При отсутствии исключений:
                {
                    lock.wait(1000);  // Приостановка потока на 1 секунду или установка в режим ожидания, пока другим потоком не будет вызван метод notify().
                }
                catch (InterruptedException e)  // В случае исключения:
                {
                    e.printStackTrace();  // Указание точной строки, в которой метод вызвал исключение, а также название метода.
                }
            }
        }
    }
}
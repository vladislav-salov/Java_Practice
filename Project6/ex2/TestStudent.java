package ex2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestStudent
{
    public static void main(String[] args)
    {
        ex2.Student st[] = new ex2.Student[30];
        List<ex2.Student> stu = new ArrayList<>();
        for (int i = 0; i < 30; i++)
	{
            st[i] = new ex2.Student((int) (Math.random() * 200), (int) (Math.random() * 200));
            stu.add(new ex2.Student((int) (Math.random() * 200), (int) (Math.random() * 200)));
        }
        Comparator<Student> comp = new SortingStudentsByGPA();
        stu.sort(comp);
        System.out.println("Id: Ball:");
        for (Student i: stu)
	{
            System.out.println(i);
        }
    }
}

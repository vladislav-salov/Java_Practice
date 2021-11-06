package ex3;

import ex2.SortingStudentsByGPA;
import ex2.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestStudent
{
    public static void main(String[] args)
    {
        ex2.Student st[] = new ex2.Student[30];
        List<ex2.Student> stu1 = new ArrayList<>();
        List<ex2.Student> stu2 = new ArrayList<>();
        for (int i = 0; i < 30; i++)
	{
            st[i] = new ex2.Student((int) (Math.random() * 200), (int) (Math.random() * 200));
            stu1.add(new ex2.Student((int) (Math.random() * 200), (int) (Math.random() * 200)));
            stu2.add(new ex2.Student((int) (Math.random() * 200), (int) (Math.random() * 200)));
        }
        Comparator<ex2.Student> comp = new SortingStudentsByGPA();
        stu1.sort(comp);
        stu2.sort(comp);
        List<ex2.Student> stu3 = new ArrayList<>();
        int positionA = 0, positionB = 0;
        for (int i = 0; i < stu1.size() + stu2.size(); i++)
	{
            if (positionA == stu1.size())
	    {
                stu3.add(stu2.get(positionB));
                positionB++;
            }
	    else if (positionB == stu2.size())
	    {
                stu3.add(stu1.get(positionA));
                positionA++;
            }
	    else if (stu1.get(positionA).getBal() > stu2.get(positionB).getBal())
	    {
                stu3.add(stu1.get(positionA));
                positionA++;
            }
	    else
	    {
                stu3.add(stu2.get(positionB));
                positionB++;
            }
        }
        System.out.println("Id: Ball:");
        for (Student i : stu3)
	{
            System.out.println(i);
        }
    }
}

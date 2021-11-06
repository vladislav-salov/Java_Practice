package ex2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<ex2.Student>
{
    @Override
    public int compare(ex2.Student o1, ex2.Student o2)
    {
        return -(o1.getBal() - o2.getBal());
    }
}

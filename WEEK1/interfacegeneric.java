import java.io.*;
interface MinMax<T extends Comparable<T> > {
    T min();
    T max();
}
class interfacegeneric<T extends Comparable<T> >implements MinMax<T> {
    T[] values;
    interfacegeneric(T[] obj) { values = obj; }
    public T min()
    {
        T o1 = values[0];
        for (int i = 1; i < values.length; i++)
            if (values[i].compareTo(o1) < 0)
                o1 = values[i];
        return o1;
    }
    public T max()
    {
        T o1 = values[0];
        for (int i = 1; i < values.length; i++)
            if (values[i].compareTo(o1) > 0)
                o1 = values[i];
        return o1;
    }
}
class ABC {
    public static void main(String[] args)
    {
        Integer arr[] = { 3, 6, 2, 8, 6 };
        MyClass<Integer> obj1 = new MyClass<Integer>(arr);
        System.out.println("Minimum value: " + obj1.min());
        System.out.println("Maximum value: " + obj1.max());
    }
}

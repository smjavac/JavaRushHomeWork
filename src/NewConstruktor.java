/**
 * Created by admin on 27.04.2016.
 */
public class NewConstruktor
{
    public static void main(String[] args)
    {
        Salary2 s1 = new Salary2();
        Salary2 s2 = new Salary2(s1);
        System.out.println("s1.value=" +s1.value);//В качестве параметра используется значение ссылки на объект.
                                                  // При выполнении строки Salary2 s2 = new Salary2(s1); конструктору Salary2(Salary x)
                                                  // передастся значение ссылки на объект переменной s1, и конструктор фактически утроит
                                                  // зарплату для s1.value, поскольку даже копия (Salary x), создаваемая внутри конструктора
                                                  // указывает на объект переменной s1.

        System.out.println("s2.value="+s2.value);
    }
    static class Salary2
    {
        int value = 1000;

        Salary2()
        {
        }

        Salary2(Salary2 x)
        {
            x.value = x.value * 3;

        }
    }
}

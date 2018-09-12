/**
 * Created by admin on 10.04.2016.
 */
public class Osnovnoe
{
    public static void main(String[]args){
        Person person1=new Person();
        person1.setNameandsetAge("Said",33);
        //person1.age=35;
        person1.speak();
        String s1="Zaur";

        Person person2=new Person();
        person2.setNameandsetAge(s1,33);
        person2.speak(); //int yer1= person1.vozvrat();
        //int yer2= person2.vozvrat();
        //System.out.println("Саиду до пенсии осталось "+yer1+" года");
        //System.out.println("Зауру до пенсии осталось "+yer2+" года");
    }
}
class Person{
    String name;
    int age;

    void setNameandsetAge(String uzername,int uzerage){
        name=uzername;
        age=uzerage;
    }
    int vozvrat(){
    int yers =65-age;
        return yers;
     }
    void speak(){
        for(int i=0;i<3;i++){
        System.out.println("Меня зовут " + name + ", мне " + age + " года");
        }
    }
    void say(){
        System.out.println("Привет!");
    }
}

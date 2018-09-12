/**
 * Created by admin on 13.04.2016.
 */
public class SetNameGetName// или по дуругому это называется ИНКАПСУЛЯЦИЯ
{
    public static void main(String[] args){
    Persson persson1=new Persson();
    persson1.setName("Zaur");
    persson1.setAge(22);
    System.out.println("меня зовут "+persson1.getName()+" и мне "+persson1.getAge()+" года");
        System.out.println();
        persson1.speak();
   }
}


class Persson{
   private String name;
    int age;
    public void setName(String uzerName){
        if(uzerName.isEmpty()){
            System.out.println("Вы ввели пустое имя");
        } else {
            name=uzerName;
        }

    }
    public String getName(){
        return name;
    }
    void setAge(int uzerAge){
        if(uzerAge<0){
            System.out.println("Вы ввели отрицательный возраст");
        } else {
            age =uzerAge;
        }

    }
    int getAge(){
        return age;
    }
    void speak(){
        for(int i=0;i<3;i++){
        System.out.println("меня зовут " + name + " и мне " + age + " goda");
        }
    }

}

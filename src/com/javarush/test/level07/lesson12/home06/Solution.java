package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human ded1 = new Human("Дедушка1", true, 60, null,null);
        Human ded2 = new Human("Дедушка2", true, 65, null,null);
        Human bab1 = new Human("бабушка1", true, 50, null,null);
        Human bab2 = new Human("бабушка2", true, 55, null,null);

        Human fatrer = new Human("Эмин", true, 33, ded1,bab1);
        Human mother = new Human("Луиза", false, 30, ded2,bab2);
        Human human = new Human("Хавашка", false, 12, fatrer, mother);
        Human human2= new Human("Саид", true, 7, fatrer, mother);
        Human human3= new Human("Сулиман", true, 5, fatrer, mother);



        //human.father = new Human("Алик");
      // human.mother = new Human( "Лена");
        System.out.println(human);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(fatrer);
        System.out.println(mother);
        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(bab1);
        System.out.println(bab2);//напишите тут ваш код
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;//напишите тут ваш код

        Human (String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

      /*  Human (String name){
            this.name = name;
        }*/

               public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}

package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg z1=new Zerg();
        z1.name="zx";
        Zerg z2=new Zerg();
        z2.name="zc";
        Zerg z3=new Zerg();
        z3.name="zv";
        Zerg z4=new Zerg();
        z4.name="zb";
        Zerg z5=new Zerg();
        z5.name="zn";
        Zerg z6=new Zerg();
        z6.name="zm";
        Zerg z7=new Zerg();
        z7.name="za";
        Zerg z8=new Zerg();
        z8.name="zs";
        Zerg z9=new Zerg();
        z9.name="zd";
        Zerg z10=new Zerg();
        z10.name="zf";

        Protos p=new Protos();
        p.name="pa";
        Protos p1=new Protos();
        p1.name="ps";
        Protos p3=new Protos();
        p3.name="pd";
        Protos p4=new Protos();
        p4.name="pf";
        Protos p5=new Protos();
        p5.name="pg";

        Terran t=new Terran();
        t.name="ty";
        Terran t2=new Terran();
        t2.name="tu";
        Terran t3=new Terran();
        t3.name="ti";
        Terran t4=new Terran();
        t4.name="to";
        Terran t6=new Terran();
        t6.name="tp";
        Terran t7=new Terran();
        t7.name="ta";
        Terran t8=new Terran();
        t8.name="ts";
        Terran t9=new Terran();
        t9.name="td";
        Terran t10=new Terran();
        t10.name="tf";
        Terran t11=new Terran();
        t11.name="tg";
        Terran t12=new Terran();
        t12.name="th";
        Terran t13=new Terran();
        t13.name="tj";//напишите тут ваш код

    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}
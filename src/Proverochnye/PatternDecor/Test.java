package Proverochnye.PatternDecor;

//import static Proverochnye.PatternDecor.Test.printName;

import java.io.*;

public class Test
{
    public static void main(String[] args) throws IOException
    {
//        Cat cat = new Cat("Васька ");
//        Cat catWrap = new CatWrapper (cat);
//        printName(catWrap);

        StringBuilder sb = new StringBuilder();
        sb.append("Lena").append('\n');
        sb.append("Olya").append('\n');
        sb.append("Anya").append('\n');
        String data = sb.toString();

        //Оборачиваем строку в класс ByteArrayInputStream

        InputStream is = new ByteArrayInputStream(data.getBytes());

        //подменяем in
        System.setIn(is);

        //вызываем обычный метод, который не подозревает о наших манипуляциях
        readAndPrintLine();
    }

    public static void readAndPrintLine() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        while (true)
        {
            String line = reader.readLine();
            if (line == null) break;
            System.out.println(line);
        }
        reader.close();
        isr.close();
    }


//    public static void printName(Cat named)
//    {
//        System.out.println(named.getName());
//    }
}

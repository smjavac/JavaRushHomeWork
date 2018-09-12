package Proverochnye.potoky;

import java.io.*;

public class SolutionPotoky
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fileWriter = new FileWriter(bufferedReader.readLine());
        fileWriter.write("hello world");
        fileWriter.close();
    }
}

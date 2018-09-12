package Proverochnye.Tehnotrek;

public class MainApp
{

        static class StringWrp
        {
            public StringWrp(String in)
            {
                this.in = in;
            }

            String in;
        }

        public static void main(String[] args)throws Exception
        {
            StringWrp z = new StringWrp("a");
            StringWrp aa = z;
            StringWrp bb = new StringWrp("b");
            System.out.println("z = "+z.in);
            someMethod(aa,bb);
            System.out.println("z = "+ z.in);
        }
        static void someMethod(StringWrp a, StringWrp b){
            String c = a.in;
            a.in = b.in;
            b.in = c;
            System.out.println("a = "+ a.in + " b = "+ b.in);
        }


    }

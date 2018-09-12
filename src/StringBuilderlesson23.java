/**
 * Created by admin on 17.04.2016.
 */
public class StringBuilderlesson23
{
    public static void main(String[] args)
    {
        StringBuilder cb=new StringBuilder("Hello");
        System.out.println(cb.toString());
        cb.append(" my").append(" frend"); /*это идентично cb.append(" my");
                                                           cb.append(" frend");*/
        System.out.println(cb.toString());

        /*String sb="Hello";
        sb=sb.toUpperCase();
        System.out.println(sb);
    */}
}

/**
 * Created by admin on 16.04.2016.
 */
public class ProStatic
{
    public static void main(String[] args)
    {
       Hamman h1=new Hamman("Zaur",23);
       Hamman h2=new Hamman("Said",33);
       h1.getObedinenie();
       h2.getObedinenie();
       Hamman h3=new Hamman("Anzor",25);
        h1.getObedinenie();
        h2.getObedinenie();
        h3.getObedinenie();
    }
}
class Hamman{
    private int age;
    private String name;

    public static int obedinenie;

    public Hamman(String name,int age){
        this.name=name;
        this.age=age;
        obedinenie++;

    }
    public void getObedinenie(){
        System.out.println("number is people"+obedinenie);
    }

}
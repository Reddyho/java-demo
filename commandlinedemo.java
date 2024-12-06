
public class commandlinedemo
{
    public static void main(String[] args)
    {
        String name;
        float avg;
        int num1,num2,num3,sum=0;
        name=args[0];
        num1=Integer.parseInt(args[1]);
        num2=Integer.parseInt(args[2]);
        num3=Integer.parseInt(args[3]);

        sum=num1+num2+num3;
        avg=(float) sum/3;

        System.out.println(sum);
        System.out.println(avg);
        System.out.println("thankyou Mr."+name+".Happy coding");
    }
}
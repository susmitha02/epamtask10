import java.util.stream.IntStream;
import java.util.OptionalDouble;


public class Task1 {
    public static void main(String args[])
    {
        IntStream s=IntStream.of(2,4,6,8,10,12,14,16,18,20);
        OptionalDouble obj=s.average();
        if(obj.isPresent())
        {
            System.out.println("The average of numbers is :"+obj.getAsDouble());
        }
        else
        {
            System.out.println("Not available");
        }
    }
}
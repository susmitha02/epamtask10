import java.util.*;
import java.util.stream.Collectors;

public class Task2
{
	static List<String> answerRequired(List<String> l1)
    {
        return(l1.stream().filter(s -> s.startsWith("a")).filter(s -> s.length()==3).collect(Collectors.toList()));
    }
    public static void main(String args[]) 
    {
        List<String> list = new ArrayList<String>();
        list.add("ant");
        list.add("ask");
        list.add("apple");
        list.add("axe");
        list.add("always");
        list.add("book");
        list.add("corona");
       
        System.out.println("Original List:");
        for(String i:list)
            System.out.println(i);
        list=answerRequired(list);
        System.out.println("\nRequired List:");
        for(String i:list)
            System.out.println(i);
    } 
}
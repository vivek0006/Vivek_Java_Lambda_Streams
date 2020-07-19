//This is the home task for Java Lambda 8 and streams!!
import java.util.*;
import java.util.stream.IntStream;

public class Question3 {
    public static void main(String args[])
    {
        List<String> list1=new ArrayList<String>();
        list1.add("aba");
        list1.add("add");
        list1=pal(list1);
        for(String i:list1)
            System.out.println(i);
    }
    static List<String> pal(List<String> list1)
    {
        List<String> list2=new ArrayList<String>();
           for(String i:list1)
           {String t = i.replaceAll("\\s+", "").toLowerCase();
            if( IntStream.range(0,t.length()/2).noneMatch(j -> t.charAt(j)!= t.charAt(t.length()-j-1)))
                list2.add(i);}
            return list2;
    }
}
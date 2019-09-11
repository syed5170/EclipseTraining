import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateOverHashSetExample 
{
    public static void main(String[] args) 
    {
        Set<String> programmingLanguages = new HashSet<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("Ruby");
        System.out.println(programmingLanguages);
        programmingLanguages.stream().filter(p->p.equals("Java"))
        .map(p->p.toUpperCase()).forEach(System.out::print);       
    }       
}
package iteratorMain;

/**
 * @author Viktor Bakakin
 */
public class DeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"java", "spring", "sql"};
        JavaDeveloperIterator developer = new JavaDeveloperIterator("Victor", skills);
        Iterator iterator = developer.getIterator();

        System.out.println("Dev " + developer.getName() );
        System.out.println("skills");

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}

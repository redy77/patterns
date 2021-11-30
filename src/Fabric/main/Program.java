/**
 * @author Viktor Bakakin
 */
public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactory("ty");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperFactory(String specialist){
        if(specialist.equals("java")){
            return new JavaDeveloperFactory();
        }
        if(specialist.equals("c++")){
            return new CppDeveloperFactory();
        }else {
            throw new RuntimeException(specialist + " is unknow");
        }
    }
}

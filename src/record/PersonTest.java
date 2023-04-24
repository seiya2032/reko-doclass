package record;

public class PersonTest {
    public static void main(String[] ages){
        Person[] persons = {
         new Person("田中","タナカ",18),
         new Person("山田","ヤマダ",19),
         new Person("真田","サナダ",20),
         new Person("明智","アケチ",21),
         new Person("織田","オダ",22),
        };
        for(var person : persons){
            System.out.println(person);
        }
    }
}

import java.util.ArrayList;

public class main 
{
    public static void main(String[] args){
        System.out.println("------------------------");
        Person sergei = new Person("Алексей", "муж.",
        39,"Александра", "Петр","Анна");
        System.out.println(sergei);

        System.out.println("\nПервая реализация\n     ---");
        ArrayList<String> child = new ArrayList<String>();
        sergei.addChild1(child, "Дмитрий");
        sergei.addChild1(child, "Оля");
        sergei.printChild();

        System.out.println("\nВторая реализация\n     ---");
        
        ArrayList<baby> children = new ArrayList<>();

        baby nikolai = new baby("Николай","Муж",25,"Аннэт'",
                                    sergei.getNameAncestor(), sergei.getWife());

        baby dim = new baby("Дмитрий","Муж",19, "нет.",
                                    sergei.getNameAncestor(), sergei.getWife());

        
        sergei.addChild2(children, nikolai); 
        sergei.addChild2(children, dim);    

        sergei.allChildren();

    }
}
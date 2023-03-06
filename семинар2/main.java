public class main {
    public static void main(String[] args) {
        Person alex = new Person ("Алексей","Муж",1990,"Россия");
        Person inna = new Person ("Инна","Жен",1992,"Беларусь");
        Person ivan = new Person ("Иван","Муж",1986,"Россия");
        Person arya = new Person ("Ария","Жен",1999,"Армения");
        alex.addChild(inna);
        alex.addChild(ivan);
        alex.addChild(arya);
        
        
        System.out.println(alex);
        System.out.println(inna);
        System.out.println(ivan);
        System.out.println(arya);

        Person katya = new Person("Катя", "жен.", 2000, "Россия");
        Person Vera = new Person("Вера", "жен.", 2009, "Россия");
        katya.addChild(Vera);
        System.out.println(katya);
        System.out.println(Vera);

        IO save = new IO();
        alex.saveObj(save);
        save.load("FreeFamily.data");
    }
}

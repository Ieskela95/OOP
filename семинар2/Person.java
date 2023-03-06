import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Person implements Serializable {
    private String name;
    private String sex;
    private int year;
    private String place;
    private Person mather;
    private Person father;
    private List<Person> children;
    private Person child; 

    public Person(String name, String sex,int year,String place) {
        this.name = name;
        this.sex = sex;
        this.year = year;
        this.place = place;
        children = new ArrayList<>();
    }
    public Person(String name, String sex, int year,String place, Person mather, Person father){
        this(name,sex,year,place);
        this.mather = mather;
        this.father = father;
    }


    public void addChild(Person chind){
        this.children.add(child);
        if (this.sex == "Муж")
        {
            chind.father = this;
        }
        else chind.mather = this;
    }


    @Override
    public String toString() 
    {
        String res = "Имя: " + name +  ", Пол: " + sex + ", Год рождения: " + year + ", Место рождения: " + place;
        if (this.mather != null){
            res += ", Мать: " + mather.name;
        }
        else res += ", Мать: неизвестна";
        
        if (this.father != null){
            res += ", Отец: " + father.name;
        }
        else res += ", Отец: неизвестен,";
        
        return res;
        
    }


    public String getName() 
    {
        return name;
    }

    public Person getFather() 
    {
        return father;
    }

    public Person getMather() 
    {
        return mather;
    }

    public void saveObj(IO save) {
        save = new IO();
        save.save("FreeFamily.data", this);
    }
}

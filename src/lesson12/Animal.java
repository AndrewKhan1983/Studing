package lesson12;

public class Animal {

       // что может быть внутри класса:
       // 1 - переменные
       // 2 - конструктор
       // 3 - методы
    // модификатор доступа: public, __________, protected, private
    private int age;
    private String name;
    private String poroda;

    // формула создания конструктора
    // 1 - модификатор доступа
    // 2 - название конструктора
    // 3 - входящие параметры
    // 4 - тело конструктора (то что выполняется прие его вызове)
public Animal (){

}

    public Animal(int age, String name, String poroda) {
        this.age = age;
        this.name = name;
        this.poroda = poroda;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;

    }
    // формула создания метода:
    // 1 - модификатор доступа
    // static (пишем или нет)
    // 3 - возвращаемый тип или void если его нет
    // 4 - название метода
    // 5 - входящие параметры ()
    // 6 - тело метода
    public void printVoice() {
        System.out.println("pppppppppppppppp");
    }
}

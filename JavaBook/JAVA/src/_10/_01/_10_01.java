package _10._01;

class Human {
    String name;
    int age;
    void eat()  {}
    void sleep() {}
}

class Student extends Human{
    int studentID;
    void goToSchool(){}
}
class Woker extends Human{
    int WokerID;
    void goToWork(){}
}


public class _10_01 {
    public static void main(String[] args) {
        //휴먼 객체 생성
        Human h = new Human();
        h.name = "김현지";
        h.age =11;
        h.eat();
        h.sleep();

        Student s = new Student();
        s.name= "김민성";
        s.age = 18;
        s.studentID = 128;
        s.eat();
        s.sleep();
        s.goToSchool();

        Woker w = new Woker();
        w.name = "봉윤정";
        w.age = 30;
        w.WokerID = 127;
        w.eat();
        w.sleep();
        w.goToWork();
    }
}

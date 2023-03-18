package inheritanceHomework;

public class Runtest {
    public static void main(String[] args) {
        System.out.println("Grandfather class");
Phone p = new Phone();
p.call();
p.sms();

        System.out.println("Parents class");
Smartphone s = new Smartphone();
Bacisphone b = new Bacisphone();
b.clock();
b.call();
b.sms();
s.camera();
s.alarm();
s.internet();
s.voice();
s.password();
s.call();
s.sms();
        System.out.println("Child class");
Applephone a = new Applephone();
a.iphone();
a.call();
a.sms();
a.alarm();
a.internet();
a.camera();
a.password();
a.voice();

        System.out.println("Child class");
        Samsungphone m = new Samsungphone();
        m.alarm();
        m.call();
        m.sms();
        m.camera();
        m.voice();
        m.internet();
        m.password();

    }
}

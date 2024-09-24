public class ChatBotRun {
    public static void main (String[] args) {
        ChatBot billy = new ChatBot("billy", 42);
        billy.greeting("Patryk");
        billy.weather();
        billy.favoriteNumber(37);
        System.out.println(billy.addNumbers(1, 2, 3));
        System.out.println(billy.convertFeetToMeters(3));
        System.out.println(billy.AbsoluteVal(-23.4));
        billy.apples();
        System.out.println(billy.Amazing(10));
        System.out.print(billy.guessingRand(475));
       System.out.println( billy.yearsToMinutes(3));
        billy.human();
        System.out.println(billy.goodbye());
     }
}

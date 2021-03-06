package introduction;

public class SimpleTypes {
    public static void main(String[] args) {
        int age;
        age = 0;
        System.out.println("Wiek to " + age + " lat.");

        long lottoReward = 32_000_000L;
        System.out.println("Wygrana w lotto to " + lottoReward + " zł");

        short dayOfMonth = 29;
        System.out.println("Dzień miesiąca to " + dayOfMonth);
        dayOfMonth = 23;
        System.out.println("Dzień miesiąca to " + dayOfMonth);

        float bodyMass = 80.13f;
        System.out.println("Masa ciała to " + bodyMass + " kg");

        final double PI_PI = 3.1415926535897932384626433832795028841971693993751d;
        System.out.println("Liczba π to " + PI_PI);

        boolean isPaid = false;
        String isPaidTxt = isPaid ? "tak" : "nie";
        System.out.println("Czy zapłacono rachunek? " + isPaidTxt);
        isPaid = !isPaid;
        isPaidTxt = isPaid ? "tak" : "nie";
        System.out.println("A może teraz już zapłacono? " + isPaidTxt);

        String name = "Tomasz";
        if (name.length()>0) {
            String sex  = (name.toLowerCase().charAt(name.length() - 1) == 'a') ? "kobieta" : "mężczyzna";    //jeśli ostatni znak imienia to a płeć kobieta, w przeciwnym razie mężczyzna
            System.out.println(name + " to " + sex );
        }

        int index = 1;
        char letter = name.charAt(index);

        String prefix = "To";
        boolean isStartingWith = name.toLowerCase().startsWith(prefix.toLowerCase());
    }
}

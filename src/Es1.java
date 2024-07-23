public class Es1 {

    public static boolean stringaPariDispari(String s) {
        if (s.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean annoBisestile(int anno) {
        return (anno % 4 == 0 && (anno % 100 == 0 && anno % 400 == 0));
    }


    public static void main(String[] args)  {

        String stringa1 = "ciao mi chiamo Gigi!";
        String stringa2 = "ciao mi chiamo Giova!";

        System.out.println("è " + stringa1 + " pari?" + stringaPariDispari(stringa1));
        System.out.println("è " + stringa2 + " pari?" + stringaPariDispari(stringa2));

        int anno1 = 2012;
        int anno2 = 2000;
        int anno3 = 1600;

        System.out.println("l'anno " + anno1 + " è Bisestile?" + annoBisestile(anno1));
        System.out.println("l'anno " + anno2 + " è Bisestile?" + annoBisestile(anno2));
        System.out.println("l'anno" + anno3 + " è Bisestile?" + annoBisestile(anno3));

    }
}

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("<1 užduotis>");
//        Sukurkite Funkciją kuri priima du int tipo kintamuosius. Juos susumuoja ir atspausdina.
        int kint1 = 2;
        int kint2 = 6;
        pirmaUzd(kint1, kint2);

        //2 uzduotis
//        Sukurkite Funkciją kuri vadinasi PISq. Funkcija gražina double tipo reikšmę.
//        Reikšmė yra : 9.8596; Gautą reikšmę atspausdinkite.
        System.out.println("<2 uzduotis> " + PISq());

        //3 uzduotis
        // Sukurkite Funkciją kuri priima du int tipo kintamuosius.
// Funkcija gražina skaičių sandaugą.;
// Gautą reikšmę atspausdinkite.
        System.out.println("<3 uzduotis>");
        System.out.println(trecUzd(6, 5));

// 4 uzduotis
//Sukurkite Funkciją kuri priima int[] tipo kintamąį,
// prasuka ciklą ir atspausdina kiekvieną skaičių vienoje eilutėje.
        System.out.println("<4 uzduotis>");
        int[] arr = {6, 5, 7, 8};
        printArr(arr);

        //5 uzduotis
// Sukurkite Funkciją kuri priima du int tipo kintamuosius,
// min ir max reikšmėms nustatyti ir sugeneruoja random int skaičių ir jį gražintų.
        System.out.println("<5 uzduotis>");
        System.out.println(penktUzd(40, 57));

        System.out.println("<6 uzduotis>");
        int[] randArr = randArr(5, 9, 5);
        printArr(randArr);

        System.out.println("<7 uzduotis>");
        System.out.println(masyvoSum(randArr));

        System.out.println("<8 uzduotis>");
        System.out.println(masyvoVidurkis(randArr));

        System.out.println("<9 uzduotis>");
        staciakampis(5, 50);

        System.out.println("<10 uzduotis>");
        tekstas("Šiandien labai graži diena");

        System.out.println("<11 uzduotis>");
        sadrav("Šiandien labai graži diena");

        System.out.println("<sunkesniu 1 uzduotis>");
        apgaubimas("vardas");

        System.out.println("<sunkesniu 2 uzduotis>");
        int length = 10;
        String text = generateRndStr(length);
        printRandomSymbols(text);
        System.out.println(text);

        System.out.println("<sunkesniu 3 uzduotis>");
        System.out.println(dalinasiBeLiekanos(15));
    }

    public static void pirmaUzd(int kint1, int kint2) {
        System.out.println("The sum is: " + (kint1 + kint2));
    }

    //    2 uzduotis
    public static double PISq() {
        return 9.8596;
    }

    //    3 uzduotis
    public static int trecUzd(int a, int b) {
        return (a * b);
    }

    // 4 uzduotis
    public static void printArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    //5 uzduotis
    public static int penktUzd(int min, int max) {
        return (int) (min + Math.random() * (max - min));
    }

//6 uzduotis
//Sukurkite Funkciją kuri sugeneruotų random int skaičių masyvą ir jį gražintų.
// Funkcija priima tris int tipo kintamuosius, min, max ir length reikšmėms nustatyti.

    public static int[] randArr(int min, int max, int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (min + Math.random() * (max - min));
        }
        return array;
    }

// 7 uzduotis
//Sukurkite Funkciją kuri panaudotų 6tos užduoties masyvą (priimtų kaip kintamąjį),
// susumuotų ir gražintų reikšmę.

    public static int masyvoSum(int[] Arr) {
        return Arrays.stream(Arr).sum();
    }

    // 8 uzduotis
//    Sukurkite Funkciją kuri priimtų 6tos užduoties masyvą ir gražintų jos skaičių vidurkį (double).
    public static double masyvoVidurkis(int[] masyvas) {
        return (double) Arrays.stream(masyvas).sum() / masyvas.length;
    }

    //9 uzduotis
//Sukurkite Funkciją kuri priimtų du int skaičius ir atspausdintų stačiakampį
// užpildytą žvaigždutėmis. Pirmas int - išoriniam ciklui, antras vidiniam.
    public static void staciakampis(int eilutes, int stulpeliai) {
        for (int p = 0; p < eilutes; p++) {
            for (int i = 0; i < stulpeliai; i++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
// 10 uzduotis
//    Sukurkite Funkciją kuri priimtų sakinį kaip kintamąjį ir
//    atspausdintų kiek jame yra raidžių(simbolių) ir tarpų.
//    Sakinys - “Šiandien labai graži diena”. (kodas turi veikti padavus bet kokį sakinį)

//    public static void tekstas(String sakinys) {
//        sakinys = sakinys.replaceAll("ą,č,ę,ė,į,š,ų,ū,ž","a,c,e,e,i,s,u,u,z");
//        int letterCount = 0;
//        int spaceCount = 0;
//        for (char letter = 'a'; letter <= 'z'; letter++) {
//            for (int i = 0; i < sakinys.length(); i++) {
//                if (sakinys.charAt(i) == letter) {
//                    letterCount++;
//                }
//            }
//            spaceCount = sakinys.length() - letterCount;
//        }
//        System.out.println("Tekste yra " + letterCount + " raidziu ir " + spaceCount + " tarpu");
//    }

    public static void tekstas(String text) {
        int spaceCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        int letterCount = text.length() - spaceCount;
        System.out.println("Tekste yra " + letterCount + " raidzes ir " + spaceCount + " tarpai");
    }

// 11 uzduotis
//Sukurkite Funkciją kuri priimtų sakinį, jį užkoduotų ir grąžintų.
// Kodavimas - sakinį apsukame iš kitos pusės. Pvz “Naglis” turi gautis “silgaN”.

//    public static void sadrav (String sakinys){
//        for (int i = 0; i < sakinys.length(); i++) {
//            for (int j = 0; j < sakinys.length(); j++) {
//                if(i + j == sakinys.length()-1){
//                    System.out.print(sakinys[i]);
//                }
//            }
//        }
//    }

    public static void sadrav(String sakinys) {
        for (int i = sakinys.length() - 1; i >= 0; i--) {
            System.out.print(sakinys.charAt(i));
        }
        System.out.println();
    }

// sunkesniu 1 uzduotis
//Parašykite funkciją, kurios argumentas būtų tekstas,
// kuris būtų atspausdinamas konsolėje pridedant “---” pradžioje ir gale. PVZ (---labas---)

    public static void apgaubimas(String tekstas) {
        System.out.println("---" + tekstas + "---");
    }

    // sunkesniu 2 uzduotis
    //Sugeneruokite atsitiktinį stringą iš raidžių ir skaičių (10 simbolių).
    // Atspausdinkite simbolius stulpeliu. Jei tai skaičius apgaubkite “ [ 7 ]”.
    // Jei skaičiai eina keli iš eilės, apgaubkite juos kartu. [75].
    public static String generateRndStr(int length) {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345678901234567890";
        String text = "";
        for (int i = 0; i < length; i++) {
            text += symbols.charAt((int) (Math.random() * symbols.length()));
        }
        return text;
    }

    public static void printRandomSymbols(String text) {
        String number = "";
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (Character.isDigit(currentChar)) {
                number += currentChar;
            } else {
                if (number.length() > 0) {
                    System.out.println("[" + number + "]");
                }
                System.out.println(currentChar);
                number = "";
            }
        }
        if (number.length() > 0) {
            System.out.println("[" + number + "]");
        }
    }

//     sunkesniu 3 uzduotis
//    Parašykite funkciją, kuri skaičiuotų, ir gražintų iš kiek sveikų skaičių
//    jos argumentas dalijasi be liekanos (išskyrus vienetą ir patį save).

    public static int dalinasiBeLiekanos(int dalinamasSkaicius) {
        int dalikliai = 0;
        if (dalinamasSkaicius <= 1) {
            return 0;
        }
        for (int d = 2; d < dalinamasSkaicius; d++) { // d - daliklis, is jo daliname
            if (dalinamasSkaicius % d == 0) {
                dalikliai++;
            }
        }
        return dalikliai;
    }















}
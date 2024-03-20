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
        System.out.println(trecUzd(6,5));

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
        System.out.println(penktUzd(40,57));

        System.out.println("<6 uzduotis>");
        int [] randArr = randArr (5, 9, 5);
        printArr(randArr);

        System.out.println("<7 uzduotis>");
        System.out.println(masyvoSum(randArr));

        System.out.println("<8 uzduotis>");
        System.out.println(masyvoVidurkis(randArr));

        System.out.println("<9 uzduotis>");
        staciakampis(5,50);
    }
        public static void pirmaUzd(int kint1, int kint2){
            System.out.println("The sum is: " + (kint1 + kint2));
        }
//    2 uzduotis
    public static double PISq(){
        return 9.8596;
    }

//    3 uzduotis
        public static int trecUzd (int a,int b) {
            return (a * b);
        }

// 4 uzduotis
    public static void printArr (int[] a){
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

    public static int [] randArr(int min, int max, int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (min + Math.random() * (max - min));
        }
        return array;
    }

// 7 uzduotis
//Sukurkite Funkciją kuri panaudotų 6tos užduoties masyvą (priimtų kaip kintamąjį),
// susumuotų ir gražintų reikšmę.

    public static int masyvoSum (int [] Arr) {
       return Arrays.stream(Arr).sum();
    }
// 8 uzduotis
//    Sukurkite Funkciją kuri priimtų 6tos užduoties masyvą ir gražintų jos skaičių vidurkį (double).
public static double masyvoVidurkis (int [] masyvas){
    return Arrays.stream(masyvas).sum() / masyvas.length;
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

public static void tekstas (String sakinys){

}









}

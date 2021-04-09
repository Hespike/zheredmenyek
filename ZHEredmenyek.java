public class ZhEredmenyek {

    public static void main(String[] args) {
        float osszeg = 0;
        float szamokSzama = 0;
        for (int i = 0; i < args.length;i++){
            osszeg +=  Float.parseFloat(args[i]);

           szamokSzama++;
        }
        System.out.println(osszeg/szamokSzama);
    }

}

/* also
public class ZhEredmenyek {

    public static void main(String[] args) {
        int osszeg = 0;
        for (int i = 0; i < args.length; i++) {
            osszeg += Integer.parseInt(args[i]);
        }
        System.out.println(osszeg / (args.length + 0.0));
    }

}
 */

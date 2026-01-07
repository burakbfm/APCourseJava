package Ders41_42;

public class MagpieRunner {
    public static void main(String[] var0) {
        Magpie magpieBot = new Magpie();

        System.out.println("Merhaba! Ben Magpie. Konuşmak istediğin bir şey var mı?");

        String userStatement = "kız arkadaşımla kavga ettim";
        
        System.out.println("Sen: " + userStatement);
        System.out.println("Magpie: " + magpieBot.getResponse(userStatement));


    }
}



package Ders40_41;

public class Magpie {
    public String getResponse(String statement) {
        String response = "";

        if (statement.indexOf("anne") >= 0 || statement.indexOf("annem") >= 0 ) {
            response = "Annen hakkında daha fazla anlatır mısın?";
        } else if (statement.indexOf("baba") >= 0 || statement.indexOf("babam") >= 0) {
            response = "Baban hakkında daha fazla anlatır mısın?";
        } else if (statement.indexOf("kardeş") >= 0) {
            response = "Kardeşinle aran nasıl?";
        } else if (statement.indexOf("nasılsın") >= 0) {
            response = "Ben bir yapay zekayım, duygularım yok ama seninle konuşmak güzel!";
        } else {
            int WhichResponse = (int)(Math.random() * 3);
    
            if (WhichResponse == 0) {
                response = "İlginç, daha fazla anlat.";
            } else if (WhichResponse == 1) {
                response = "Hmmm.";
            } else {
                response = "Peki, bu konu hakkında ne düşünüyorsun?";
            }
              
        }

        return response;
    }
    public String sinirliMagpie(String isim) {
        return isim + " DELLENDİM!!! BIRAKIN BENİ!!!";
    }
}

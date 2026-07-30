ArrayList<Integer> notlar = new ArrayList<Integer>();
// ... listeye elemanlar eklendiğini varsayalım ...

// YANLIŞ: Düz ileri döngü ile silme işlemi yapılırsa bazı elemanlar atlanır.
for (int i = 0; i < notlar.size(); i++) {
    if (notlar.get(i) < 50) {
        notlar.remove(i); 
    }
}

// DOĞRU: Tersten döngü kurmak indeks kaymasını engeller.
for (int i = notlar.size() - 1; i >= 0; i--) {
    if (notlar.get(i) < 50) {
        notlar.remove(i);
    }
}
# Sınıf Listesi

<h3> Sınıf Liste Özellikleri : </h3>
<ul>
    <li>Sınıf içerisindeki dizinin varsayılan boyutu 10 ve dizinin eleman sayısı ihtiyaç duydukça 2 katı şeklinde artmalı.</li>
    <li>
        Sınıfa ait iki tür constructor metot bulunmalı.
        <ul>
            <li>MyList() : Boş contructor kullanılırsa dizinin başlangıç boyutu 10 olmalıdır.</li>
            <li>MyList(int capacity) : Dizinin başlangıç değeri capacity parametresinden alınmalıdır.</li>
        </ul>
    </li>
    <li>size() : dizideki eleman sayısını verir.</li>
    <li>getCapacity() : dizinin kapasite değerini verir.</li>
    <li>add(T data) : sınıfa ait diziye eleman eklemek için kullanılmalıdır. Eğer dizide yeteri kadar yer yok ise, dizi boyutu 2 katına çıkartılmalıdır.</li>
    <li>get(int index): verilen indisteki değeri döndürür. Geçersiz indis girilerse null döndürür.</li>
    <li>remove(int index): verilen indisteki veriyi silmeli ve silinen indis sonrasında ki verileri sol doğru kaydırmalı. Geçersiz indis girilerse null döndürür.</li>
    <li>set(int index, T data) : verilen indisteki veriyi yenisi ile değiştirme işlemini yapmalıdır. Geçersiz indis girilerse null döndürür.</li>
    <li>String toString() : Sınıfa ait dizideki elemanları listeleyen bir metot.</li>
    <li>int indexOf(T data) : Parametrede verilen nesnenin listedeki indeksini verir. Nesne listede yoksa -1 değerini verir.</li>
    <li>int lastIndexOf(T data) : Belirtilen öğenin listedeki son indeksini söyler. Nesne listede yoksa -1 değerini verir.</li>
    <li>boolean isEmpty() : Listenin boş olup olmadığını söyler.</li>
    <li>T[] toArray() : Listedeki öğeleri, aynı sırayla bir array haline getirir.</li>
    <li>clear() : Listedeki bütün öğeleri siler, boş liste haline getirir.</li>
    <li>MyList<T> sublist(int start,int finish) : Parametrede verilen indeks aralığına ait bir liste döner.</li>
    <li>boolean contains(T data) : Parametrede verilen değerin dizide olup olmadığını söyler.</li>
</ul>
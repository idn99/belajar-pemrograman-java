public class helloWorld{

    public static void main(String[] args) {
        System.out.println("Hello World");
        
        mobil bmw = new mobil();
        bmw.merk = "BMW-5100";
        bmw.maju();

        mobil toyota = new mobil();
        toyota.merk = "Toyota Avanza";
        toyota.maju();

        Segitiga segitiga = new Segitiga();

        segitiga.hitung(10,5);
    }
}

class mobil{
    public String merk;

    public void maju(){
        System.out.println("Mobil "+this.merk+" maju");
    }
}

class Segitiga{

    public void hitung(int Alas, int Tinggi){
        int luas;
        luas = (Alas*Tinggi)/2;
        System.out.println("Hasilnya : "+luas);
    }
}
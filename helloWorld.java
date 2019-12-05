public class helloWorld{

    public static void main(String[] args) {
        System.out.println("Hello World");
        mobil bmw = new mobil();
        bmw.merk = "BMW-5100";
        bmw.maju();

        mobil toyota = new mobil();
        toyota.merk = "Toyota Avanza";
        toyota.maju();
    }
}

class mobil{
    public String merk;

    public void maju(){
        System.out.println("Mobil "+this.merk+" maju");
    }
}
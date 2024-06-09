import java.time.temporal.TemporalAccessor;

public class main {
    public main() {
    }

    public static void main(String[] args) {
        GoryachiyNapitokSTemperaturoi goryachiyNapitok1 = new GoryachiyNapitokSTemperaturoi("Tea",100,50);
        GoryachiyNapitokSTemperaturoi goryachiyNapitok2 = new GoryachiyNapitokSTemperaturoi("Coffee",150,70);
        GoryachiyNapitokSTemperaturoi goryachiyNapitok3 = new GoryachiyNapitokSTemperaturoi("Kakao",250,80);


        GoryachiyNapitokAvtomat goryachiyNapitokAvtomat = new GoryachiyNapitokAvtomat();
        GoryachiyNapitokSTemperaturoi product1 = goryachiyNapitokAvtomat.getProduct("Tea",100,50);
        GoryachiyNapitokSTemperaturoi product2 = goryachiyNapitokAvtomat.getProduct("Coffee",150,70);
        GoryachiyNapitokSTemperaturoi product3 = goryachiyNapitokAvtomat.getProduct("Kakao",250,80);

        

    }
}

public class GoryachiyNapitokAvtomat {
    @Override
    public String toString() {
        return "GoryachiyNapitokAvtomat{}";
    }
    public GoryachiyNapitokSTemperaturoi getProduct(String name,int massa, int temperatura){
        return new GoryachiyNapitokSTemperaturoi(name, massa, temperatura);
    }
}

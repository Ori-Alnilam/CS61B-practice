public class Dog {
    public int weight;
    public static String binomen = "Canis familiaris";

    public Dog(int w) {
        weight = w;
    }
    
    public void makeNoise() {
        if (weight < 10) {
            System.out.println("yip!");
        } else if (weight < 30) {
            System.out.println("bark.");
        } else {
            System.out.println("wooooof!");
        }
    }

    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.weight > d2.weight) {
            return d1;
        }
        return d2;
    }
}
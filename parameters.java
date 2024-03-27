public class parameters {
    int id;
    String name;
    
    public parameters(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Organic {
    public static void main(String[] args) {
        parameters p = new parameters(1, "Abhi");
        System.out.println(p.id + " " + p.name);
    }
}

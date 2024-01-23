import java.security.PrivateKey;

public class Main {
    public static void main(String[] args) {

    }
}

enum Season{
    SPRING("spring","warm"),SUMMER("summer","hot");

    private String name;
    private String descc;

    private Season(String name, String descc) {
        this.name = name;
        this.descc = descc;
    }

    public String getName() {
        return name;
    }

    public String getDescc() {
        return descc;
    }
}


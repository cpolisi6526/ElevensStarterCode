package Activity1;

/**
 * Created by Teacher on 1/7/2019.
 */
public class CardTester {
    static Card one= new Card("2","heart",2);
    static Card two= new Card("3", "diamonds",3);
    static Card three= new Card("2","heart",2);

    public static void main(String[] args){
        one.toString();
        one.matches(two);
        one.matches(three);
    }
}

import java.util.List;

public class Customer implements Observer{

    @Override
    public void handelEvent(List<String> games) {
        System.out.println("Dear customer your shopping cart has changed");
        System.out.println(games);
    }
}

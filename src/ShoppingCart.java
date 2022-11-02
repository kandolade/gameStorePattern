import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements Observed{
    List<String> games = new ArrayList<>();

    Observer customer;

    public void addGame(String game){
        this.games.add(game);
        notifyObservers();
    }

    public void removeGame(String game){
        this.games.remove(game);
        notifyObservers();
    }


    @Override
    public void notifyObservers() {
        customer.handelEvent(this.games);
    }
}

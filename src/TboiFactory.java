public class TboiFactory implements GameFactory{
    @Override
    public Game createGame() {
        return new Tboi();
    }
}

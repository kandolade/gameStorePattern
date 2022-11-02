public class DotaFactory implements GameFactory{
    @Override
    public Game createGame() {
        return new Dota();
    }
}

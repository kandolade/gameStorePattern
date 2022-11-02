public class CsgoFactory implements GameFactory{
    @Override
    public Game createGame() {
        return new Csgo();
    }

}

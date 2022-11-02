public class DotaDecorator implements Game{
    Game game;
    DotaDecorator(Game game){
        this.game = game;
    }
    @Override
    public String getDescription() {
        return game.getDescription();
    }
}

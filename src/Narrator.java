public class Narrator {
    Game game;
    public void setGame(Game game){
        this.game = game;
    }

    public String enlighten(){
        return game.getDescription();
    }
}

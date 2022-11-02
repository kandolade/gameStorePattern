public class DotaDlc extends DotaDecorator{
    String name = "DotaDlc";
    DotaDlc(Game game) {
        super(game);
    }

    public String getDlcDescription(){
        return "Dlc comes with many features, including hero progression, selective matchmaking,\n" +
                " statistical analysis, shards, relics, terrains, chat wheel lines/sounds, player tipping, and cosmetic item rewards.\n";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + getDlcDescription();
    }
}

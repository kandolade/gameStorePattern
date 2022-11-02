public class CsgoPrime extends DotaDecorator {
    String name = "CsgoPrime";
    CsgoPrime(Game game) {
        super(game);
    }

    public String getDlcDescription(){
        return "Prime is a feature reserved for players who bought CS:GO (before it became free-to-play) or are level 21 or above." +
                " Those with Prime are also lucky enough to receive exclusive benefits.";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + getDlcDescription();
    }
}

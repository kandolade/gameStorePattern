public class TboiRepentance extends DotaDecorator{
    String name = "TboiRepentance";
    TboiRepentance(Game game) {
        super(game);
    }

    public String getDlcDescription(){
        return "Repentance is a DLC expansion to The Binding of Isaac: Afterbirth † that was released on March 31st, 2021.";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + getDlcDescription();
    }
}

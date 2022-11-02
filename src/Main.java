import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello it's game store,what kind a game you want to know?");
        System.out.println("1.Dota\n" +
                "2.Csgo\n" +
                "3.Tboi\n" +
                "4.End");
        Narrator narrator = new Narrator();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            GameFactory gameFactory;
            int choice = scanner.nextInt();
            if(choice == 1){
                gameFactory = createGameByName("Dota");
            }
            else if(choice == 2){
                gameFactory = createGameByName("Csgo");
            }
            else if(choice == 3){
                gameFactory = createGameByName("Tboi");
            }
            else{
                break;
            }
            Game game = gameFactory.createGame();
            System.out.println("Do you want to know about DLC");
            Scanner newScanner= new Scanner(System.in);
            String dlcChoice = newScanner.nextLine();
            if(dlcChoice.equalsIgnoreCase("yes")) {
                if(game instanceof Dota) {
                    narrator.setGame(new DotaDlc(new Dota()));
                }
                else if(game instanceof Csgo){
                    narrator.setGame(new CsgoPrime(new Csgo()));
                }
                else if(game instanceof Tboi){
                    narrator.setGame(new TboiRepentance(new Tboi()));
                }
            }
            else{
                narrator.setGame(game);
            }
            System.out.println(narrator.enlighten());
        }
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.customer = new Customer();
        System.out.println("So what do you want to buy?");
        System.out.println("1.Dota\n" +
                "2.Csgo\n" +
                "3.Tboi\n" +
                "4.DotaDlc\n" +
                "5.CsgoPrime\n"+
                "6.TboiRepentance\n"+
                "7.End\n");
        while(true){
            int realChoice = scanner.nextInt();
            if(realChoice == 1){
                Dota dota = new Dota();
                shoppingCart.addGame(dota.name);
                History.getHistory().addHistory(dota.name);

            }
            else if(realChoice == 2){
                Csgo csgo = new Csgo();
                shoppingCart.addGame(csgo.name);
                History.getHistory().addHistory(csgo.name);
            }
            else if(realChoice == 3){
                Tboi tboi = new Tboi();
                shoppingCart.addGame(tboi.name);
                History.getHistory().addHistory("Tboi");

            }
            else if(realChoice==4) {
                DotaDlc dotaDlc = new DotaDlc(new Dota());
                shoppingCart.addGame(dotaDlc.name);
                History.getHistory().addHistory(dotaDlc.name);
            }
            else if(realChoice==5) {
                CsgoPrime csgoPrime = new CsgoPrime(new Csgo());
                shoppingCart.addGame(csgoPrime.name);
                History.getHistory().addHistory(csgoPrime.name);
            }
            else if(realChoice==6) {
                TboiRepentance tboiRepentance = new TboiRepentance(new Tboi());
                shoppingCart.addGame(tboiRepentance.name);
                History.getHistory().addHistory(tboiRepentance.name);
            }
            else {
                break;
            }
        }
        History.getHistory().showHistory();

    }
    static GameFactory createGameByName(String name){
        if(name.equalsIgnoreCase("Dota")) {
            return new DotaFactory();
        }
        else if(name.equalsIgnoreCase("Csgo")){
            return new CsgoFactory();
        }
        else if(name.equalsIgnoreCase("Tboi")){
            return new TboiFactory();
        }
        else {
            throw new RuntimeException(name + " is unknown.");
        }
    }
}
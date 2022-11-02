public class History {
    private static History history;
    private static String historyFile = "History: \n";
    public static synchronized History getHistory(){
        if(history==null)
        {
            history = new History();
        }

        return history;
    }

    private History(){

    }

    public void addHistory(String historyInfo){
        historyFile+= historyInfo + "\n";
    }

    public void showHistory(){
        System.out.println(historyFile);
    }
}

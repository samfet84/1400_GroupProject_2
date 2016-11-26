package groupproject;

public class Player {
    //fields

    int gamesWon;
    int gamesLost;
    int numDel;
    //int opponentSquarsDel;
    String Symbol;

    public Player(String Symbol) {
        this.Symbol = Symbol;
    }
    

    //methods
    public void setGamesWon(int won) {
        gamesWon = won;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesLost(int lost) {
        gamesLost = lost;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public void setincDel() {
        numDel++;
    }

    public int getincDel() {
        return numDel;
    }

    //public void setOpponentSquaresDeleted(int opponentDel){
    //opponentSquarsDel = opponentDel;
    //}
    //public int getOpponentSquaresDeleted(){
    //return opponentSquarsDel;
    //}
}

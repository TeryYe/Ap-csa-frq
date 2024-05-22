public class Scoreboard {
    private String t1;
    private String t2;
    private int s1;
    private int s2;
    private boolean turn;

    public Scoreboard(String t1, String t2) {
        this.t1= t1;
        this.t2 = t2;
        this.s1 = 0;
        this.s1 = 0;
        this.turn = true;
    }

    public void recordPlay(int point) {
        if (point != 0) {
            if (turn) {
                s1 += point;
            } else {
                s2 += point;
            }
        } else {
            turn = !turn;
        }
    }

    public String getScore() {
        String active = turn ? t1 : t2;
        return s1 + "-" + s2 + "-" + active;
    }
}

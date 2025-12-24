public class HardScoring implements ScoringStrategy {
    public int onCorrect() { return 20; }
    public int onIncorrect() { return -15; }
    public int onIncorrectLives() { return -1; }
    
}

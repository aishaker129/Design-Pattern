public class MediumScoring implements ScoringStrategy {
    public int onCorrect() { return 15; }
    public int onIncorrect() { return -10; }
    public int onIncorrectLives() { return -1; }
    
}

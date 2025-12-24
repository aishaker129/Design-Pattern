public class EasyScoring implements ScoringStrategy {
    public int onCorrect() { return 10; }
    public int onIncorrect() { return -5; }
    public int onIncorrectLives() { return -1; }
}

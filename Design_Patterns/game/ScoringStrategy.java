public interface ScoringStrategy {
     int onCorrect();
    int onIncorrect();
    int onIncorrectLives();
}

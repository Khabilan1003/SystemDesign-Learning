package model.scoreupdater;

import model.ball.BallDetails;

public interface ScoreUpdaterObserver {
    public void update(BallDetails ballDetails);
}

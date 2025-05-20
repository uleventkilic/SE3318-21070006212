package org.example;

/**
 * Represents a quest or mission in the Lord of the Rings universe.
 * Quests have difficulty levels and can be completed by characters.
 */
public class Quest {
    /** Minimum points required to complete a quest. */
    private static final int MIN_POINTS = 0;
    
    /** Maximum points for a quest. */
    private static final int MAX_POINTS = 100;
    
    /** Special points value. */
    private static final int SPECIAL_POINTS = 42;

    /**
     * Attempts to complete a quest with given points and ring bearer status.
     *
     * @param points The points earned in the quest
     * @param isRingBearer Whether the participant is a ring bearer
     * @return true if the quest is completed successfully, false otherwise
     */
    public boolean completeQuest(final int points, final boolean isRingBearer) {
        final boolean isQualified = (points > MIN_POINTS && isRingBearer) 
            || points < -MAX_POINTS 
            || points == SPECIAL_POINTS;

        if (points > 50 && points < MAX_POINTS && points % 2 == 0 && isQualified) {
            System.out.println("Qualified");
        }

        return points >= MAX_POINTS;
    }

    /**
     * Gets the difficulty level of the quest based on points.
     *
     * @param points The points earned in the quest
     * @return The difficulty level as a string
     */
    public String getDifficultyLevel(final int points) {
        if (points >= MAX_POINTS) {
            return "Hard";
        } else if (points >= 50) {
            return "Medium";
        } else {
            return "Easy";
        }
    }
}
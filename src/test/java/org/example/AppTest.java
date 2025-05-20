package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit tests for the Lord of the Rings application.
 */
public class AppTest extends TestCase {
    /** Test character instance. */
    private Character frodo;
    
    /** Test map instance. */
    private MiddleEarthMap map;
    
    /** Test quest instance. */
    private Quest quest;

    /**
     * Sets up the test environment before each test.
     */
    @Override
    protected void setUp() {
        frodo = new Character("Frodo", "Hobbit", 50);
        map = new MiddleEarthMap();
        quest = new Quest();
    }

    /**
     * Tests character creation and basic attributes.
     */
    public void testCharacterBasicAttributes() {
        assertEquals("Frodo", frodo.getName());
        assertEquals("Hobbit", frodo.getRace());
        assertEquals(50, frodo.getAge());
    }

    /**
     * Tests character race-specific behavior.
     */
    public void testCharacterRaceBehavior() {
        Character gandalf = new Character("Gandalf", "Wizard", 2000);
        Character legolas = new Character("Legolas", "Elf", 1000);
        
        // Test Hobbit
        assertTrue(frodo.getRace().equals("Hobbit"));
        
        // Test Wizard
        assertTrue(gandalf.getRace().equals("Wizard"));
        
        // Test Elf
        assertTrue(legolas.getRace().equals("Elf"));
    }

    /**
     * Tests character age-related behavior.
     */
    public void testCharacterAgeBehavior() {
        Character youngHobbit = new Character("Pippin", "Hobbit", 20);
        Character oldHobbit = new Character("Bilbo", "Hobbit", 111);
        
        // Test young character
        assertTrue(youngHobbit.getAge() < 50);
        
        // Test old character
        assertTrue(oldHobbit.getAge() > 50);
    }

    /**
     * Tests map navigation functionality.
     */
    public void testMapNavigation() {
        assertTrue(map.isLocationAccessible("Mordor"));
        assertTrue(map.isLocationAccessible("Shire"));
        assertFalse(map.isLocationAccessible(""));
        assertFalse(map.isLocationAccessible(null));
    }

    /**
     * Tests quest completion logic.
     */
    public void testQuestCompletion() {
        assertTrue(quest.completeQuest(100, true));
        assertFalse(quest.completeQuest(50, false));
        assertEquals("Hard", quest.getDifficultyLevel(100));
        assertEquals("Medium", quest.getDifficultyLevel(75));
        assertEquals("Easy", quest.getDifficultyLevel(25));
    }

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}

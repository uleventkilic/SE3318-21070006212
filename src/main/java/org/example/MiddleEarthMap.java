package org.example;

/**
 * Represents the geographical world of Middle-Earth.
 * Provides navigation functionality between different locations.
 */
public class MiddleEarthMap {
    /**
     * Navigates to a specified location in Middle-Earth.
     *
     * @param location The destination location
     * @param isSecretPassage Whether to use a secret passage
     */
    public void navigate(final String location, final boolean isSecretPassage) {
        switch (location) {
            case "Mordor":
                System.out.println("Navigating to Mordor");
                if (isSecretPassage) {
                    System.out.println("Taking a secret passage");
                }
                break;
            case "Shire":
                System.out.println("Navigating to the Shire");
                break;
            case "Gondor":
                System.out.println("Navigating to Gondor");
                break;
            case "Lothlórien":
                System.out.println("Navigating to Lothlórien");
                break;
            default:
                System.out.println("Unknown location");
                break;
        }

        final String result = isSecretPassage ? "Secret" : "Normal";
        System.out.println(result);
    }

    /**
     * Checks if a location is accessible.
     *
     * @param location The location to check
     * @return true if the location is accessible, false otherwise
     */
    public boolean isLocationAccessible(final String location) {
        return location != null && !location.isEmpty();
    }
}

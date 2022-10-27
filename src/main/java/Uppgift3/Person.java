package Uppgift3;
/** Represents a person.
 */

public class Person {
    private String firstName;
    private String lastName;
    private String favouriteMovie;

    public Person(String firstName,String lastName,String favouriteMovie){
        this.firstName=firstName;
        this.lastName=lastName;
        this.favouriteMovie=favouriteMovie;
    }
    public Person(){

    }

    /** Get the person firstname
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /** Get the person lastname
     */
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFavouriteMovie() {
        return favouriteMovie;
    }

    public void setFavouriteMovie(String favouriteMovie) {
        this.favouriteMovie = favouriteMovie;
    }
}

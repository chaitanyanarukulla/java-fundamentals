package inheritance;
import org.junit.Before;
import org.junit.Test;
import java.util.HashSet;
import static org.junit.Assert.*;


public class TheaterTest {
    Theater test_TheaterWithNoMovies;
    Theater test_TheaterWithOneMovie;
    Theater test_TheaterWithManyMovies;
    HashSet<String> movies = new HashSet<>();

    @Before
    public void setup() {
        test_TheaterWithNoMovies = new Theater("A.M.C");
        test_TheaterWithOneMovie = new Theater("Ciniplex", "Sleepless in Seattle");
        movies.add("Sleepless in Seattle");movies.add("Avengers");movies.add("Black Panther");
        test_TheaterWithManyMovies = new Theater("A.M.C.16", movies);
    }

    @Test
    public void test_NewTheatreNoMovies() {
        assertEquals("Theatre Name Should be A.M.C", "A.M.C", test_TheaterWithNoMovies.getName());
    }

    @Test
    public void test_NewTheatreOneMovie() {
        assertEquals("Theatre Name Should be Ciniplex", "Ciniplex", test_TheaterWithOneMovie.getName());
        assertTrue("Movie Name Should be in theatre movies", test_TheaterWithOneMovie.getMovies().contains("Sleepless in Seattle"));
    }

    @Test
    public void test_NewTheatreManyMovies() {
        assertEquals("Theatre Name Should be A.M.C.16", "A.M.C.16", test_TheaterWithManyMovies.getName());
        assertEquals("Movies Should be in theatre movies", movies, test_TheaterWithManyMovies.getMovies());
    }

    @Test
    public void test_AddMovie() {
        String newMovie = "God must be Crazy";
        test_TheaterWithManyMovies.addMovie(newMovie);
        assertTrue("God must be Crazy Should be in theatre movies", test_TheaterWithManyMovies.getMovies().contains(newMovie));
    }

    @Test
    public void test_RemoveMovieInMovies() {
        String newMovie = "Transfomers";
        test_TheaterWithManyMovies.removeMovie(newMovie);
        assertFalse("God must be Crazy Not be in theatre movies", test_TheaterWithManyMovies.getMovies().contains(newMovie));
    }
    @Test
    public void test_RemoveMovieNotInMovies() {
        String newMovie = "God must be Crazy";
        test_TheaterWithManyMovies.removeMovie(newMovie);
        assertFalse("God must be Crazy Should Not be in theatre movies", test_TheaterWithManyMovies.getMovies().contains(newMovie));
    }

    @Test
    public void test_ToString() {
        String expectedOutput = "Theater Name: A.M.C";
        assertEquals("To string should return expected output", expectedOutput, test_TheaterWithNoMovies.toString());
    }

    @Test
    public void test_AddReview() {
        Review theaterReview = new Review("This is a good review", 5, "Me");
        test_TheaterWithOneMovie.addReview(theaterReview);
        assertTrue("Should contain review", test_TheaterWithOneMovie.getReviews().contains(theaterReview));
    }

}
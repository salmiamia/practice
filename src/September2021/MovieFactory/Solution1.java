package September2021.MovieFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution1 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        while (string.equals("soapOpera") || string.equals("cartoon") || string.equals("thriller")) {
            Movie movie = MovieFactory.getMovie(string);
            System.out.println(movie.getClass().getSimpleName());
            string = reader.readLine();
        }
        Movie movie = MovieFactory.getMovie(string);

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }

            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }

            if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie{
    }
}

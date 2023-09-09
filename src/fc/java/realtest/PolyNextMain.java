package fc.java.realtest;

public class PolyNextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A","Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A","Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C","Airplane11");
        Comedy comedyMovie =(Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C","Airplane22");
        airplane.watchMovie();

        var plane = new Comedy("Airplane33");
        plane.watchComedy();

        Object unknowObject = Movie.getMovie("A", "Jaws");
        if(unknowObject.getClass().getName()=="Comedy"){
            Comedy c =((Comedy) unknowObject);
            c.watchComedy();
        } else if (unknowObject instanceof Adventure) {
            ((Adventure) unknowObject).watchAdventure();
        }else if(unknowObject instanceof ScienceFiction syfy){
            syfy.watchScienceFiction();
        }
    }
}

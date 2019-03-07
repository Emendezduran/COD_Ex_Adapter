package adaptadores;
//@author emendezduran
public class Video implements MediaDivX {

    @Override
    public void playFilm(String filename) {
        System.out.println("Playing Video File " + filename);
    }

}

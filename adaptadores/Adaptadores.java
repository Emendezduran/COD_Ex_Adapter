package adaptadores;
// @author emendezduran

public class Adaptadores {

    public static void main(String[] args) {

        MediaPlayer player = new MP3();
        player.play("file.mp3");
        player = new FormatAdapter(new MP4());
        player.play("file.mp4");
        player = new FormatAdapter(new VLC());
        player.play("file.avi");
        player = new FormatAdapterVideo(new Video());
        player.play("file.Video");
    }

    private static class FormatAdapter implements MediaPlayer {

        private MediaPackage media;

        public FormatAdapter(MediaPackage m) {
            media = m;
        }
       
        @Override
        public void play(String filename) {
            System.out.print("Using Adapter --> ");
            media.playFile(filename);
        }     
        
    }
    
     private static class FormatAdapterVideo implements MediaPlayer {

        private MediaDivX video;
        
        public FormatAdapterVideo(MediaDivX vid) {
            video = vid;
        }
       
        @Override
        public void play(String filename) {
            System.out.print("Using Adapter --> ");
            video.playFilm(filename);
        }     
        
    }
}

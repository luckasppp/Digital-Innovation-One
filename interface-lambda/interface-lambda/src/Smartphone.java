// Com a keyword implements, a classe Smartphone implementa as interfaces VideoPlayer e MusicPlayer
public class Smartphone implements VideoPlayer, MusicPlayer {

    @Override
    public void pauseVideo() {
        System.out.println("Vídeo pausado no smartphone");
        
    }

    @Override
    public void playVideo() {
        System.out.println("Vídeo sendo reproduzido no smartphone");
        
    }

    @Override
    public void stopVideo() {
        System.out.println("Vídeo parado no smartphone");
        
    }

    @Override
    public void pauseMusic() {
        System.out.println("Música pausada no smartphone");
        
    }

    @Override
    public void playMusic() {
        System.out.println("Música sendo reproduzida no smartphone");
        
    }

    @Override
    public void stopMusic() {
        System.out.println("Música parada no smartphone");
        
    }

}

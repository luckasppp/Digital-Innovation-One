public class Computer implements VideoPlayer, MusicPlayer {
    @Override
    public void pauseVideo() {
        System.out.println("Vídeo pausado no computador");
        
    }

    @Override
    public void playVideo() {
        System.out.println("Vídeo sendo reproduzido no computador");
        
    }

    @Override
    public void stopVideo() {
        System.out.println("Vídeo parado no computador");
        
    }

    @Override
    public void pauseMusic() {
        System.out.println("Música pausada no computador");
        
    }

    @Override
    public void playMusic() {
        System.out.println("Música sendo reproduzida no computador");
        
    }

    @Override
    public void stopMusic() {
        System.out.println("Música parada no computador");
        
    }

}

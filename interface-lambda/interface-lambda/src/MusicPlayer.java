public interface MusicPlayer {
    // Todas as propriedades em interfaces são públicas, estáticas e finais
    // EX.: [public static final] String MUSIC = "Parabéns pra você";
    // Interface só permite métodos abstratos
    void playMusic();
    void pauseMusic();
    void stopMusic();
}

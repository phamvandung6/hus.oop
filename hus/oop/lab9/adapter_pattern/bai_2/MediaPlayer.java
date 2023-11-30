package hus.oop.lab9.adapter_pattern.bai_2;

// Interface for MP3 player
public interface MediaPlayer {
    void play(String audioType, String fileName);
}

// Lớp cũ không tương thích với giao diện MediaPlayer
class LegacyAudioPlayer {
    void playMp3(String fileName) {
        System.out.println("Playing MP3 file: " + fileName);
    }
}

// Lớp Adapter để chuyển đổi từ LegacyAudioPlayer sang MediaPlayer
class AudioPlayerAdapter implements MediaPlayer {
    private LegacyAudioPlayer legacyAudioPlayer;

    AudioPlayerAdapter(LegacyAudioPlayer legacyAudioPlayer) {
        this.legacyAudioPlayer = legacyAudioPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            legacyAudioPlayer.playMp3(fileName);
        } else {
            System.out.println("Invalid audio type: " + audioType);
        }
    }
}

// Lớp Client sử dụng giao diện MediaPlayer
class Client {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new AudioPlayerAdapter(new LegacyAudioPlayer());
        mediaPlayer.play("mp3", "song.mp3");
    }
}
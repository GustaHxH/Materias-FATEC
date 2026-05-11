package br.sp.gov.cps.a06_videobutton;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private VideoView videoView;
    private SeekBar videoSeekBar;
    private TextView textTempo;

    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoView);
        videoSeekBar = findViewById(R.id.videoSeekBar);
        textTempo = findViewById(R.id.textTempo);

        carregarVideo(R.raw.videob);

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {

                videoSeekBar.setMax(videoView.getDuration());

                handler.post(atualizaSeekBar);

                videoView.pause();
            }
        });

        videoSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                if (fromUser) {
                    videoView.seekTo(progress);
                }

                atualizaTextTempo();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private void carregarVideo(int video) {

        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + video);

        videoView.setVideoURI(videoUri);
    }

    private Runnable atualizaSeekBar = new Runnable() {

        @Override
        public void run() {

            if (videoView.isPlaying()) {

                videoSeekBar.setProgress(videoView.getCurrentPosition());

                atualizaTextTempo();
            }

            handler.postDelayed(this, 1000);
        }
    };

    private void atualizaTextTempo() {

        int tempoAtual = videoView.getCurrentPosition();
        int tempoTotal = videoView.getDuration();

        String tempoFormatado = formataTempo(tempoAtual) + " / " +
                formataTempo(tempoTotal);

        textTempo.setText(tempoFormatado);
    }

    private String formataTempo(int tempo) {

        int min = (tempo / 1000) / 60;
        int sec = (tempo / 1000) % 60;

        return String.format("%02d:%02d", min, sec);
    }

    public void startVideo(View view) {
        videoView.start();
    }

    public void pauseVideo(View view) {
        videoView.pause();
    }

    public void video1(View view) {
        carregarVideo(R.raw.videoa);
    }

    public void video2(View view) {
        carregarVideo(R.raw.videob);
    }

    public void video3(View view) {
        carregarVideo(R.raw.videoc);
    }
}
// package C21468162;

// import ie.tudublin.*;
// import C21725659.*;

// public class MusicVisualizer extends Visual {
//     WarpedSpace ws;
//     CelebrationStation cs;
//     RippleEcho re;

//     int visual = 0;
//     float[] lerpedBuffer;
//     float lerpedAverage = 0;
//     float average;
//     float sum;

//     public void settings()
//     {
//         size(800, 600, P3D);
//     }

//     public void setup()
//     {
//         startMinim();

//         loadAudio("InitialD-KillingMyLove.mp3");

//         ws = new WarpedSpace(this);
//         cs = new CelebrationStation(this);
//         // re = new RippleEcho(this);

//         colorMode(HSB);
//     }

//     public void keyPressed()
//     {
//         if (keyCode == ' ')
//         {
//             if (getAudioPlayer().isPlaying()) {
//                 getAudioPlayer().pause();
//             }
//             else {
//                 getAudioPlayer().play();
//             }
//         }

//         if(keyCode == LEFT) {
//             // Rewind song
//             getAudioPlayer().cue(0);
//         }

//         if (keyCode >= '0' && keyCode <= '5') {
//             visual = keyCode - '0';
//         }
//     }

//     public void draw()
//     {
//         background(0);
//         try
//         {
//             // Call this if you want to use FFT data
//             calculateFFT(); 
//         }
//         catch(VisualException e)
//         {
//             e.printStackTrace();
//         }
//         // Call this is you want to use frequency bands
//         calculateFrequencyBands(); 

//         // Call this is you want to get the average amplitude
//         calculateAverageAmplitude();   
        
//         average = 0;
//         sum = 0;

//         // Calculate the average of the buffer
//         for (int i = 0; i < getAudioBuffer().size(); i ++)
//         {
//             sum += abs(getAudioBuffer().get(i));
//         }
//         average = sum / getAudioBuffer().size();
//         // Move lerpedAverage 10% closer to average every frame
//         lerpedAverage = lerp(lerpedAverage, average, 0.1f);

//         switch (visual) 
//         {
//             case 0:
//             { 
//                 ws.setup();
//                 break;
//             }
//             case 1:
//             {
//                 cs.setup();
//                 break;
//             }
//             case 2:
//             {
//                 re.setup();
//                 break;
//             }
//         }
// }
// }



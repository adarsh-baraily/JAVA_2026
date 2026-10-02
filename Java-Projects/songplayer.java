import java.util.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.io.*;
public class songplayer {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);
        String filePath = "C:/Users/user/Documents/JAVA (2026-2030)/06 - Oasis - Wonderwall.wav";

        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("Could not locate the file !");
            return;
        }

        try (AudioInputStream audiostream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audiostream);

            String response = "";

            while(!response.equals("Q")) {
                
                
                System.out.println("P : Play");
                System.out.println("S : Stop");
                System.out.println("R : Reset");
                System.out.println("Q : Quit");

                System.out.print("Enter your choice :");
                response = sc.next().toUpperCase();

                switch (response) {

                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();

                }
            }
        }
        catch(IOException e) {
            System.out.println("Sorry, Something went wrong !");
        }
        catch(UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported !");
        }        
        catch(LineUnavailableException e) {
            System.out.println("Unable to access the audio file !");
        }
        finally {
            System.out.println("Thank you !");
        }
        

        sc.close();
        

            



            

        
    }
    
}

package cn;

import java.io.*;
import java.net.Socket;
import javax.sound.sampled.*;

public class VoWiFiClient {
    public static void main(String[] args) throws IOException, LineUnavailableException {
        Socket socket = new Socket("192.168.12.102", 5555);

        AudioFormat audioFormat = new AudioFormat(8000.0f, 16, 1, true, false);
        SourceDataLine sourceDataLine = AudioSystem.getSourceDataLine(audioFormat);
        
        sourceDataLine.open();
        sourceDataLine.start();

        DataInputStream dis = new DataInputStream(socket.getInputStream());

        byte[] buffer = new byte[1024];
        int bytesRead;

        while ((bytesRead = dis.read(buffer, 0, buffer.length)) != -1) {
            sourceDataLine.write(buffer, 0, bytesRead);
        }

        sourceDataLine.drain();
        sourceDataLine.close();
        dis.close();
        socket.close();
    }
}


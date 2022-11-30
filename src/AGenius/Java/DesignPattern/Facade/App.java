package AGenius.Java.DesignPattern.Facade;

import AGenius.Java.DesignPattern.Facade.facade.VideoConversionFacade;

import java.io.File;

public class App {

    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}

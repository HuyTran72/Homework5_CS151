package com.picasa.imageviewer;

public class PngViewer implements ImageViewer {
    
    public void viewImage(String image) {
        System.out.println("Viewing PNG image: " + image);
    }
}
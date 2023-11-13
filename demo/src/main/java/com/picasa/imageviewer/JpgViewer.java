package com.picasa.imageviewer;

public class JpgViewer implements ImageViewer {
    
    public void viewImage(String image) {
        System.out.println("Viewing JPG image: " + image);
    }
}
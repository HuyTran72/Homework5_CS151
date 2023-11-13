package com.picasa;

import com.picasa.imageviewer.ImageApplication;
import com.picasa.imageviewer.JpgViewer;
import com.picasa.imageviewer.PngViewer;

public class Main {
    public static void main(String[] args) {
        ImageApplication app = new ImageApplication(new JpgViewer());
        app.viewImage("example.jpg");

        app.setImageViewer(new PngViewer());
        app.viewImage("example.png");
    }
}
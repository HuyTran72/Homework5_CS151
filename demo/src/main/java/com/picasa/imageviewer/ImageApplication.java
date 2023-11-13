package com.picasa.imageviewer;

public class ImageApplication {
    private ImageViewer imageViewer;

    public ImageApplication(ImageViewer imageViewer) {
        this.imageViewer = imageViewer;
    }

    public void setImageViewer(ImageViewer imageViewer) {
        this.imageViewer = imageViewer;
    }

    public void viewImage(String image) {
        imageViewer.viewImage(image);
    }
}

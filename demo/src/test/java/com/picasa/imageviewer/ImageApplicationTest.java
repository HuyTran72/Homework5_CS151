package com.picasa.imageviewer;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class ImageApplicationTest {

    @Test
    public void testImageApplicationWithJpgViewer() {
        ImageApplication app = new ImageApplication(new JpgViewer());
        assertNotNull(app);
        // Add more assertions or test cases as needed
    }

    @Test
    public void testImageApplicationWithPngViewer() {
        ImageApplication app = new ImageApplication(new PngViewer());
        assertNotNull(app);
        // Add more assertions or test cases as needed
    }

    // Add more tests for different scenarios...
}
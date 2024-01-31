package sk.com.ymca.learning.chapter_2.ex_01;
import java.awt.*;
import javax.swing.*;

public class ImageViewer {
    public static void main(String[] args) {

        EventQueue.invokeLater( () -> {
            var frame = new ImageViewerFrame();
            frame.setTitle("ImageViewer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        } );
    }
}

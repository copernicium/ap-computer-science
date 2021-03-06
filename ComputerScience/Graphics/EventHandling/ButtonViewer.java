package ComputerScience.Graphics.EventHandling;

import java.awt.*;
import javax.swing.*;

/**
 * This program demonstrates how to install an action listener.
 *
 * @Author Logan Traffas
 * @Date 5/11/2017.
 * @Version 1.0.0
 * @Assignment GR10.7--Event Handling
 */
public class ButtonViewer {
    private static final int FRAME_WIDTH = 500;//px
    private static final int FRAME_HEIGHT = 300;//px

    private static final boolean FULLSCREEN = false;
    private static final boolean HANDLE_TASKBAR = true;

    public static void main(String[] args){
        JFrame frame = new JFrame();
        Dimension size = FULLSCREEN  ? Util.Graphics.generateFullscreenDimension(HANDLE_TASKBAR) : new Dimension(FRAME_WIDTH, FRAME_HEIGHT);
        frame = Util.Graphics.createJFrameOfSize(frame, size);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JButton button = new JButton("Add juice");
        final Dimension BUTTON_SIZE = new Dimension(100,100);
        button.setPreferredSize(BUTTON_SIZE);
        button.addActionListener(new ClickListener());

        JPanel buttonPane = new JPanel();
        buttonPane.add(button);

        frame.add(buttonPane);
    }
}


package instrument;

import java.awt.*;
import javax.swing.*;
import javax.sound.sampled;

public class keys {
    private JButton key_btn;
    private Boolean isBlack;
    private int octave;
    private String note;
    
    // Constructor
    public keys(String note, Boolean isBlack, int octave) {
        this.note = note;
        this.isBlack = isBlack;
        this.octave = octave;
        
        key_btn = new JButton(note);
        key_color();
        play();
        key_listen();
    }
    
    // Getters
    public String getNote() {
        return note;
    }

    public Boolean getIsBlack() {
        return isBlack;
    }

    public int getOctave() {
        return octave;
    }
    
    private void key_color() {
        if (isBlack == false) {
            key_btn.setBackground(Color.white);
            key_btn.setForeground(Color.black);
        } else {
            key_btn.setBackground(Color.black);
            key_btn.setForeground(Color.white);
        }
    }
    
    private void play () {
        
    }
    
    private void key_listen () {
        key_btn.addActionListener(e -> {
        });
    }
}

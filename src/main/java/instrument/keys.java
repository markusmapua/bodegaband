package instrument;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

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
        key_sound();
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
    
    private void key_sound () {
        
    }
    
    private void key_listen () {
        key_btn.addActionListener(e -> {
        });
    }
}

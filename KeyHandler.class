package MAIN;

import java.awt.Color;
import java.awt.Graphics2D;

public class DialogueManager {
    UI gp;
    public String dialogueText = "";
    public boolean dialogueActive = false;
    public int dialogueTimer = 0;
    public final int DIALOGUE_DURATION = 180; 
    
    public DialogueManager(UI gp) {
        this.gp = gp;
    }
    
    public void showDialogue(String text) {
        this.dialogueText = text;
        this.dialogueActive = true;
        this.dialogueTimer = DIALOGUE_DURATION;
    }
    
    public void update() {
        if(dialogueActive) {
            dialogueTimer--;
            if(dialogueTimer <= 0) {
                dialogueActive = false;
                dialogueText = "";
            }
        }
    }
    
    public void draw(Graphics2D g2) {
        if(dialogueActive) {
            
            int boxWidth = 500;
            int boxHeight = 120;
            int boxX = (gp.screenWidth - boxWidth) / 2;
            int boxY = gp.screenHeight - 160;
            
            
            g2.setColor(new Color(0, 0, 0, 220));
            g2.fillRoundRect(boxX, boxY, boxWidth, boxHeight, 20, 20);
            
            
            g2.setColor(new Color(255, 160, 130)); 
            g2.setStroke(new java.awt.BasicStroke(3));
            g2.drawRoundRect(boxX, boxY, boxWidth, boxHeight, 20, 20);
            
            
            g2.setColor(Color.white);
            g2.setFont(g2.getFont().deriveFont(java.awt.Font.BOLD, 24f));
            g2.drawString(dialogueText, boxX + 25, boxY + 60);
        }
    }
}

package MAIN;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

public class MouseHandler implements MouseListener {
    UI gp;
    
    public MouseHandler(UI gp) {
        this.gp = gp;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getButton() == MouseEvent.BUTTON3) { 
            checkNPCInteraction();
        }
    }
    
    private void checkNPCInteraction() {
        
        int playerLeftWorldX = gp.player.worldX + gp.player.solidArea.x;
        int playerRightWorldX = gp.player.worldX + gp.player.solidArea.x + gp.player.solidArea.width;
        int playerTopWorldY = gp.player.worldY + gp.player.solidArea.y;
        int playerBottomWorldY = gp.player.worldY + gp.player.solidArea.y + gp.player.solidArea.height;
        
        for(int i = 0; i < gp.NPC.length; i++) {
            if(gp.NPC[i] != null) {
                int npcLeftWorldX = gp.NPC[i].worldX + gp.NPC[i].solidArea.x;
                int npcRightWorldX = gp.NPC[i].worldX + gp.NPC[i].solidArea.x + gp.NPC[i].solidArea.width;
                int npcTopWorldY = gp.NPC[i].worldY + gp.NPC[i].solidArea.y;
                int npcBottomWorldY = gp.NPC[i].worldY + gp.NPC[i].solidArea.y + gp.NPC[i].solidArea.height;
                
                
                if(playerLeftWorldX < npcRightWorldX &&
                   playerRightWorldX > npcLeftWorldX &&
                   playerTopWorldY < npcBottomWorldY &&
                   playerBottomWorldY > npcTopWorldY) {
                    JOptionPane.showMessageDialog(gp, "hi");
                    return;
                }
            }
        }
    }
    
    @Override
    public void mousePressed(MouseEvent e) {}
    
    @Override
    public void mouseReleased(MouseEvent e) {}
    
    @Override
    public void mouseEntered(MouseEvent e) {}
    
    @Override
    public void mouseExited(MouseEvent e) {}
}

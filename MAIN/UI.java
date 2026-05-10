package MAIN;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

import ENTITY.Player;
import ENTITY.entity;
import tile.TileManager;

public class UI extends JPanel implements Runnable {
    // Game State
    public int gameState;
    public final int titleState = 0;
    public final int playState = 1;
    
    // Screen and World Settings
    final int originalTileSize = 20;
    final int scale = 3;
    
    public final int tileSize = originalTileSize * scale;
    public final int maxScreenCol = 16;
    public final int maxScreenRow = 12;
    public final int screenWidth = tileSize * maxScreenCol;
    public final int screenHeight = tileSize * maxScreenRow;
    
    public final int maxWorldCol = 11;
    public final int maxWorldRow = 10;
    public final int worldWidth = tileSize * maxWorldCol;
    public final int worldHeight = tileSize * maxWorldRow;
    
    // Game Components
    int FPS = 60;
    TileManager tileM;
    KeyHandler keyH;
    DialogueManager dialogueM;
    Thread gameThread;
    public CollisionChecker cChecker;
    public Player player;
    public entity NPC[] = new entity[1];
    AssetSetter aSetter;
    JFrame window;
    BufferedImage titleScreenImage;
    BufferedImage startButtonImage;
    Rectangle startButtonRect;
    boolean startButtonHover = false;
    
    public UI() {
        keyH = new KeyHandler();
        dialogueM = new DialogueManager(this);
        cChecker = new CollisionChecker(this);
        player = new Player(this, keyH);
        aSetter = new AssetSetter(this);
        tileM = new TileManager(this);
        
        loadTitleScreenImage();
        loadStartButtonImage();
        
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
        
        startButtonRect = new Rectangle(screenWidth / 2 - 100, 600 / 2, 200, 60);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (gameState == titleState && startButtonRect.contains(e.getPoint())) {
                    gameState = playState;
                }
            }
        });
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                boolean hover = startButtonRect.contains(e.getPoint());
                if (hover != startButtonHover) {
                    startButtonHover = hover;
                    repaint();
                }
            }
        });
    }
    
    public void loadTitleScreenImage() {
        try {
            titleScreenImage = ImageIO.read(getClass().getResourceAsStream("/res/titlescreen.png"));
        } catch(IOException e) {
            System.out.println("Title screen image not found");
            e.printStackTrace();
        }
    }
    
    public void loadStartButtonImage() {
        try {
            startButtonImage = ImageIO.read(getClass().getResourceAsStream("/res/Start.png"));
        } catch(IOException e) {
            System.out.println("Start button image not found");
            e.printStackTrace();
        }
    }
    
    public void setupGUI() {
        window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("GAME");
        window.add(this);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        
        this.requestFocusInWindow();
        startGameThread();
    }
    
    public void setupGame() {
        aSetter.setObject();
        aSetter.setNPC();
        gameState = titleState;
    }
    
    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }
    
    @Override
    public void run() {
        setupGame();
        
        double drawInterval = 1000000000/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        
        while(gameThread != null) {
            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;
            
            if(delta > 1) {
                update();
                repaint();
                delta--;
            }
        }
    }
    
    public void update() {
        if (gameState == titleState) {
            dialogueM.update();
            return;
        }
        
        player.update();
        for(int i = 0; i < NPC.length; i++) {
            if(NPC[i] != null) {
                NPC[i].update();
            }
        }
        
        dialogueM.update();
        
        if(keyH.interactPressed) {
            checkNPCInteraction();
            keyH.interactPressed = false;
        }
    }
    
    public void checkNPCInteraction() {
        dialogueM.showDialogue("HALO GESSS");
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        
        if(gameState == titleState) {
            drawTitleScreen(g2);
        }
        else {
            
            tileM.draw(g2);
            
            
            for(int i = 0; i < NPC.length; i++){
                if(NPC[i] != null) {
                    NPC[i].draw(g2);
                }
            }
            
           
            player.draw(g2);
            
            
            dialogueM.draw(g2);
        }
        
        g2.dispose();
    }
    
    public void drawTitleScreen(Graphics2D g2) {
        if(titleScreenImage != null) {
            g2.drawImage(titleScreenImage, 0, 0, screenWidth, screenHeight, null);
        } else {
            g2.setColor(new java.awt.Color(30, 10, 60));
            g2.fillRect(0, 0, screenWidth, screenHeight);
        }
        
        if (startButtonRect != null) {
            if (startButtonImage != null) {
                g2.drawImage(startButtonImage, 200, 190, 600, 300, null);
            } else {
            }
        }
    }
}

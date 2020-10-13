/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.level;

import com.LOGamez.graphics.Texture;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author Nicholas Wright
 */
public class Display {
    
    /**Attributes*/ 
    
    /**panel variable of Display*/ 
    public JPanel panel;
    
    /**x variable of Display*/ 
    private final int x;
    
    /**y variable of Display*/ 
    private final int y;
    
    /**displayWidth variable of Display*/ 
    private final int displayWidth;
    
    /**displayHeight variable of Display*/ 
    private final int displayHeight;
    
    private final JPanel leftPanel;
    
    private final JPanel rightPanel;
    
    private final JLabel leftTopLabel;
    
    private final JLabel rightTopLabel;
    
    private final Font displayFont = new Font("Dialog", Font.BOLD, 18);
    
    private final BufferedImage yellowIcon = new Texture("/sprites/yellow_80").getImage();
    
    //private final Image yellow = yellowIcon.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
    private final BufferedImage redIcon = new Texture("/sprites/red_80").getImage();
    
    //private final Image red = redIcon.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
    private final JLabel rightBottomLabel;
    
    private final JLabel leftBottomLabel;
    
    private final JLabel rightMiddleLabel;
    
    private final JLabel leftMiddleLabel;
    
    private String time;
    
    private boolean firstTick;
    
    private boolean lastTick;
    
    private long nextTick;
    boolean pauseTime;

    
    /**Links*/ 
    
    
    
    /**Constructor*/ 
    
    
    /**
     * Display Constructor
     * 
     * @param _x
     * @param _y
     * @param _w
     * @param _h
     * @param _time
     */ 
    public Display(int _x, int _y, int _w, int _h, String _time) {
        this.x = _x;
        this.y = _y;
        this.displayWidth = _w;
        this.displayHeight = _h;
        this.time = _time;
        
        //Display Panel
        this.panel = new JPanel(new BorderLayout());
        panel.setBounds(new Rectangle(this.x, this.y, this.displayWidth, this.displayHeight));
        panel.setPreferredSize(new Dimension(this.displayWidth, this.displayHeight));
        panel.setVisible(true);
        
        //Left Panel
        this.leftPanel = new JPanel();
        leftPanel.setBounds(new Rectangle(this.x, this.y, this.displayWidth/2, this.displayHeight));
        leftPanel.setPreferredSize(new Dimension(this.displayWidth/2, this.displayHeight));
        leftPanel.setBackground(Color.decode("#8D8D8D"));
        leftPanel.setBorder(new LineBorder(Color.BLACK, 3, false));
        leftPanel.setVisible(true);
        
        this.leftTopLabel = new JLabel("Player 1 (LMB)", SwingUtilities.CENTER);
        leftTopLabel.setBounds(new Rectangle(0, 0, this.displayWidth/2, this.displayHeight/6));
        leftTopLabel.setPreferredSize(new Dimension(this.displayWidth/2, this.displayHeight/6));
        leftTopLabel.setFont(displayFont);
        leftTopLabel.setBackground(Color.decode("#8D8D8F"));
        leftTopLabel.setVisible(true);
        
        this.leftMiddleLabel = new JLabel(new ImageIcon(yellowIcon.getScaledInstance(40, 40, Image.SCALE_SMOOTH)), JLabel.CENTER);
        leftMiddleLabel.setBounds(new Rectangle(0, 0, this.displayWidth/2, this.displayHeight/2-10));
        leftMiddleLabel.setPreferredSize(new Dimension(this.displayWidth/2, this.displayHeight/2-10));
        leftMiddleLabel.setFont(displayFont);
        leftMiddleLabel.setBackground(Color.decode("#8D8D8F"));
        leftMiddleLabel.setVisible(true);
        
        this.leftBottomLabel = new JLabel("Player 1's Go : Play Timer: "+this.time, SwingUtilities.CENTER);
        leftBottomLabel.setBounds(new Rectangle(0, 0, this.displayWidth/2, this.displayHeight/6));
        leftBottomLabel.setPreferredSize(new Dimension(this.displayWidth/2, this.displayHeight/6));
        leftBottomLabel.setFont(displayFont);
        leftBottomLabel.setBackground(Color.decode("#8D8D8F"));
        leftBottomLabel.setVisible(true);
        
        leftPanel.add(leftTopLabel, BorderLayout.NORTH);
        leftPanel.add(leftMiddleLabel, BorderLayout.CENTER);
        leftPanel.add(leftBottomLabel, BorderLayout.SOUTH);
        
        
        //Right Panel
        this.rightPanel = new JPanel();
        rightPanel.setBounds(new Rectangle(this.x, this.y, this.displayWidth/2, this.displayHeight));
        rightPanel.setPreferredSize(new Dimension(this.displayWidth/2, this.displayHeight));
        rightPanel.setBackground(Color.decode("#8D8D8D"));
        rightPanel.setBorder(new LineBorder(Color.BLACK, 3, false));
        rightPanel.setVisible(true);
        
        this.rightTopLabel = new JLabel("Player 2 (RMB)", SwingUtilities.CENTER);
        rightTopLabel.setBounds(new Rectangle(0, 0, this.displayWidth/2, this.displayHeight/6));
        rightTopLabel.setPreferredSize(new Dimension(this.displayWidth/2, this.displayHeight/6));
        rightTopLabel.setFont(displayFont);
        rightTopLabel.setBackground(Color.decode("#8D8D8F"));
        rightTopLabel.setVisible(true);
        
        this.rightMiddleLabel = new JLabel(new ImageIcon(redIcon.getScaledInstance(40, 40, Image.SCALE_SMOOTH)), JLabel.CENTER);
        rightMiddleLabel.setBounds(new Rectangle(0, 0, this.displayWidth/2, this.displayHeight/2-10));
        rightMiddleLabel.setPreferredSize(new Dimension(this.displayWidth/2, this.displayHeight/2-10));
        rightMiddleLabel.setFont(displayFont);
        rightMiddleLabel.setBackground(Color.decode("#8D8D8F"));
        rightMiddleLabel.setVisible(true);
        
        this.rightBottomLabel = new JLabel("Player 2's Go : Play Timer: "+this.time, SwingUtilities.CENTER);
        rightBottomLabel.setBounds(new Rectangle(0, 0, this.displayWidth/2, this.displayHeight/6));
        rightBottomLabel.setPreferredSize(new Dimension(this.displayWidth/2, this.displayHeight/6));
        rightBottomLabel.setFont(displayFont);
        rightBottomLabel.setBackground(Color.decode("#8D8D8F"));
        rightBottomLabel.setVisible(false);
        
        rightPanel.add(rightTopLabel, BorderLayout.NORTH);
        rightPanel.add(rightMiddleLabel, BorderLayout.CENTER);
        rightPanel.add(rightBottomLabel, BorderLayout.SOUTH);
        
        panel.add(leftPanel, BorderLayout.WEST);
        panel.add(rightPanel, BorderLayout.EAST);
    }
    
    
    
    public void tick(){
        if(firstTick){
            firstTick = false;
            
            nextTick = System.currentTimeMillis() + 1000;
        }
        
        if(System.currentTimeMillis() >= nextTick && !pauseTime){
            nextTick += 1000;
            System.out.println("Decreasing Time: "+this.time);
            decreaseTime();
        }
        
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }

    
    
    private void decreaseTime() {
        if(Integer.decode(this.time) > -1 && !Level.gameOver){
            String newTime = String.valueOf(Integer.decode(this.time) - 1);
            if(Level.getPlayer().equals("Player 1")){
                if(Integer.decode(newTime) < 100) leftBottomLabel.setText("Player 1's Go : Play Timer: "+"0"+newTime);
                if(Integer.decode(newTime) < 10) leftBottomLabel.setText("Player 1's Go : Play Timer: "+"00"+newTime);
                
                this.time = newTime;
            }
            
            if(Level.getPlayer().equals("Player 2")){
                if(Integer.decode(newTime) < 100) rightBottomLabel.setText("Player 2's Go : Play Timer: "+"0"+newTime);
                if(Integer.decode(newTime) < 10) rightBottomLabel.setText("Player 2's Go : Play Timer: "+"00"+newTime);
                
                this.time = newTime;
            }
            
            if(Integer.decode(this.time) == 1){
                Level.changePlayer();
            }
            
        }
    }

    void pauseTime() {
        pauseTime = true;
    }
    
    void resetTime(){
        this.time = "100";
    }
    
    void changePlayer(){
        if(Level.getPlayer().equals("Player 1")){ 
            rightBottomLabel.setVisible(false);
            leftBottomLabel.setVisible(true);
        }
        if(Level.getPlayer().equals("Player 2")){ 
            rightBottomLabel.setVisible(true);
            leftBottomLabel.setVisible(false);
        }
        pauseTime = false;
        resetTime();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.level;

import com.LOGamez.connect4.Connect4;
import com.LOGamez.graphics.Texture;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author Nicholas Wright
 */
public class Button {

    /**Attributes*/ 
    
    /**x variable of Button*/ 
    private int x;
    
    /**y variable of Button*/ 
    private int y;
    
    /**btnWidth variable of Button*/ 
    private int btnWidth;
    
    /**btnHeight variable of Button*/ 
    private int btnHeight;
    
    /**symbol variable of Button*/ 
    private String symbol;
    
    /**btnFont variable of Button*/ 
    private Font btnFont;
    
    /**btnColor variable of Button*/ 
    private Color btnColor;
    
    /**button variable of Button*/ 
    private JButton button;
    
    /**buttons variable of Button*/ 
    private static List<Button> buttons;
    
    /**type variable of Button*/
    private int type;
    
    /**buttonA variable of Button*/
    private Button buttonA;
    
    /**buttonB variable of Button*/
    private Button buttonB;
    
    /**buttonC variable of Button*/
    private Button buttonC;
    
    /**buttonD variable of Button*/
    private Button buttonD;
    
    /**buttonE variable of Button*/
    private Button buttonE;
    
    /**buttonF variable of Button*/
    private Button buttonF;
    
    /**buttonG variable of Button*/
    private Button buttonG;
    
    /**button0 variable of Button*/
    private Button button0;
    
    /**button1 variable of Button*/
    private Button button1;
    
    /**button2 variable of Button*/
    private Button button2;
    
    /**button3 variable of Button*/
    private Button button3;
    
    /**button4 variable of Button*/
    private Button button4;
    
    /**button5 variable of Button*/
    private Button button5;
    
    /**button6 variable of Button*/
    private Button button6;
    
    /**button7 variable of Button*/
    private Button button7;
    
    /**button8 variable of Button*/
    private Button button8;
    
    /**button9 variable of Button*/
    private Button button9;
    
    /**button10 variable of Button*/
    private Button button10;
    
    /**button11 variable of Button*/
    private Button button11;
    
    /**button12 variable of Button*/
    private Button button12;
    
    /**button13 variable of Button*/
    private Button button13;
    
    /**button14 variable of Button*/
    private Button button14;
    
    /**button15 variable of Button*/
    private Button button15;
    
    /**button16 variable of Button*/
    private Button button16;
    
    /**button17 variable of Button*/
    private Button button17;
    
    /**button18 variable of Button*/
    private Button button18;
    
    /**button19 variable of Button*/
    private Button button19;
    
    /**button20 variable of Button*/
    private Button button20;
    
    /**button21 variable of Button*/
    private Button button21;
    
    /**button22 variable of Button*/
    private Button button22;
    
    /**button23 variable of Button*/
    private Button button23;
    
    /**button24 variable of Button*/
    private Button button24;
    
    /**button25 variable of Button*/
    private Button button25;
    
    /**button26 variable of Button*/
    private Button button26;
    
    /**button27 variable of Button*/
    private Button button27;
    
    /**button28 variable of Button*/
    private Button button28;
    
    /**button29 variable of Button*/
    private Button button29;
    
    /**button30 variable of Button*/
    private Button button30;
    
    /**button31 variable of Button*/
    private Button button31;
    
    /**button32 variable of Button*/
    private Button button32;
    
    /**button33 variable of Button*/
    private Button button33;
    
    /**button34 variable of Button*/
    private Button button34;
    
    /**button35 variable of Button*/
    private Button button35;
    
    /**button36 variable of Button*/
    private Button button36;
    
    /**button37 variable of Button*/
    private Button button37;
    
    /**button38 variable of Button*/
    private Button button38;
    
    /**button39 variable of Button*/
    private Button button39;
    
    /**button40 variable of Button*/
    private Button button40;
    
    /**button41 variable of Button*/
    private Button button41;
    
    /**firstTick variable of Button*/
    private boolean firstTick;
    
    /**lastTick variable of Button*/
    private boolean lastTick;
    
    /**buttonPanel variable of Button*/
    private JPanel buttonPanel;
    
    /**yellowIcon variable of Button*/
    private final BufferedImage yellowIcon = new Texture("/sprites/yellow_80").getImage();
    
    /**yellowFullIcon variable of Button*/
    private static final BufferedImage yellowFullIcon = new Texture("/sprites/fullYellow_80").getImage();
    
    /**redIcon variable of Button*/
    private final BufferedImage redIcon = new Texture("/sprites/red_80").getImage();
    
    /**redFullIcon variable of Button*/
    private static final BufferedImage redFullIcon = new Texture("/sprites/fullRed_80").getImage();
    
    /**yellowArrowIcon variable of Button*/
    private final BufferedImage yellowArrowIcon = new Texture("/sprites/yellowArrow_80").getImage();
    
    /**redArrowIcon variable of Button*/
    private final BufferedImage redArrowIcon = new Texture("/sprites/redArrow_80").getImage();
    
    /**emptyIcon variable of Button*/
    private static final BufferedImage emptyIcon = new Texture("/sprites/empty_80").getImage();
    
    /**id variable of Button*/
    private int id;
    
    /**backgroundColor variable of Button*/
    public Color backgroundColor = Color.decode("#8D8D8D");
    
    
    /**Links*/ 
    
    
    
    /**Constructor*/ 
    
    /**
     * Button Constructor
     * 
     * @param _type
     */
    public Button(int _type){
        this.type = _type;
        buttons = new ArrayList<>();
    }
    
    
    /**
     * Button Constructor
     * 
     * @param _x
     * @param _y
     * @param _w
     * @param _h
     * @param _c
     * @param _id
     * @param col
     */
    public Button(int _x, int _y, int _w, int _h, String _c, int _id, Color col){
        this.x = _x;
        this.y = _y;
        this.btnWidth = _w;
        this.btnHeight = _h;
        this.symbol = _c;
        this.id = _id;
        this.button = new JButton();
        
        button.setBounds(new Rectangle(this.x, this.y, this.btnWidth, this.btnHeight));
        button.setPreferredSize(new Dimension(this.btnWidth, this.btnHeight));
        if(this.id < 42){ 
            button.setBorder(new LineBorder(Color.decode("#0012cc"), 3, false));
        } else {
            button.setBorder(new LineBorder(backgroundColor, 3, false));
        }
        button.setBackground(col);
        button.setFont(btnFont);
        button.setVisible(true);
    }
    
    
    /**Public Protocol*/ 
    
    /**
     * init()
     * 
     */
    public void init(){
        GridLayout experimentalLayout = new GridLayout(1, 0, 0, 0);
        
        JPanel buttonPanelA = new JPanel();
        buttonPanelA.setLayout(experimentalLayout);
        buttonPanelA.setBounds(new Rectangle(0, 0, Connect4.getMainWidth(), 80));
        buttonPanelA.setPreferredSize(new Dimension(Connect4.getMainWidth(), 80));
        buttonPanelA.setBackground(backgroundColor);
        
        JPanel buttonPanel1 = new JPanel();
        buttonPanel1.setLayout(experimentalLayout);
        buttonPanel1.setBounds(new Rectangle(0, 0, Connect4.getMainWidth(), 80));
        buttonPanel1.setPreferredSize(new Dimension(Connect4.getMainWidth(), 80));
        buttonPanel1.setBackground(backgroundColor);
        
        JPanel buttonPanel2 = new JPanel();
        buttonPanel2.setLayout(experimentalLayout);
        buttonPanel2.setBounds(new Rectangle(0, 0, Connect4.getMainWidth(), 80));
        buttonPanel2.setPreferredSize(new Dimension(Connect4.getMainWidth(), 80));
        buttonPanel2.setBackground(backgroundColor);
        
        JPanel buttonPanel3 = new JPanel();
        buttonPanel3.setLayout(experimentalLayout);
        buttonPanel3.setBounds(new Rectangle(0, 0, Connect4.getMainWidth(), 80));
        buttonPanel3.setPreferredSize(new Dimension(Connect4.getMainWidth(), 80));
        buttonPanel3.setBackground(backgroundColor);
        
        JPanel buttonPanel4 = new JPanel();
        buttonPanel4.setLayout(experimentalLayout);
        buttonPanel4.setBounds(new Rectangle(0, 0, Connect4.getMainWidth(), 80));
        buttonPanel4.setPreferredSize(new Dimension(Connect4.getMainWidth(), 80));
        buttonPanel4.setBackground(backgroundColor);
        
        JPanel buttonPanel5 = new JPanel();
        buttonPanel5.setLayout(experimentalLayout);
        buttonPanel5.setBounds(new Rectangle(0, 0, Connect4.getMainWidth(), 80));
        buttonPanel5.setPreferredSize(new Dimension(Connect4.getMainWidth(), 80));
        buttonPanel5.setBackground(backgroundColor);
        
        JPanel buttonPanel6 = new JPanel();
        buttonPanel6.setLayout(experimentalLayout);
        buttonPanel6.setBounds(new Rectangle(0, 0, Connect4.getMainWidth(), 80));
        buttonPanel6.setPreferredSize(new Dimension(Connect4.getMainWidth(), 80));
        buttonPanel6.setBackground(backgroundColor);
        
        buttonA = new Button(0, 0, 80, 80, "A", 42, btnColor);
        buttonB = new Button(80, 0, 80, 80, "A", 43, btnColor);
        buttonC = new Button(160, 0, 80, 80, "A", 44, btnColor);
        buttonD = new Button(240, 0, 80, 80, "A", 45, btnColor);
        buttonE = new Button(320, 0, 80, 80, "A", 46, btnColor);
        buttonF = new Button(400, 0, 80, 80, "A", 47, btnColor);
        buttonG = new Button(480, 0, 80, 80, "A", 48, btnColor);
        buttons.add(buttonA);
        buttons.add(buttonB);
        buttons.add(buttonC);
        buttons.add(buttonD);
        buttons.add(buttonE);
        buttons.add(buttonF);
        buttons.add(buttonG);
        buttonPanelA.add(buttonA.button);
        buttonPanelA.add(buttonB.button);
        buttonPanelA.add(buttonC.button);
        buttonPanelA.add(buttonD.button);
        buttonPanelA.add(buttonE.button);
        buttonPanelA.add(buttonF.button);
        buttonPanelA.add(buttonG.button);
        
        button0 = new Button(0, 0, 80, 80, "A", 0, btnColor);
        button1 = new Button(80, 0, 80, 80, "A", 1, btnColor);
        button2 = new Button(160, 0, 80, 80, "A", 2, btnColor);
        button3 = new Button(240, 0, 80, 80, "A", 3, btnColor);
        button4 = new Button(320, 0, 80, 80, "A", 4, btnColor);
        button5 = new Button(400, 0, 80, 80, "A", 5, btnColor);
        button6 = new Button(480, 0, 80, 80, "A", 6, btnColor);
        buttons.add(button0);
        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
        buttons.add(button4);
        buttons.add(button5);
        buttons.add(button6);
        buttonPanel1.add(button0.button);
        buttonPanel1.add(button1.button);
        buttonPanel1.add(button2.button);
        buttonPanel1.add(button3.button);
        buttonPanel1.add(button4.button);
        buttonPanel1.add(button5.button);
        buttonPanel1.add(button6.button);
        
        button7 = new Button(0, 80, 80, 80, "A", 7, btnColor);
        button8 = new Button(80, 80, 80, 80, "A", 8, btnColor);
        button9 = new Button(160, 80, 80, 80, "A", 9, btnColor);
        button10 = new Button(240, 80, 80, 80, "A", 10, btnColor);
        button11 = new Button(320, 80, 80, 80, "A", 11, btnColor);
        button12 = new Button(400, 80, 80, 80, "A", 12, btnColor);
        button13 = new Button(480, 80, 80, 80, "A", 13, btnColor);
        buttons.add(button7);
        buttons.add(button8);
        buttons.add(button9);
        buttons.add(button10);
        buttons.add(button11);
        buttons.add(button12);
        buttons.add(button13);
        buttonPanel2.add(button7.button);
        buttonPanel2.add(button8.button);
        buttonPanel2.add(button9.button);
        buttonPanel2.add(button10.button);
        buttonPanel2.add(button11.button);
        buttonPanel2.add(button12.button);
        buttonPanel2.add(button13.button);
        
        button14 = new Button(0, 160, 80, 80, "A", 14, btnColor);
        button15 = new Button(80, 160, 80, 80, "A", 15, btnColor);
        button16 = new Button(160, 160, 80, 80, "A", 16, btnColor);
        button17 = new Button(240, 160, 80, 80, "A", 17, btnColor);
        button18 = new Button(320, 160, 80, 80, "A", 18, btnColor);
        button19 = new Button(400, 160, 80, 80, "A", 19, btnColor);
        button20 = new Button(480, 160, 80, 80, "A", 20, btnColor);
        buttons.add(button14);
        buttons.add(button15);
        buttons.add(button16);
        buttons.add(button17);
        buttons.add(button18);
        buttons.add(button19);
        buttons.add(button20);
        buttonPanel3.add(button14.button);
        buttonPanel3.add(button15.button);
        buttonPanel3.add(button16.button);
        buttonPanel3.add(button17.button);
        buttonPanel3.add(button18.button);
        buttonPanel3.add(button19.button);
        buttonPanel3.add(button20.button);
        
        button21 = new Button(0, 240, 80, 80, "A", 21, btnColor);
        button22 = new Button(80, 240, 80, 80, "A", 22, btnColor);
        button23 = new Button(160, 240, 80, 80, "A", 23, btnColor);
        button24 = new Button(240, 240, 80, 80, "A", 24, btnColor);
        button25 = new Button(320, 240, 80, 80, "A", 25, btnColor);
        button26 = new Button(400, 240, 80, 80, "A", 26, btnColor);
        button27 = new Button(480, 240, 80, 80, "A", 27, btnColor);
        buttons.add(button21);
        buttons.add(button22);
        buttons.add(button23);
        buttons.add(button24);
        buttons.add(button25);
        buttons.add(button26);
        buttons.add(button27);
        buttonPanel4.add(button21.button);
        buttonPanel4.add(button22.button);
        buttonPanel4.add(button23.button);
        buttonPanel4.add(button24.button);
        buttonPanel4.add(button25.button);
        buttonPanel4.add(button26.button);
        buttonPanel4.add(button27.button);
        
        button28 = new Button(0, 320, 80, 80, "A", 28, btnColor);
        button29 = new Button(80, 320, 80, 80, "A", 29, btnColor);
        button30 = new Button(160, 320, 80, 80, "A", 30, btnColor);
        button31 = new Button(240, 320, 80, 80, "A", 31, btnColor);
        button32 = new Button(320, 320, 80, 80, "A", 32, btnColor);
        button33 = new Button(400, 320, 80, 80, "A", 33, btnColor);
        button34 = new Button(480, 320, 80, 80, "A", 34, btnColor);
        buttons.add(button28);
        buttons.add(button29);
        buttons.add(button30);
        buttons.add(button31);
        buttons.add(button32);
        buttons.add(button33);
        buttons.add(button34);
        buttonPanel5.add(button28.button);
        buttonPanel5.add(button29.button);
        buttonPanel5.add(button30.button);
        buttonPanel5.add(button31.button);
        buttonPanel5.add(button32.button);
        buttonPanel5.add(button33.button);
        buttonPanel5.add(button34.button);
        
        button35 = new Button(0, 400, 80, 80, "A", 35, btnColor);
        button36 = new Button(80, 400, 80, 80, "A", 36, btnColor);
        button37 = new Button(160, 400, 80, 80, "A", 37, btnColor);
        button38 = new Button(240, 400, 80, 80, "A", 38, btnColor);
        button39 = new Button(320, 400, 80, 80, "A", 39, btnColor);
        button40 = new Button(400, 400, 80, 80, "A", 40, btnColor);
        button41 = new Button(480, 400, 80, 80, "A", 41, btnColor);
        buttons.add(button35);
        buttons.add(button36);
        buttons.add(button37);
        buttons.add(button38);
        buttons.add(button39);
        buttons.add(button40);
        buttons.add(button41);
        buttonPanel6.add(button35.button);
        buttonPanel6.add(button36.button);
        buttonPanel6.add(button37.button);
        buttonPanel6.add(button38.button);
        buttonPanel6.add(button39.button);
        buttonPanel6.add(button40.button);
        buttonPanel6.add(button41.button);
        
        for(Button b : buttons){
            if(b.id < 42){ 
                b.button.setIcon(new ImageIcon(emptyIcon));
            } else {
                b.button.setIcon(new ImageIcon(yellowArrowIcon.getScaledInstance(64, 64, Image.SCALE_SMOOTH)));
            }
            b.button.addMouseListener(new MouseAdapter(){
                @Override
                public void mouseEntered(MouseEvent evt){
                    BtnMouseEntered(evt, b.id);
                }
                @Override
                public void mouseExited(MouseEvent evt){
                    BtnMouseExited(evt, b.id);
                }
                @Override
                public void mousePressed(MouseEvent evt){
                    BtnMousePressed(evt, b.id);
                }
                @Override
                public void mouseReleased(MouseEvent evt){
                    BtnMouseReleased(evt, b.id);
                }
            });
        }
        
        
        
        buttonPanel = new JPanel();
        BoxLayout experimentalLayout1 = new BoxLayout(buttonPanel, 1);
        
        buttonPanel.setLayout(experimentalLayout1);
        buttonPanel.setBounds(new Rectangle(0, 0, Connect4.getMainWidth(), Connect4.getMainHeight()));
        buttonPanel.add(buttonPanelA);
        buttonPanel.add(buttonPanel1);
        buttonPanel.add(buttonPanel2);
        buttonPanel.add(buttonPanel3);
        buttonPanel.add(buttonPanel4);
        buttonPanel.add(buttonPanel5);
        buttonPanel.add(buttonPanel6);
        
        Level.panel.add(buttonPanel);
        
        firstTick = true;
        lastTick = false;
        
    }
    
    
    /**
     * tick()
     * 
     */
    public void tick(){
        if(firstTick) {
            //Set firstTick: false
            firstTick = false;
            
        }
        
        //Manage Level: Last Tick
        if(lastTick) {
            lastTick = false;
//            Sound.stopAll();
//            if(!Sound.creditsSoundtrack.isPlaying()){
//                Sound.creditsSoundtrack.play();
//            }
            
            //Reset Level Time
            //resetLevelTime();
        }
    }
    
    
    
    /**
     * render()
     * 
     */
    public void render(){}
    
    
    private void BtnMouseEntered(MouseEvent evt, int _id) {
        if(_id > 41){
            JButton eSource = (JButton) evt.getSource();
            System.out.println("id:"+_id+" : "+buttons.get(_id).symbol);
            if(buttons.get(_id-7).symbol.equals("A")){
                if(Level.getPlayer().equals("Player 1")) eSource.setIcon(new ImageIcon(yellowIcon.getScaledInstance(64, 64, Image.SCALE_SMOOTH)));
                if(Level.getPlayer().equals("Player 2")) eSource.setIcon(new ImageIcon(redIcon.getScaledInstance(64, 64, Image.SCALE_SMOOTH)));
            } else {
                //Set Icon to cross
                //eSource.setIcon(new ImageIcon(crossIcon.getScaledInstance(64, 64, Image.SCALE_SMOOTH)));
            }
        }
    }
    
    private void BtnMouseExited(MouseEvent evt, int _id) {
        if(_id > 41){
            JButton eSource = (JButton) evt.getSource();
            if(buttons.get(_id-7).symbol.equals("A")){
                if(Level.getPlayer().equals("Player 1")) eSource.setIcon(new ImageIcon(yellowArrowIcon.getScaledInstance(64, 64, Image.SCALE_SMOOTH)));
                if(Level.getPlayer().equals("Player 2")) eSource.setIcon(new ImageIcon(redArrowIcon.getScaledInstance(64, 64, Image.SCALE_SMOOTH)));
            } else {
                //Set Icon to cross
                //eSource.setIcon(new ImageIcon(crossIcon.getScaledInstance(64, 64, Image.SCALE_SMOOTH)));
            }
        }
    }
    
    private void BtnMousePressed(MouseEvent evt, int _id) {
                    
    }

    private void BtnMouseReleased(MouseEvent evt, int _id) {
        JButton eSource = (JButton) evt.getSource();
        if(evt.getButton() == MouseEvent.BUTTON1){
            if(Level.getPlayer().equals("Player 1")) setYellow(eSource, _id);
        }
//        if(evt.getButton() == MouseEvent.BUTTON2){
//        }
        if(evt.getButton() == MouseEvent.BUTTON3){
            if(Level.getPlayer().equals("Player 2")) setRed(eSource, _id);
        }
    }

    private void setYellow(JButton eSource, int _id) {
        //if(buttons.get(_id+7).symbol.equals("A")) {
            eSource.setIcon(new ImageIcon(yellowIcon.getScaledInstance(76, 76, Image.SCALE_SMOOTH)));
            //Clear Arrows
            clearArrows();
            
            //Set Current piece
            Level.setCurrentPiece('Y', _id - 42, -1);
            
            buttons.get(_id).symbol = "Y";
        //}
        checkWin();
    }

    private void setRed(JButton eSource, int _id) {
        //if(buttons.get(_id+7).symbol.equals("A")) {
            eSource.setIcon(new ImageIcon(redIcon.getScaledInstance(76, 76, Image.SCALE_SMOOTH)));
            buttons.get(_id).symbol = "R";
            
            //Clear Arrows
            clearArrows();
            
            //Set Current piece
            Level.setCurrentPiece('R', _id - 42, -1);
        //}
        checkWin();
    }

    private void checkWin() {
//        int[] winLines = {0,1,2},
//                {3,4,5};
    }
    
    public void changeArrows(){
        for(Button b : buttons){
            if(b.id > 41){
                JButton eSource = b.button;
                if(Level.getPlayer().equals("Player 1")) eSource.setIcon(new ImageIcon(yellowArrowIcon.getScaledInstance(64, 64, Image.SCALE_SMOOTH)));
                if(Level.getPlayer().equals("Player 2")) eSource.setIcon(new ImageIcon(redArrowIcon.getScaledInstance(64, 64, Image.SCALE_SMOOTH)));
                b.symbol = "A";
            }
        }
    }
    
    public void clearArrows(){
        for(Button b : buttons){
            if(b.id > 41){
                JButton eSource = b.button;
                eSource.setIcon(null);
                b.symbol = "A";
            }
        }
    }
    
    public void setButtonRed(int _id){
        for(Button b : buttons){
            if(b.id < 42 && b.id == _id){
                JButton eSource = b.button;
                eSource.setIcon(new ImageIcon(redFullIcon));
                b.symbol = "R";
            }
        }
    }
    
    public void setButtonYellow(int _id){
        for(Button b : buttons){
            if(b.id < 42 && b.id == _id){
                JButton eSource = b.button;
                eSource.setIcon(new ImageIcon(yellowFullIcon));
                b.symbol = "Y";
            }   
        }
    }
    
    public void setButtonEmpty(int _id){
        for(Button b : buttons){
            if(b.id < 42 && b.id == _id){
                JButton eSource = b.button;
                eSource.setIcon(new ImageIcon(emptyIcon));
                b.symbol = "A";
            }   
        }
    }
}

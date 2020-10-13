/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LOGamez.level;

import com.LOGamez.audio.Sound;
import com.LOGamez.graphics.*;
import com.LOGamez.connect4.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Nicholas Wright
 */
public class Level {
    
    /**Attributes*/ 
    
    /**levelNo variable of Level*/ 
    public static int levelNo;
    
    /**levelName variable of Level*/ 
    private static String levelName;
    
    /**levelComplete variable of Level*/ 
    public static boolean levelComplete = false;
    
    /**gameComplete variable of Level*/ 
    private static boolean gameComplete;
    
    /**playerStartX variable of Level*/ 
    public static int playerStartX;
    
    /**playerStartY variable of Level*/ 
    public static int playerStartY;    
    
    /**random variable of Level*/ 
    //private static Random random;
    
    /**levelTime variable of Level*/ 
    //private static int levelTime = 0;
    
    /**gameOver variable of Level*/ 
    public static boolean gameOver;

    /**currentPlayer variable of Level*/ 
    private static String currentPlayer = "Player 1";

    /**levelCompleteCount variable of Level*/ 
    private int levelCompleteCount;
    
    /**levelStartCount variable of Level*/ 
    private int levelStartCount;
    
    /**firstTick variable of Level*/
    public static boolean firstTick;
    
    /**lastTick variable of Level*/
    public static boolean lastTick;
    
    /**groundColor variable of Level*/
    //private Color groundColor = Color.GREEN.darker();
    
    /**theLevelTime variable of Level*/
    public static String theLevelTime;
    
    /**time variable of Level*/
    private static float time;
    
    /**panel variable of Level*/
    public static JPanel panel;
    
    /**display variable of Level*/
    private static Display display;
    
    /**buttonz variable of Level*/
    private static Button buttonz;
    
    /**fieldWidth variable of Level*/
    static int fieldWidth = 7;
    
    /**fieldHeight variable of Level*/
    static int fieldHeight = 6;
    
    /**pField variable of Level*/
    static char[] pField = null;
    
    /**currentPiece variable of Level*/
    static char currentPiece = 'A';
    
    /**currentPieceX variable of Level*/
    static int currentPieceX = 0;
    
    /**currentPieceY variable of Level*/
    static int currentPieceY = 0;
    
    /**speed variable of Level*/
    int speed = 1;
    
    /**speedCount variable of Level*/
    int speedCount = 0;
    
    /**pieceCount variable of Level*/
    int pieceCount = 0;
    
    /**forceDown variable of Level*/
    boolean forceDown = false;
    
    /**fallSpeed variable of Level*/
    private long fallSpeed = 2;
    
    
    
    /**Links*/
    
    
    /**Constructor*/
    
    /**
     * Level(int lNo)
     * 
     * @param lNo - level number of Level Object
     * @param w
     * @param h
     */
    public Level(int lNo, int w, int h){
        System.out.println("Level: New Level "+lNo+" Created");
//        Game.labels = new Labels();
        //Game.hud = new HUD();
        levelNo = lNo;
        
        System.out.println("Level: Loading Level "+levelNo+" : "+getLevelName());
        
        //Create Player
//        if(Player.getLives() > 0 && levelNo != 1){
//            //set player lives to current player lives
//            Game.player = new Player(Game.gameWidth/2 +10, Game.gameHeight - 120, 80, 80, Game.getPName(), Player.getLives());
//        } else {
//            //set player lives to 3
//            Game.player = new Player(Game.gameWidth/2 +10, Game.gameHeight - 120, 80, 80, Game.getPName(), 3);
//        }
        
        setUp();
        
        init();
    }
    
    
    /**
     * setUp()
     * 
     */
    private void setUp(){
        
        switch(levelNo){
            case 1:
                setUpLevel1();
                break;
            case 2:
                setUpLevel2();
                break;
            case 3:
                setUpLevel3();
                break;
            case 4:
                setUpLevel4();
                break;
            case 5:
                setUpLevel5();
                break;
            case 6:
                setUpLevel6();
                break;
            case 7:
                setUpLevel7();
                break;
            case 8:
                setUpLevel8();
                break;
            case 9:
                setUpLevel9();
                break;
        }
        
    }
    
    
    /**
     * setUpLevel1()
     * 
     */
    private void setUpLevel1() {
        int width = Connect4.getMainWidth();

        //Set Level Background: 1
//        setBackground(1);//1: Moon(Small)
                
        switch(width){
            case 300:
                
                break;
                
            case 480:
                
                break;
                
            case 604:
                
                break;
                
            default:
                
                break;
                
        }
        
    }

    
    /**
     * setUpLevel2()
     * 
     */
    private void setUpLevel2(){
        int width = Connect4.getMainWidth();

        //Set Level Background: 2
//        setBackground(2);//2: Mars(Small)
        
        switch(width){
            case 300:
                
                break;
                
            case 480:
                
                break;
                
            case 604:
                
                break;
                
            default:
                
                break;
        }
        
    }
    
    
    /**
     * setUpLevel3()
     * 
     */
    private void setUpLevel3(){
        int width = Connect4.getMainWidth();
        
        //Set Level Background: 3
//        setBackground(3);//3: Earth(Small)
        
        switch(width){
            case 300:
                
                break;
                
            case 480:
                
                break;
                
            case 604:
                
                break;
                
            default:
                
                break;
        }
        
    }
    
    
    /**
     * setUpLevel4()
     * 
     */
    private void setUpLevel4(){
        int width = Connect4.getMainWidth();
        switch(width){
            case 300:
    
                //Set Level Background: 4
//                setBackground(4);//4: Sun
                
                break;
                
            case 480:
                
                break;
                
            case 604:
    
                //Set Level Background: 4
//                setBackground(4);//4: Sun
                
                break;
                
            default:
    
                //Set Level Background: 4
//                setBackground(4);//4: Sun
                
                break;
        }
        
    }
    
    
    /**
     * setUpLevel5()
     * 
     */
    private void setUpLevel5() {
        int width = Connect4.getMainWidth();
        switch(width){
            case 300:
    
                //Set Level Background: 1
//                setBackground(1);//1: Moon
            
                
                break;
                
            case 480:
    
                //Set Level Background: 1
//                setBackground(1);//1: Moon
                
                break;
                
            case 604:
    
                //Set Level Background: 1
//                setBackground(1);//1: Moon
            
                
                break;
                
            default:
                
                //Set Level Background: 1
//                setBackground(1);
                
                break;
        }
        
    }
    
    
    /**
     * setUpLevel6()
     * 
     */
    private void setUpLevel6(){
        int width = Connect4.getMainWidth();
        switch(width){
            case 300:
    
                //Set Level Background: 2
//                setBackground(2);//2: Mars
            
                
                break;
                
            case 480:
    
                //Set Level Background: 2
//                setBackground(2);//2: Mars
            
                
                break;
                
            case 604:
            
    
                //Set Level Background: 2
//                setBackground(2);//2: Mars
            
                
                break;
                
            default:
                //Set Level Background: 2
//                setBackground(2);//2: Mars
            
                
                break;
                
        }
        
    }
    
    
    /**
     * setUpLevel7()
     * 
     */
    private void setUpLevel7(){
        int width = Connect4.getMainWidth();
        switch(width){
            case 300:
    
                //Set Level Background: 4
//                setBackground(4);//4: Sun
            
                
                break;
                
            case 480:
            
                //Set Level Background: 4
//                setBackground(4);//4: Sun
            
                
                break;
                
            case 604:
            
                //Set Level Background: 4
//                setBackground(4);//4: Sun
            
                
                break;
                
            default:
            
                //Set Level Background: 4
//                setBackground(4);//4: Sun
            
                
                break;
                
        }
        
    }
    
    
    /**
     * setUpLevel8()
     * 
     */
    private void setUpLevel8(){
        int width = Connect4.getMainWidth();
//        random = new Random();
        switch(width){
            case 300:
            
                //Set Level Background: 3
//                setBackground(3);//3: Earth
            
                
                break;
                
            case 480:
            
                //Set Level Background: 3
//                setBackground(3);//3: Earth
            
                
                break;
                
            case 604:
            
                //Set Level Background: 3
//                setBackground(3);//3: Earth
            
                
                break;
                
            default:
            
                //Set Level Background: 3
//                setBackground(3);//3: Earth
            
                
                break;
                
        }
        
    }
    
    
    /**
     * setUpLevel9()
     * 
     */
    private void setUpLevel9(){
        int width = Connect4.getMainWidth();
//        random = new Random();
        switch(width){
            case 300:
            
                
                break;
                
            case 480:
            
                
                break;
                
            case 604:
                
                
                break;
                
            default:
            
                
                break;
                
        }
    }
    
    
    
    
    /**
     * init()
     * 
     */
    private void init(){
        Texture.clearMaps();
        
        panel = new JPanel();
        
        display = new Display(5, 5, Connect4.getMainWidth(), 120, "100");
        panel.add(display.panel, BorderLayout.NORTH);
        panel.setBackground(Color.decode("#0012ff"));
        
        //Create Buttons
        buttonz = new Button(0);
        buttonz.init();
        
        pField = new char[fieldWidth * fieldHeight];
        
        for(int x = 0; x < fieldWidth; x++){
            for(int y = 0; y < fieldHeight; y++){
                pField[y * fieldWidth + x] = 'A';
            }
        }
        
        firstTick = true;
        lastTick = false;

        //Reset Level Time
        resetLevelTime();
        
        
    }
    
    
    /**
     * changeLevel()
     * 
     */
    public static void changeLevel(){
        if(levelNo < 8){
            levelNo++;
            setLevelNo(levelNo);
        } else {
            gameComplete = true;
        }
    }
    
    
    /**
     * getLevelNo()
     * 
     * 
     * @return levelNo
     */
    public static int getLevelNo(){
        return levelNo;
    }
    
    
    /**
     * setLevelNo()
     * 
     * 
     * @param levNo
     */
    public static void setLevelNo(int levNo){
        levelNo = levNo;
        Game.level = new Level(levelNo, Connect4.getMainWidth(), Connect4.getMainHeight());
    }
    
    
    /**
     * getLevelName()
     * 
     * 
     * @return levelName
     */
    public static String getLevelName(){
        switch(levelNo){
            case 1:
                levelName = "Level 1";
                
                break;
                
            case 2:
                levelName = "Level 2";
                
                break;
                
            case 3:
                levelName = "Level 3";
                
                break;
                
            case 4:
                levelName = "Level 4";
                
                break;
                
            case 5:
                levelName = "Level 5";
                
                break;
                
            case 6:
                levelName = "Level 6";
                
                break;
                
            case 7:
                levelName = "Level 7";
                
                break;
                
            case 8:
                levelName = "Level 8";
                
                break;
            
            default:
                levelName = "GAME COMPLETE!";
                
                break;
            
        }

        return levelName;
    }
    
    
    
    /**
    * tick()
    * 
    * 
    * Updates Level Object
    */
    public static void tick(){
        //Manage Level: First Tick
        if(firstTick) {
            //Set firstTick: false
            firstTick = false;
            
            //Reset Game Time
            Game.resetGameTime();
            
            //Reset Level Time
            resetLevelTime();
            
            if(Game.getGameMusic()){
                if(Game.levelNo == 1 && !Sound.Level1.isPlaying()){
                    Sound.Level1.loop();
                }
                if(Game.levelNo == 2 && !Sound.Level2.isPlaying()){
                    Sound.Level2.loop();
                }
                if(Game.levelNo == 3 && !Sound.Level3.isPlaying()){
                    Sound.Level3.loop();
                }
                if(Game.levelNo == 4 && !Sound.Level4.isPlaying()){
                    Sound.Level4.loop();
                }
                if(Game.levelNo == 5 && !Sound.Level5.isPlaying()){
                    Sound.Level5.loop();
                }
                if(Game.levelNo == 6 && !Sound.Level6.isPlaying()){
                    Sound.Level6.loop();
                }
                if(Game.levelNo == 7 && !Sound.Level7.isPlaying()){
                    Sound.Level7.loop();
                }
                if(Game.levelNo == 8 && !Sound.Level8.isPlaying()){
                    Sound.Level8.loop();
                }
            }
        }
        
        //Manage Level: Last Tick
        if(lastTick) {
            lastTick = false;
            Sound.stopAll();
            if(!Sound.creditsSoundtrack.isPlaying()){
                Sound.creditsSoundtrack.play();
            }
            
            //Reset Level Time
            resetLevelTime();
        }
        
        //if(Game.getGame().menu == null && !Game.getGame().stateManager.currentState.getName().equals("menu")){
            
        
        
//        for(int x = 0; x < fieldWidth; x++){
//            for(int y = 0; y < fieldHeight; y++){
//                if(pField[y * fieldWidth + x] == 'A') buttonz.setButtonEmpty(y * fieldWidth + x);
//                if(pField[y * fieldWidth + x] == 'R') buttonz.setButtonRed(y * fieldWidth + x);
//                if(pField[y * fieldWidth + x] == 'Y') buttonz.setButtonYellow(y * fieldWidth + x);
//                System.out.println("id:"+(y * fieldWidth + x)+" :"+pField[y * fieldWidth + x]);
//            }
//        }
        display.tick();  
    }
    
    
    /**
    * render(Render target, Graphics2D g)
    * 
    * 
    * Renders/Repaints Level Objects
    * 
    * @param g2d
    */
    public void render(Graphics2D g2d){
        
        Graphics g2d_Level = g2d;
        AffineTransform oldXForm = g2d.getTransform();
        
        if(!gameOver && !Game.paused){
            
            //GAME TIMING
            try{
                Thread.sleep(fallSpeed);
            } catch (InterruptedException ex){
                Logger.getLogger(Level.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            speedCount++;
            forceDown = (speedCount == speed);
            
            //Force the Piece down the playfield if its time
            if(forceDown){
                //Update difficulty every 50 pieces
                speedCount = 0;
                pieceCount++;
                
                if(pieceCount % 50 == 0){
                    if(speed >= 10){
                        speed--;
                        if(fallSpeed > 10){
                            fallSpeed -= 2;
                            if(Game.getGameSound()){
                                Sound.EnMove.play();
                            }
                        }
                    }
                }
                
                //Test if piece can be moved down
                if(doesPieceFit(currentPiece, currentPieceX, currentPieceY + 1) && currentPieceY < 5){
                    if(currentPiece == 'R' && currentPieceY >= 0) pField[currentPieceY * fieldWidth + currentPieceX] = 'A';
                    if(currentPiece == 'Y' && currentPieceY >= 0) pField[currentPieceY * fieldWidth + currentPieceX] = 'A';
                    
                    currentPieceY++;//It can, so do it!
                    if(currentPiece == 'R') pField[currentPieceY * fieldWidth + currentPieceX] = 'X';
                    if(currentPiece == 'Y') pField[currentPieceY * fieldWidth + currentPieceX] = 'O';
                    if(Game.getGameSound()){
                        Sound.EnMove.play();
                    }
                    
                } else {
                    //It can't, Lock it in place
                    if(currentPiece == 'R') pField[currentPieceY * fieldWidth + currentPieceX] = 'X';
                    if(currentPiece == 'Y') pField[currentPieceY * fieldWidth + currentPieceX] = 'O';
                    
                    if(Game.getGameSound()){
                        Sound.EnMove.play();
                    }
                    
                    //Check for win lines
                    if(currentPieceY < fieldHeight -1){
                        boolean bLine = true;
                        for(int px = 1; px < 5; px++){
                            if(currentPiece == 'R') bLine &= (pField[currentPieceY * fieldWidth + px]) == 'R';
                            if(currentPiece == 'Y') bLine &= (pField[currentPieceY * fieldWidth + px]) == 'Y';
                        }
                        
                        if(bLine){
                            //Win Game
                            //winGame(getPlayer());
                        }
                    }
                    
                    //gameOver = !doesPieceFit(currentPiece, currentPieceX, currentPieceY);
                    currentPiece = '0';
                    
                    if(display.pauseTime) changePlayer();
                }
            }
            
        }
        
        for(int x = 0; x < fieldWidth; x++){
            for(int y = 0; y < fieldHeight; y++){
                if(pField[y * fieldWidth + x] == 'A') buttonz.setButtonEmpty(y * fieldWidth + x);
                if(pField[y * fieldWidth + x] == 'X') buttonz.setButtonRed(y * fieldWidth + x);
                if(pField[y * fieldWidth + x] == 'O') buttonz.setButtonYellow(y * fieldWidth + x);
                System.out.println("id:"+(y * fieldWidth + x)+" :"+pField[y * fieldWidth + x]);
            }
        }
        
        
        if(Game.showFPS){
            String fps = Game.thefps;
            //target.draw(fps, Labels.fpsX, Labels.fpsY, 0xfe1300);
        }
        if(Game.showUPS){
            String ups = Game.theUps;
            //target.draw(ups, Labels.upsX, Labels.upsY, 0xf0ff00);
        }
        if(Game.showGameTime){
            String gameTime = Game.theGameTime;
            //target.draw(gameTime, Labels.upsX+110, Labels.upsY+44, 0x008fea);
        }
        if(Game.showLevelTime){
            String levTime = theLevelTime;
            //target.draw(levTime, Labels.upsX+310, Labels.upsY+44, 0xff8fea);
        }

        if(Game.showBounds){
            g2d.setColor(Color.GREEN);
            //g2d.drawRect(groundBounds.x, groundBounds.y, groundBounds.width, groundBounds.height);
            g2d.setColor(Color.WHITE);
            //g2d.drawRect(Enemy.leftSide - 5, 29, 5, Display.game.getHeight() - (28 + groundBounds.height + 8));
            g2d.setColor(Color.WHITE);
            //g2d.drawRect(Enemy.rightSide + 19, 29, 5, Display.game.getHeight() - (28 + groundBounds.height + 8));
        }    
        
        if (Game.pauseTime > 0 && !Game.paused && Game.getGame().menu == null) {
            if(levelComplete){
                time = System.currentTimeMillis();
                
                for (levelCompleteCount = 0; levelCompleteCount < 500; levelCompleteCount++) {
                    //Draw scaled 3D SI Icon: GOLD
                    if(time / 25 % 5 == 0){
                        //render Space Invaders Icon
                        //target.scaleDraw(Texture.buttonsA, 3, 234, 132, 48, 126, 50, 38, 0xFFBF00);
                        //target.scaleDraw(Texture.buttonsA, 3, 230, 128, 48, 126, 50, 38, 0xBF9B30);
                    } else if(time / 200 % 40 == 0){
                        //render Space Invaders Icon
                        //target.scaleDraw(Texture.buttonsA, 3, 234, 132, 48, 126, 50, 38, 0xBF9B30);
                        //target.scaleDraw(Texture.buttonsA, 3, 230, 128, 48, 126, 50, 38, 0xFFBF00);
                    }
                    if (time / 450 % 2 == 0) {

                        //COMPLETE
                        //target.scaleDraw(Texture.buttonsA, Labels.click2FocusScale, Labels.click2FocusX-20, Labels.click2FocusY+40, 235, 200, 220, 30, 0xBF9B30);
                        //target.scaleDraw(Texture.buttonsA, Labels.click2FocusScale, Labels.click2FocusX-24, Labels.click2FocusY+36, 235, 200, 220, 30, 0xffffff);

                        
                        //Level
                        //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelX-120, Labels.LevelY, 130, 300, 73, 35, levelTxtBGCol);
                        //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelX-116, Labels.LevelY-4, 130, 300, 73, 35, 0xffffff);

                        if (Game.levelNo == 1){
                            //level 1 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-120, Labels.LevelNoY, 200, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-116, Labels.LevelNoY-4, 200, 300, 15, 35, 0xffffff);
                        }
                        
                        if (Game.levelNo == 2) {
                            //level 2 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-120, Labels.LevelNoY, 220, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-116, Labels.LevelNoY-4, 220, 300, 15, 35, 0xffffff);
                        }

                        if (Game.levelNo == 3) {
                            //level 3 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-120, Labels.LevelNoY, 240, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-116, Labels.LevelNoY-4, 240, 300, 15, 35, 0xffffff);
                        }
                        
                        if (Game.levelNo == 4) {
                            //level 4 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-120, Labels.LevelNoY, 260, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-116, Labels.LevelNoY-4, 260, 300, 15, 35, 0xffffff);
                        }
                        
                        if (Game.levelNo == 5) {
                            //level 5 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-120, Labels.LevelNoY, 276, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-116, Labels.LevelNoY-4, 276, 300, 15, 35, 0xffffff);
                        }
                        
                        if (Game.levelNo == 6) {
                            //level 6 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-120, Labels.LevelNoY, 292, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-116, Labels.LevelNoY-4, 292, 300, 15, 35, 0xffffff);
                        }

                        if (Game.levelNo == 7) {
                            //level 7 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-120, Labels.LevelNoY, 310, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-116, Labels.LevelNoY-4, 310, 300, 15, 35, 0xffffff);
                        }

                        if (Game.levelNo == 8) {
                            //level 8 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-120, Labels.LevelNoY, 332, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-116, Labels.LevelNoY-4, 332, 300, 15, 35, 0xffffff);
                        }                        
                    
                        //target.drawText("Lives Bonus: "+Game.getLivesBonus(), 2, Labels.enterLevelX+120, Labels.enterLevelY+170, 0xFeca00);
                        //target.drawText("Time Bonus: "+Game.getTimeBonus(), 2, Labels.enterLevelX+120, Labels.enterLevelY+200, 0xFF0000);
                        //target.drawText("Accuracy Bonus: "+Game.getAccuracyBonus(), 2, Labels.enterLevelX+120, Labels.enterLevelY+230, 0xFFaa00);
                        //target.drawText("Level Bonus: "+Game.getLevelBonus(), 3, Labels.enterLevelX+120, Labels.enterLevelY+275, 0xFFce00);
                        
                        Connect4.setStatusBar("Level "+Game.levelNo+" : "+getLevelName()+" Completed!!");    
                    } else {
                        //target.drawText("Level Bonus: "+Game.getLevelBonus(), 3, Labels.enterLevelX+120, Labels.enterLevelY+275, 0xffffff);
                    }
                    
                    if (Game.levelNo == 1){
                        //level 1 3D Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-30, Labels.enterLevelY+70, levelTxtBGCol);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-32, Labels.enterLevelY+68, 0xffffff);
                    }
                    if (Game.levelNo == 2){
                        //level 2 3D Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX, Labels.enterLevelY+70, levelTxtBGCol);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-2, Labels.enterLevelY+68, 0xffffff);
                    }
                    if (Game.levelNo == 3){
                        //level 3 3D Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX+10, Labels.enterLevelY+70, levelTxtBGCol);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX+8, Labels.enterLevelY+68, 0xffffff);
                    }
                    if (Game.levelNo == 4){
                        //level 4 3D Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-5, Labels.enterLevelY+70, levelTxtBGCol);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-7, Labels.enterLevelY+68, 0xffffff);
                    }
                    if (Game.levelNo == 5){
                        //level 5 3D Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX+10, Labels.enterLevelY+70, levelTxtBGCol);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX+8, Labels.enterLevelY+68, 0xffffff);
                    }
                    if (Game.levelNo == 6){
                        //level 6 3D Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-22, Labels.enterLevelY+70, levelTxtBGCol);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-24, Labels.enterLevelY+68, 0xffffff);
                    }
                    if (Game.levelNo == 7){
                        //level 7 3D Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-60, Labels.enterLevelY+70, levelTxtBGCol);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-62, Labels.enterLevelY+68, 0xffffff);
                    }
                    if (Game.levelNo == 8){
                        //level 8 3D Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-50, Labels.enterLevelY+70, levelTxtBGCol);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-52, Labels.enterLevelY+68, 0xffffff);
                    }
                    
                    if (levelCompleteCount == 0) {
                        lastTick = true;
                        break;
                    }
                }
                
            } else {
                time = System.currentTimeMillis();
                for (levelStartCount = 0; levelStartCount < 100; levelStartCount++) {    
                    //Draw scaled 3D SI Icon: BLUE
                    if(time / 25 % 5 == 0){
                        //render Space Invaders Icon
                        //target.scaleDraw(Texture.buttonsA, 3, 234, 132, 48, 126, 50, 38, enterLvlIconBG);
                        //target.scaleDraw(Texture.buttonsA, 3, 230, 128, 48, 126, 50, 38, enterLvlIconFG);
                    } else if(time / 20 % 40 == 0){
                        //render Space Invaders Icon
                        //target.scaleDraw(Texture.buttonsA, 3, 234, 132, 48, 126, 50, 38, enterLvlIconFG);
                        //target.scaleDraw(Texture.buttonsA, 3, 230, 128, 48, 126, 50, 38, enterLvlIconBG);
                    }
                    if (time / 450 % 2 == 0) {

                        //Entering 3D
                        //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.enterLevelX, Labels.enterLevelY+30, 0, 300, 130, 35, levelTxtBGCol);
                        //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.enterLevelX-4, Labels.enterLevelY+26, 0, 300, 130, 35, 0xffffff);

                        //Level
                        //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelX, Labels.LevelY+30, 130, 300, 73, 35, levelTxtBGCol);
                        //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelX-4, Labels.LevelY+26, 130, 300, 73, 35, 0xffffff);

                        if (Game.levelNo == 1 || Game.levelNo == -1) {
                            
                            //level 1 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX, Labels.LevelY+30, 200, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-4, Labels.LevelY+26, 200, 300, 15, 35, 0xffffff);
                        }

                        if (Game.levelNo == 2) {
                            //level 2 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX, Labels.LevelNoY+30, 220, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-4, Labels.LevelNoY+26, 220, 300, 15, 35, 0xffffff);
                        }

                        if (Game.levelNo == 3) {
                            //level 3 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX, Labels.LevelNoY+30, 240, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-4, Labels.LevelNoY+26, 240, 300, 15, 35, 0xffffff);
                        }

                        if (Game.levelNo == 4) {
                            //level 4 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX, Labels.LevelNoY+30, 260, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-4, Labels.LevelNoY+26, 260, 300, 15, 35, 0xffffff);
                        }
                        
                        if (Game.levelNo == 5) {
                            //level 5 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX, Labels.LevelNoY+30, 276, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-4, Labels.LevelNoY+26, 276, 300, 15, 35, 0xffffff);
                        }

                        if (Game.levelNo == 6) {
                            //level 6 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX, Labels.LevelNoY+30, 292, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-4, Labels.LevelNoY+26, 292, 300, 15, 35, 0xffffff);
                        }

                        if (Game.levelNo == 7) {
                            //level 7 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX, Labels.LevelNoY+30, 310, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-4, Labels.LevelNoY+26, 310, 300, 15, 35, 0xffffff);
                        }

                        if (Game.levelNo == 8) {
                            //level 8 No.
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX, Labels.LevelNoY+30, 332, 300, 15, 35, levelTxtBGCol);
                            //target.scaleDraw(Texture.buttonsA, Labels.enterLevelNoScale, Labels.LevelNoX-4, Labels.LevelNoY+26, 332, 300, 15, 35, 0xffffff);
                        }
                        Connect4.setStatusBar("Entering Level "+Game.levelNo+" : "+getLevelName());
                        
                    }
                    
                    if (Game.levelNo == 1 || Game.levelNo == -1) {
                        //level 3D Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-30, Labels.enterLevelY+100, 0xffffff);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-31, Labels.enterLevelY+99, levelTxtBGCol);
                    }
                    if (Game.levelNo == 2) {
                        //level 2 Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX, Labels.enterLevelY+100, 0xffffff);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-1, Labels.enterLevelY+99, levelTxtBGCol);
                    }
                    if (Game.levelNo == 3) {
                        //level 3 Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX+10, Labels.enterLevelY+100, 0xffffff);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX+9, Labels.enterLevelY+99, levelTxtBGCol);
                    }
                    if (Game.levelNo == 4) {
                        //level 4 Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-5, Labels.enterLevelY+100, 0xffffff);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-6, Labels.enterLevelY+99, levelTxtBGCol);
                    }
                    if (Game.levelNo == 5) {
                        //level 5 Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX+10, Labels.enterLevelY+100, 0xffffff);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX+9, Labels.enterLevelY+99, levelTxtBGCol);
                    }
                    if (Game.levelNo == 6) {
                        //level 6 Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-22, Labels.enterLevelY+100, 0xffffff);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-21, Labels.enterLevelY+99, levelTxtBGCol);
                    }
                    if (Game.levelNo == 7) {
                        //level 7 Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-60, Labels.enterLevelY+100, 0xffffff);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-61, Labels.enterLevelY+99, levelTxtBGCol);
                    }
                    if (Game.levelNo == 8) {
                        //level 8 Name
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-50, Labels.enterLevelY+100, 0xffffff);
                        //target.drawText(getLevelName(), 2, Labels.enterLevelX-51, Labels.enterLevelY+99, levelTxtBGCol);
                    }
                    
                    if(levelStartCount == 100){
                        firstTick = true;
                        //Reset Level Time
                        resetLevelTime();
                        break;
                    }
                    
                }
            }
            
        }
    
    }
    
    
    /**
    * doesPieceFit(char cp, int cpX, int cpY)
    * 
    * 
    * @param cp
    * @param cpX
    * @param cpY
    * 
    * @return 
    */
    public boolean doesPieceFit(char cp, int cpX, int cpY){
        
        int fi = cpY * fieldWidth + cpX;
        
        if(cpX >= 0 && cpX < fieldWidth){
            if(cpY >= 0 && cpY < fieldHeight){
                if((cp == 'R' || cp == 'Y') && pField[fi] != 'A') return false;
            }
        }
        
        return true;
    }

    
    /**
    * setBackground(int index)
    * 
    * 
    * @param index
    */
//    public static void setBackground(int index) {
//        background = index;
//    }

    
    /**
    * setGroundColor(int col)
    * 
    * 
    * @param col
    */
//    private void setGroundColor(Color col) {
//        groundColor = col;
//    }

    
    /**
    * resetLevelTime()
    * 
    */
    public static void resetLevelTime() {
        System.out.println("Level: Resetting Level Time");
        Game.levelTime = 0;
    }

    public static String getPlayer() {
        return currentPlayer;
    }
    
    public static void setPlayer(String play) {
        currentPlayer = play;
    }

    public static void changePlayer() {
        if(getPlayer().equals("Player 1")){ 
            setPlayer("Player 2");
        } else { 
            setPlayer("Player 1");
        }
        buttonz.changeArrows();
        display.changePlayer();
    }
    
    public static void setCurrentPiece(char cp, int cpX, int cpY) {
        if(currentPiece == '0'){
            currentPiece = cp;
            currentPieceX = cpX;
            currentPieceY = cpY;
            display.pauseTime();
        }
    }

    private void winGame(String player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

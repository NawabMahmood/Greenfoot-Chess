import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class MyWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     *
     */
    int clicks=1;
    Chesspiece pieceseleceted;
    boolean canIMove;
    public MyWorld()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(8, 8, 50,false);
        for(int x = 0; x <8; x++){
        addObject( new Pawn ("white"),x,1);

      }

      for(int x = 0; x <8; x++){
        addObject( new Pawn ("black"),x,6);

      }
      addObject(new Knight("white"), 1,0);
      addObject(new Knight("white"), 6,0);
      addObject(new Bishop("white"), 2,0);
      addObject(new Bishop("white"), 5,0);
      addObject(new Rook("white"), 0,0);
      addObject(new Rook("white"), 7,0);
      addObject(new King("white"), 4,0);
      addObject(new Queen("white"), 3,0);
      addObject(new Knight("black"), 1,7);
      addObject(new Knight("black"), 6,7);
      addObject(new Bishop("black"), 2,7);
      addObject(new Bishop("black"), 5,7);
      addObject(new Rook("black"), 0,7);
      addObject(new Rook("black"), 7,7);
      addObject(new King("black"), 4,7);
      addObject(new Queen("black"), 3,7);


    }

     public void mouseWasClicked(Chesspiece a){
         ArrayList<position> p = new ArrayList<position>();
         System.out.println("clicks is " + clicks);
        if(clicks == 1 && a.getTeam().equals("white")){

            clicks ++;
           pieceseleceted= a;
          p = pieceseleceted.getPossibleMoves();
           for(int s = 0; s<p.size();s++){
           addObject(new Highlight(), p.get(s).getX(),p.get(s).getY());

          }
        }

                     else if(clicks == 2){
                        if(a instanceof Highlight){

                        pieceseleceted.setLocation(a.getX(),a.getY());
                        removeObject(a);
                        clicks = 1;
                        removeHighlights();
                           //write line to make ai go

                           List<Chesspiece> Ai = getObjects(Chesspiece.class);
                           for(int x = 0; x<Ai.size();x++){
                           if(Ai.get(x).getTeam().equals("white")){
                              Ai.remove(x);
                            x--;
                            }
                        }

                        System.out.println("the black ones " + Ai);

                        canIMove=false;
                        while (canIMove == false){
                             int randomNum = (int) (Math.random()*Ai.size());

                               Chesspiece AiPiece = Ai.get(randomNum);
                               //removing crappy positions from my list
                               List<position> aiMoves=AiPiece.getPossibleMoves();

                                      for(int x = 0; x<aiMoves.size();x++){
                                           if(aiMoves.get(x).getX() <0  ){
                                               canIMove = false;
                                              aiMoves.remove(x);
                                            x--;
                                            }
                                            else if(aiMoves.get(x).getX() >7 ){
                                                canIMove = false;
                                              aiMoves.remove(x);
                                            x--;
                                            }
                                    }






                                              for(int y = 0; y<aiMoves.size();y++){
                                               if(aiMoves.get(y).getY() >7){
                                                   canIMove = false;
                                                  aiMoves.remove(y);
                                                y--;
                                                }
                                                else if(aiMoves.get(y).getY() <0){
                                                canIMove = false;
                                                aiMoves.remove(y);
                                                y--;
                                               }


                                     }


                                if(aiMoves.size() >=1){
                                         canIMove = true;
                                         System.out.println("the moves are" +aiMoves);
                                           int randomMove = (int) (Math.random()* aiMoves.size());
                                         position AiMove =  aiMoves.get(randomMove);
                                         // System.out.println("fruururuhhtjtj " +  randomMove );

                                         AiPiece.setLocation(AiMove.getX(),AiMove.getY());
                                }






                        }
                     }





            else{
             removeHighlights();
             clicks = 1;}
         }






    }

    public void removeHighlights(){

        removeObjects(getObjects(Highlight.class));

    }







}

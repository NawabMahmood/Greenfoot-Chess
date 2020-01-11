import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class pawn here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pawn extends Chesspiece
{
    boolean firstMove = true;
    boolean firstMoveFalse = true;
    public ArrayList< position >getPossibleMoves(){
        ArrayList<position> PossibleMoves = new ArrayList<position>();
        if(this.getTeam().equals("white")){
         if(getY() == 1){

           System.out.println("it is the first move");
            firstMove = false;

           if(getThing(getX(),getY()+1) == 1){
             PossibleMoves.add( new position(getX(),getY()+1));

           }
           //else if(getThing(getX()-1,getY()+1) == 1&& this)



           if(getThing(getX(),getY()+2) == 1){
            PossibleMoves.add( new position(getX(),getY()+2));
           }

          return PossibleMoves;

         }

         if(getThing(getX(),getY()+1) == 1){
        PossibleMoves.add (new position(getX(),getY()+1));
        }


       }

        if(this.getTeam().equals("black")){
         if(getY() == 6){

           System.out.println("it is the first move");
            firstMove = false;

           if(getThing(getX(),getY()-1) == 1){
             PossibleMoves.add( new position(getX(),getY()-1));

           }



           if(getThing(getX(),getY()-2) == 1){
            PossibleMoves.add( new position(getX(),getY()-2));
           }

          return PossibleMoves;

         }

         if(getThing(getX(),getY()-1) == 1){
        PossibleMoves.add (new position(getX(),getY()-1));
        }


       }














          return PossibleMoves;

    }






























       public Pawn(String p){

        super(p);

      }


}

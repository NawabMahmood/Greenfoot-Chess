import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class knight here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Knight extends Chesspiece
{


    public ArrayList<position> getPossibleMoves(){
         ArrayList<position> PossibleMoves = new ArrayList<position>();
     if(getThing(getX()+1,getY()+2) == 1){
    PossibleMoves.add(new position(getX()+1,getY()+2));
   }
     if(getThing(getX()-1,getY()+2) == 1){
     PossibleMoves.add(new position(getX()-1,getY()+2));
   }
     if(getThing(getX()+1,getY()-2) == 1){
    PossibleMoves.add(new position(getX()+1,getY()-2));
   }
     if(getThing(getX()-1,getY()-2) == 1){
     PossibleMoves.add(new position(getX()-1,getY()-2));
   }
     if(getThing(getX()+2,getY()+1) == 1){
    PossibleMoves.add(new position(getX()+2,getY()+1));
   }
    if(getThing(getX()-2,getY()+1) == 1){
    PossibleMoves.add(new position(getX()-2,getY()+1));
    }
    if(getThing(getX()+2,getY()-1) == 1){
    PossibleMoves.add(new position(getX()+2,getY()-1));
   }
     if(getThing(getX()-2,getY()-1) == 1){
     PossibleMoves.add(new position(getX()-2,getY()-1));
     }
     return PossibleMoves;


  }

    public Knight(String p){

      super(p);

    }



}

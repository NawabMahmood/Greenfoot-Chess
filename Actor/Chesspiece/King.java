import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class king here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class King extends Chesspiece
{
    public ArrayList< position >getPossibleMoves(){
        ArrayList<position> PossibleMoves = new ArrayList<position>();


           if(getThing(getX()+1,getY()) == 1){
           PossibleMoves.add(new position(getX()+1,getY()));
        }
           if(getThing(getX()-1,getY()) == 1){
           PossibleMoves.add(new position(getX()-1,getY()));
        }
           if(getThing(getX(),getY()+1) == 1){
           PossibleMoves.add(new position(getX(),getY()+1));
        }
           if(getThing(getX(),getY()-1) == 1){
           PossibleMoves.add(new position(getX(),getY()-1));
        }
           if(getThing(getX()+1,getY()+1) == 1){
           PossibleMoves.add(new position(getX()+1,getY()+1));
        }
           if(getThing(getX()+1,getY()-1) == 1){
           PossibleMoves.add(new position(getX()+1,getY()-1));
        }
           if(getThing(getX()-1,getY()+1) == 1){
           PossibleMoves.add(new position(getX()-1,getY()+1));
        }
           if(getThing(getX()-1,getY()-1) == 1){
           PossibleMoves.add(new position(getX()-1,getY()-1));
        }
           return PossibleMoves;

    }


       public King(String p){

      super(p);

     }






}

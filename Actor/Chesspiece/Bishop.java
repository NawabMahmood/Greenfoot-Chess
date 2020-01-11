import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class bishop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bishop extends Chesspiece
{
   public ArrayList< position >getPossibleMoves(){
        ArrayList<position> PossibleMoves = new ArrayList<position>();
       for(int p = 1; p<8;p++){
           if(getThing(getX()+p,getY()+p) == 1){
           PossibleMoves.add(new position(getX()+p,getY()+p));

         }
         else{p=10;}

       }
       for(int w = 1; w<8;w++){
           if(getThing(getX()-w,getY()-w) == 1){
           PossibleMoves.add(new position(getX()-w,getY()-w));

         }
         else{w=10;}


       }
       for(int s = 1; s<8;s++){
           if(getThing(getX()+s,getY()-s) == 1){
           PossibleMoves.add(new position(getX()+s,getY()-s));
         }
          else{s=10;}

       }
       for(int c = 1; c<8;c++){
           if(getThing(getX()-c,getY()+c) == 1){
           PossibleMoves.add(new position(getX()-c,getY()+c));
        }
         else{c=10;}

       }

        return PossibleMoves;

     }

      public Bishop(String p){

      super(p);

     }

}

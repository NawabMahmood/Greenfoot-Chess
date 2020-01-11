import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class rook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rook extends Chesspiece
{
      public ArrayList< position >getPossibleMoves(){
        ArrayList<position> PossibleMoves = new ArrayList<position>();

        for(int p = 1; p<8;p++){
           if(getThing(getX()+p,getY()) == 1){
           PossibleMoves.add(new position(getX()+p,getY()));

         }
         else{p=10;}

       }
         for(int p = 1; p<8;p++){
           if(getThing(getX()-p,getY()) == 1){
           PossibleMoves.add(new position(getX()-p,getY()));
         }
          else{p=10;}

       }
       for(int p = 1; p<8;p++){
           if(getThing(getX(),getY()+p) == 1){
           PossibleMoves.add(new position(getX(),getY()+p));
         }
          else{p=10;}

       }
         for(int p = 1; p<8;p++){
           if(getThing(getX(),getY()-p) == 1){
           PossibleMoves.add(new position(getX(),getY()-p));
        }
        else{p=10;}

       }
       return PossibleMoves;

     }

         public Rook(String p){

      super(p);

     }


    }

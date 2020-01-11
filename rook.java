import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class chesspiece here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Chesspiece extends Actor
{
    String team;

    public Chesspiece(String p){

      team = p;
      if(team.equals("black")){setImage(team + this.getClass().getSimpleName() +".gif");}
      if(team.equals("white")){setImage(team + this.getClass().getSimpleName() +".gif");}

    }
    public Chesspiece(){


    }


    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
        ((MyWorld)getWorld()).mouseWasClicked(this);
        }



    }

     public ArrayList<position> getPossibleMoves(){
        ArrayList<position> PossibleMoves = new ArrayList<position>();
        PossibleMoves.add(new position(getX(),getY()));

    return PossibleMoves;


    }

    public int getThing(int x, int y){
        if(getWorld().getObjectsAt(x,y,Chesspiece.class).size() == 0){
           System.out.println("returned 1");
            return 1;
        }

        System.out.println("returned 2");
        return 0;
    }


    public String getTeam(){

        return team;

    }
    public String toString(){
        return team + " " + getClass() +  getX() + "," + getY();
    }

}

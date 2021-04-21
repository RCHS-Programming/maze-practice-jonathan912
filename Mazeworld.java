import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mazeworld here.
 * 
 * @author Jonathan Klayer 
 * @version (a version number or a date)
 */
public class Mazeworld extends World
{

    /**
     * Constructor for objects of class Mazeworld.
     * 
     */
    public Mazeworld()
    {    
        super(800, 600, 1); 
        for(int i = 0; i < 16; i++)
        {
            addObject(new Wall("edge.png"), 25 + 50*i, 12);
        }
         for(int i = 0; i < 16; i++)
        {
            addObject(new Wall("edge.png"), 25 + 50*i, 587);
        }
         for(int i = 0; i < 2; i++)
        {
            addObject(new Wall("edge2.png"), 12, 25 +50*i);
        }
        for(int i = 0; i < 9; i++)
        {
            addObject(new Wall("edge2.png"), 12, 600 - 50*i);
        }
         for(int i = 0; i < 16; i++)
        {
            addObject(new Wall("edge2.png"), 787, 25 +50*i);
        }
        
        
        
        for(int i = 0; i < 8; i++)
        {
            addObject(new Wall("edge.png"), 25 + 50*i, 75);
        }
        
        for(int i = 0; i < 9; i++)
        {
            addObject(new Wall("edge2.png"), 387, 100 +50*i);
        }
        
        for(int i = 0; i < 5; i++)
        {
            addObject(new Wall("edge.png"), 687 - 50*i, 75);
        }
        
        for(int i = 0; i < 3; i++)
        {
            addObject(new Wall("edge2.png"), 474, 100 +50*i);
        }
        
        for(int i = 0; i < 6; i++)
        {
            addObject(new Wall("edge.png"), 351 - 50*i, 212);
        }
        
        for(int i = 0; i < 10; i++)
        {
            addObject(new Wall("edge2.png"), 699, 100 +50*i);
        }
        
        for(int i = 0; i < 3; i++)
        {
            addObject(new Wall("edge.png"), 500 + 50*i, 212);
        }
        
        for(int i = 0; i < 6; i++)
        {
            addObject(new Wall("edge2.png"), 474,300 +50*i);
        }
        
        for(int i = 0; i < 6; i++)
        {
            addObject(new Wall("edge.png"), 365 - 50*i, 512);
        }
        
                for(int i = 0; i < 6; i++)
        {
            addObject(new Wall("edge.png"), 365 - 50*i, 412);
        }
        
        for(int i = 0; i < 6; i++)
        {
            addObject(new Wall("edge.png"), 365 - 50*i, 312);
        }
        
        for(int i = 0; i < 6; i++)
        {
            addObject(new Wall("edge.png"), 25 + 50*i, 462);
        }
        
        for(int i = 0; i < 6; i++)
        {
            addObject(new Wall("edge.png"), 25 + 50*i, 362);
        }
        
        for(int i = 0; i < 6; i++)
        {
            addObject(new Wall("edge.png"), 25 + 50*i, 262);
        }
        
        for(int i = 0; i < 3; i++)
        {
            addObject(new Wall("edge.png"), 490 + 50*i, 287);
        }
        
        for(int i = 0; i < 5; i++)
        {
            addObject(new Wall("edge2.png"), 625, 300 + 50*i);
        }
    }
}

package ComputerScience.Chapter2;
/**
 * Write a description of class RectanglePrinter here.
 * 
 * @author Logan Traffas
 * @version 9/21/2016
 * assignment: 2.4.1
 */
import java.awt.Rectangle;
 
public class RectanglePrinter
{
   public static void main(String[] args)
   {
      Rectangle r1 = new Rectangle(0, 0, 100, 50);
      Rectangle r2 = new Rectangle(0, 0, 100, 50);
      System.out.println(r1);
      System.out.println(r2);
      r2.grow(10,20);
      System.out.println(r2);
   }
}
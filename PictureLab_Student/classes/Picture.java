import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for(Pixel[] rowArray : pixels)
    {
      for(Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }

	public void KeepOnlyBlue()
	{
		Pixel[][] pixels = this.getPixels2D();
		
		for(Pixel[] rowArray : pixels)
		{
			for(Pixel pixelObj : rowArray)
			{
				pixelObj.setRed(0);
				pixelObj.setGreen(0);
			}
		}
		
	}
	
	public void KeepOnlyRed()
	{
		Pixel[][] pixels = this.getPixels2D();
		
		for(Pixel[] rowArray : pixels)
		{
			for(Pixel pixelObj : rowArray)
			{
				pixelObj.setBlue(0);
				pixelObj.setGreen(0);
			}
		}
		
	}
	
	public void Negate()
	{
		
		Pixel[][] pixels = this.getPixels2D();
		
		for(Pixel[] rowArray : pixels)
		{
			for(Pixel pixelObj : rowArray)
			{
				pixelObj.setRed(255-pixelObj.getRed());
				pixelObj.setGreen(255-pixelObj.getGreen());
				pixelObj.setBlue(255-pixelObj.getBlue());
			}
		}
		
		
	}
	
	public void Grayscale()
	{
		
		Pixel[][] pixels = this.getPixels2D();
		
		for(Pixel[] rowArray : pixels)
		{
			for(Pixel pixelObj : rowArray)
			{
				int grayscale = (pixelObj.getRed() +  pixelObj.getGreen() + pixelObj.getBlue()) / 3;
				
				pixelObj.setRed(grayscale);
				pixelObj.setGreen(grayscale);
				pixelObj.setBlue(grayscale);
			}
		}
		
	}
	
	public void FixUnderwater()
	{
		
		Pixel[][] pixels = this.getPixels2D();
		
		for (Pixel[] rowArray : pixels)
		{
			for(Pixel pixelObj : rowArray)
			{
				if(pixelObj.getBlue() < 160 || pixelObj.getRed() > 20)
				{
					int grayscale = (pixelObj.getRed() +  pixelObj.getGreen() + pixelObj.getBlue()) / 3;
					
					pixelObj.setRed(grayscale);
					pixelObj.setGreen(grayscale);
					pixelObj.setBlue(grayscale);
				}	
			}
		}
	}
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void MirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int height = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < height / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][height - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }

	public void MirrorRightToLeft()
	{
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int height = pixels[0].length;
		for (int row = 0; row < pixels.length; row++)
		{
			for (int col = 0; col < height / 2; col++)
			{
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][height - 1 - col];
				leftPixel.setColor(rightPixel.getColor());
			}
		} 
    } 
	
	public void MirrorHorizontal()
	{
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		int height = pixels.length;
		for (int row = 0; row < pixels.length; row++)
		{
			for (int col = 0; col < pixels[0].length; col++)
			{
				topPixel = pixels[row][col];
				bottomPixel = pixels[height - 1 - row][col];
				bottomPixel.setColor(topPixel.getColor());
			}
		} 
	}
	
	public void MirrorBottomToTop()
	{
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		int height = pixels.length;
		for (int row = 0; row < pixels.length; row++)
		{
			for (int col = 0; col < pixels[0].length; col++)
			{
				topPixel = pixels[row][col];
				bottomPixel = pixels[height - 1 - row][col];
				topPixel.setColor(bottomPixel.getColor());
			}
		} 
	}
  
  /** Mirror just part of a picture of a temple */
  public void MirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
		
		count = count + 1;
      }
    }
	
	System.out.println(count);
	
  }
  
	public void MirrorArms()
	{
		
		int mirrorPoint = 200;
		Pixel topPixel = null;
		Pixel bottomPixel = null;

		Pixel[][] pixels = this.getPixels2D();
    

		for (int row = 162; row < 200; row++)
		{
		// loop from 13 to just before the mirror point
			for (int col = 100; col < 300; col++)
			{
				
				topPixel = pixels[row][col];      
				bottomPixel = pixels[mirrorPoint + mirrorPoint - row][col];
				bottomPixel.setColor(topPixel.getColor());
			}
		}
	}
	
	public void MirrorGull()
	{
		
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		
		Pixel[][] pixels = this.getPixels2D();
		
		for(int row = 230; row < 330; row++)
		{
			for(int col = 230; col <350; col++)
			{
				
				leftPixel = pixels[row][col];
				rightPixel = pixels[row + 20][col + 180];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
    public void copy2(Picture fromPic, int startRow, int startCol, int endRow, int endCol)
	{
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		
		for (int fromRow = 0, toRow = startRow; fromRow < endRow && toRow < toPixels.length; fromRow++, toRow++)	
		{
			for (int fromCol = 0, toCol = startCol; fromCol < endCol && toCol < toPixels[0].length; fromCol++, toCol++)
			{
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
      
    }   
  
  

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy2(flower2,100,0,70,70);
    this.copy2(flower1,200,0,70,70);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.MirrorVertical();
    this.write("collage.jpg");
  }
  
	public void MyCollage()
	{
		Picture snake = new Picture("snake.jpg");
		this.copy2(snake,80,0,100,100);
		Picture nobluesnake = new Picture("snake.jpg");
		nobluesnake.zeroBlue();
		this.copy2(nobluesnake,180,0,100,100);
		Picture negasnake = new Picture("snake.jpg");
		negasnake.Negate();
		this.copy2(negasnake,280,0,100,100);
		Picture weirdsnake = new Picture("snake.jpg");
		weirdsnake.KeepOnlyRed();
		this.copy2(weirdsnake,150,120,194,259);
		//Picture bluesnake = new Picture("snake.jpg");
		//bluesnake.KeepOnlyBlue();
		//this.copy2(bluesnake,180,200,180,180);
		this.MirrorVertical();
		this.write("collage.jpg");
		
	}
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
	public void edgeDetection(int edgeDist)
	{
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color rightColor = null;
		for(int row = 0; row < pixels.length; row++)
		{
			for(int col = 0; col < pixels[0].length-1; col++)
			{
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][col+1];
				rightColor = rightPixel.getColor();
				if(leftPixel.colorDistance(rightColor) > edgeDist)
				{
					leftPixel.setColor(Color.BLACK);
				}
				else
				{
					leftPixel.setColor(Color.WHITE);
				}
			}
		}
    }
	
	public void edgeDetection2(int edgeDist)
	{
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color bottomColor = null;
		for(int row = 0; row < pixels.length-1; row++)
		{
			for(int col = 0; col < pixels[0].length; col++)
			{
				topPixel = pixels[row][col];
				bottomPixel = pixels[row+1][col];
				bottomColor = bottomPixel.getColor();
				if(topPixel.colorDistance(bottomColor) > edgeDist)
				{
					topPixel.setColor(Color.BLACK);
				}
				else
				{	
					topPixel.setColor(Color.WHITE);
				}
			}
		}
	}
  
	public void edgeDetection3(int edgeDist)
	{
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color rightColor = null;
		
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		//Pixel[][] pixels = this.getPixels2D();
		Color bottomColor = null;
		for(int row = 0; row < pixels.length-1; row++)
		{
			for(int col = 0; col < pixels[0].length-1; col++)
			{
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][col+1];
				rightColor = rightPixel.getColor();
				
				topPixel = pixels[row][col];
				bottomPixel = pixels[row+1][col];
				bottomColor = bottomPixel.getColor();
				if(topPixel.colorDistance(bottomColor) > edgeDist && leftPixel.colorDistance(rightColor) > edgeDist)
				{
					topPixel.setColor(Color.BLACK);
					leftPixel.setColor(Color.BLACK);
				}
				else
				{	
					topPixel.setColor(Color.WHITE);
					leftPixel.setColor(Color.WHITE);
				}
			}
		}
	}
	
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    //Picture snake = new Picture("snake.jpg");
    //snake.explore();
    //snake.zeroBlue();
    //snake.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this

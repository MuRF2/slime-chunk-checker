package code;
import java.util.Random;

/**
 * 
 * https://minecraft.gamepedia.com/Slime
 *
 */
public class checkSlimechunk {
	
	private boolean debugBoolean;
	
	private long seed;
	private int xPosition;
	private int zPosition;
	
	public checkSlimechunk() {
		this.setDebugBoolean(false);
	}
		
	public void checkChunk() {
		Random rnd = new Random(
                seed +
                (int) (xPosition * xPosition * 0x4c1906) +
                (int) (xPosition * 0x5ac0db) +
                (int) (zPosition * zPosition) * 0x4307a7L +
                (int) (zPosition * 0x5f24f) ^ 0x3ad8025fL
        );
		setDebugBoolean(rnd.nextInt(10) == 0);
	}

	public boolean isDebugBoolean() {
		return debugBoolean;
	}

	public void setDebugBoolean(boolean debugBoolean) {
		this.debugBoolean = debugBoolean;
	}

	public long getSeed() {
		return seed;
	}

	public void setSeed(long seed) {
		this.seed = seed;
	}

	public int getxPosition() {
		return xPosition;
	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getzPosition() {
		return zPosition;
	}

	public void setzPosition(int yPosition) {
		this.zPosition = yPosition;
	}
	

}

/*import java.util.Random; 

public class checkSlimechunk{ 

    public static void main(String args[]) 
    { 
        // the seed from /seed as a 64bit long literal
        long seed = 12345L;
        int xPosition = 123;
        int zPosition = 456;

        Random rnd = new Random(
                seed +
                (int) (xPosition * xPosition * 0x4c1906) +
                (int) (xPosition * 0x5ac0db) +
                (int) (zPosition * zPosition) * 0x4307a7L +
                (int) (zPosition * 0x5f24f) ^ 0x3ad8025fL
        );

        System.out.println(rnd.nextInt(10) == 0);
    } 
}
*/
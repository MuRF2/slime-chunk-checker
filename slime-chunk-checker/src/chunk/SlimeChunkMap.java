package chunk;

public class SlimeChunkMap {
	
	private SlimeChunk[][] slimeChunkArray = new SlimeChunk[1][1];
	
	
	/*************************************************************************
	*                                                                        *
	*                            Static Methods                              *
	*                                                                        *
	*************************************************************************/ 
		
	/**
	 *  A method, which accepts the parameters width and height and returns a 2D
     *  array of SlimeChunk of the corresponding size. It should put a new SlimeChunk 
     *  instance into each field in the array.
	 * @param numRow
	 * @param numColumn
	 * @return SlimeChunk array
	 */
	private static SlimeChunk[][] buildSlimeChunkArray(int numRow, int numColumn)
	{
		SlimeChunk[][] chunkArray = new SlimeChunk[numRow][numColumn];
		
		for(int rowIndex = 0; rowIndex < chunkArray.length ; rowIndex++)
		{
			for(int columnIndex = 0; columnIndex < chunkArray[rowIndex].length; columnIndex++)
			{
				SlimeChunk Schunk= new SlimeChunk();
				chunkArray[rowIndex][columnIndex] = Schunk;
			}
		}
		return chunkArray;
	}
	
    /*************************************************************************
    *                                                                        *
    *                            Constructors                                *
    *                                                                        *
    *************************************************************************/ 
	
	public SlimeChunkMap(int sizeR, int sizeC)
	{
		this.slimeChunkArray = buildSlimeChunkArray(sizeR, sizeC);
	}
}

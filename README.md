# Slime Chunk Checker for Mincraft 1.16+ - GUI

In Java Edition, "slime chunks" are determined pseudo-randomly by combining their chunk coordinates with the seed of the world. Using the chunk coordinates and the seed, a random number between 0 and 9 is generated. If that number is 0, the chunk can spawn slimes. World coordinates can be converted to chunk coordinates due to dividing by 16 and round down.<br>
This tool checks if the specified chunk can spawn slimes using the world seed and the specific chunk coordinates. The inplemented method can be sighted at the minecraft wiki https://minecraft.gamepedia.com/Slime. </br>

The easiest way to get the tool is to download the runnable jar.  This can be executed directly under windows. Under Linux you currently have to start the program via the terminal (java -jar <path/filename>). At least Java jre 1.7 must be installed. 

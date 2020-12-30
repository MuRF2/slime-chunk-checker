# Slime Chunk Checker for Mincraft 1.16+

In Java Edition, "slime chunks" are determined pseudo-randomly by combining their chunk coordinates with the seed of the world. Using the chunk coordinates and the seed, a random number between 0 and 9 is generated. If that number is 0, the chunk can spawn slimes. World coordinates can be converted to chunk coordinates due to dividing by 16 and round down.<br>
This tool checks if the specified chunk can spawn slimes using the world seed and the specific chunk coordinates. The inplemented method can be sighted at the minecraft wiki https://minecraft.gamepedia.com/Slime </br>

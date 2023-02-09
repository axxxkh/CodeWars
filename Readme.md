# Code Wars

My solutions for some code wars katas.

1. Valid Parentheses

   Write a function that takes a string of parentheses, and determines if the order of the parentheses is valid. The
   function should return true if the string is valid, and false if it's invalid.
   https://www.codewars.com/kata/52774a314c2333f0a7000688


2. ValidBraces

   Write a function that takes a string of braces, and determines if the order of the braces is valid. It should return
   true if the string is valid, and false if it's invalid.
   https://www.codewars.com/kata/5277c8a221e209d3f6000b56


3. Weight for weight

   My friend John and I are members of the "Fat to Fit Club (FFC)". John is worried because each month a list with the
   weights of members is published and each month he is the last on the list which means he is the heaviest.

   I am the one who establishes the list so I told him: "Don't worry any more, I will modify the order of the list". It
   was decided to attribute a "weight" to numbers. The weight of a number will be from now on the sum of its digits.

   https://www.codewars.com/kata/55c6126177c9441a570000cc


4. Help your granny

   Your granny, who lives in town X0, has friends. These friends are given in an array, for example: array of friends
   is ["A1", "A2", "A3", "A4", "A5"].

   The order of friends in this array must not be changed since this order gives the order in which they will be
   visited.

   Friends inhabit towns and you get an array with friends and their towns (or an associative array), for
   example: [["A1", "X1"], ["A2", "X2"], ["A3", "X3"], ["A4", "X4"]] which means A1 is in town X1, A2 in town X2... It
   can happen that we do not know the town of one of the friends hence it will not be visited.

   Your granny wants to visit her friends and to know approximately how many miles she will have to travel. You will
   make the circuit that permits her to visit her friends. For example here the circuit will be:X0, X1, X2, X3, X4, X0
   and you will compute approximately the total distance X0X1 + X1X2 + .. + X4X0.

   https://www.codewars.com/kata/5536a85b6ed4ee5a78000035

5. Tank Truck To introduce the problem think to my neighbor who drives a tanker truck. The level indicator is down and
   he is worried because he does not know if he will be able to make deliveries. We put the truck on a horizontal ground
   and measured the height of the liquid in the tank.

   Fortunately the tank is a perfect cylinder and the vertical walls on each end are flat. The height of the remaining
   liquid is h, the diameter of the cylinder base is d, the total volume is vt (h, d, vt are positive or null integers).
   You can assume that h <= d.

   Could you calculate the remaining volume of the liquid? Your function tankvol(h, d, vt) returns an integer which is
   the truncated result (e.g floor) of your float calculation.

   https://www.codewars.com/kata/55f3da49e83ca1ddae0000ad
6. Pick peaks In this kata, you will write a function that returns the positions and the values of the "peaks" (or local
   maxima) of a numeric array.

   For example, the array arr = [0, 1, 2, 5, 1, 0] has a peak at position 3 with a value of 5 (since arr[3] equals 5).

   The output will be returned as an object with two properties: pos and peaks. Both of these properties should be
   arrays. If there is no peak in the given array, then the output should be {pos: [], peaks: []}.

   Example: pickPeaks([3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3]) should return {pos: [3, 7], peaks: [6, 3]} (or equivalent in
   other languages)

   All input arrays will be valid integer arrays (although it could still be empty), so you won't need to validate the
   input.

   The first and last elements of the array will not be considered as peaks (in the context of a mathematical function,
   we don't know what is after and before and therefore, we don't know if it is a peak or not).

   Also, beware of plateaus !!! [1, 2, 2, 2, 1] has a peak while [1, 2, 2, 2, 3] and [1, 2, 2, 2, 2] do not. In case of
   a plateau-peak, please only return the position and value of the beginning of the plateau. For example:
   pickPeaks([1, 2, 2, 2, 1]) returns {pos: [1], peaks: [2]} (or equivalent in other languages)

   https://www.codewars.com/kata/5279f6fe5ab7f447890006a7

7. Checking Groups In English and programming, groups can be made using symbols such as () and {} that change meaning.
   However, these groups must be closed in the correct order to maintain correct syntax.

   Your job in this kata will be to make a program that checks a string for correct grouping.
   https://www.codewars.com/kata/54b80308488cb6cd31000161

8. Directions Reduction 
   Once upon a time, on a way through the old wild mountainous west,… … a man was given directions
   to go from one point to another. The directions were "NORTH", "SOUTH", "WEST", "EAST". Clearly "NORTH" and "SOUTH"
   are opposite, "WEST" and "EAST" too. Going to one direction and coming back the opposite direction right away is a needless effort. Since this is the wild west, with dreadful weather and not much water, it's important to save yourself some energy, otherwise you might die of thirst! How I crossed a mountainous desert the smart way.

9. Bouncing Ball
   A child is playing with a ball on the nth floor of a tall building. The height of this floor, h, is known. He drops the ball out of the window. The ball bounces (for example), to two-thirds of its height (a bounce of 0.66). His mother looks out of a window 1.5 meters from the ground.

   How many times will the mother see the ball pass in front of her window (including when it's falling and bouncing?

   Three conditions must be met for a valid experiment: 
Float parameter "h" in meters must be greater than 0
Float parameter "bounce" must be greater than 0 and less than 1
Float parameter "window" must be less than h.
If all three conditions above are fulfilled, return a positive integer, otherwise return -1.

   https://www.codewars.com/kata/5544c7a5cb454edb3c000047
10. Snail sort 

   Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.
   https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1

11. Factorial Decomposition 
   The aim of the kata is to decompose n! (factorial n) into its prime factors.
    https://www.codewars.com/kata/5a045fee46d843effa000070
   
12. Battlefield ship validator
    Write a method that takes a field for well-known board game "Battleship" as an argument and returns true if it has a valid disposition of ships, false otherwise. Argument is guaranteed to be 10*10 two-dimension array. Elements in the array are numbers, 0 if the cell is free and 1 if occupied by ship.

Battleship (also Battleships or Sea Battle) is a guessing game for two players. Each player has a 10x10 grid containing several "ships" and objective is to destroy enemy's forces by targetting individual cells on his field. The ship occupies one or more cells in the grid. Size and number of ships may differ from version to version. In this kata we will use Soviet/Russian version of the game.
https://www.codewars.com/kata/52bb6539a4cf1b12d90005b7

13. Sum Strings
    Given the string representations of two integers, return the string representation of the sum of those integers.
    https://www.codewars.com/kata/5324945e2ece5e1f32000370
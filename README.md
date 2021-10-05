# Student_Enrollement_Function
This is a small demo of the enrollement functionality with some validation checks. This function could be extended in future work!
Basically the requirements were as follows: 

1. Allow maximum number of students to be seated, spots are chosen randomly. Any spot which has been occupied shouldn't be chosen again by the system (No overriding just like plane's reservation system) 
Explanation: I used an Arraylist to implement this requirement where the array list elements (seats) were chosen randomly after shuffling them then being passed from the Model to the Controller to be used and in the mean time it is removed from the array list to guarantee no overriding.

2. Allow user to choose any color but not a color that was already chosen or White. 

3. Allow user to enroll students with names only more than 3 characters. The function also checks for spaces within the 3 characters to eliminate tricks. 

4. A notification message is needed when all seats are occupied and no overriding should happen. 

5. Creating an adequate initializing function

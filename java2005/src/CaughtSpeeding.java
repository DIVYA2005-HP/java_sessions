/*You are driving a little too fast, and a police officer stops you. 
Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket.
 If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1.
  If speed is 81 or more, the result is 2. 
  Unless it is your birthday -- on that day, your speed can be 5 higher in all cases. */



public class CaughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
                  speed -= 5;
              }
      
              // Determine the result based on speed
              if (speed <= 60) {
                  return 0; // No ticket
              } else if (speed <= 80) {
                  return 1; // Small ticket
              } else {
                  return 2; // Big ticket
              }
          }
      
         
      
      
      
      
    
    
}

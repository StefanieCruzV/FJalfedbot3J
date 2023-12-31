import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        // String named = String.format("Hello, %s Lovely to see you.",name); 
        // System.out.println(named); 
        return String.format("Hello, %s Lovely to see you.",name);
    }

    public String guestGreeting(String name,String dayPeriod) {
        Date date = new Date();
        return String.format("Good %s , %s. Lovely to see you.",dayPeriod,name);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
          Date date = new Date();
        return  "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if(conversation.indexOf("Alexis") == 0) {
        return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }else if (conversation.indexOf("Alfred") > 1){
            return "At your service. As you wish, naturally.";
        }
        return "Right. And with that I shall retire." ;
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}
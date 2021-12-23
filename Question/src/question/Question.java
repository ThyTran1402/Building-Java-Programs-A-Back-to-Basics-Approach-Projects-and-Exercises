/**
   A question with a text and an answer
 */
package question;
public class Question 
{
    private String text;
    private String answer;
    /**
       Constructs a question with empty question and answer.
     */  
    public Question()
    {
        text = "";
        answer = "";
    }
    /**
       Sets the question text
       @param questionTex the text of this question
     */
    public void setText(String questionText)
    {
        text = questionText;
    }
    
    /**
       Set the answer for this question.
       @param corectResponse the answer
     */
    public void setAnser(String correctResponse)
    {
        answer = correctResponse;
    }
    
    /**
       Checks a given response for correctness.
       @param response the response to check
       @return true of the response was correct, false otherwise
     */
    public boolean checkAnswer(String response)
    {
        return response.equals(answer);
    }
    
    /**
       Displays this question
     */
    public void display()
    {
        System.out.println(text);
    }
    
}

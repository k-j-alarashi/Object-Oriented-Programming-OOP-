/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg8;

/**
 *
 * @author lab
 */
public class ChoiceQuestion extends Question {
    private String[] choices;
    int i ;

    public ChoiceQuestion() {
        super();
        choices = new String[4];
        i = 0 ;
    }
    
    public void addChoice(String answer , boolean correct)
    {
        String correctChoice = ""+(i+1);
        choices[i] = answer ;
        if(correct){
            setAnswer(correctChoice);
        }
        i++;
    }
    
    @Override
    public void display(){
        super.display();
        for (int j = 0; j < choices.length; j++) {
            System.out.println((j+1)+" ) "+choices[j]);
            
        }
    }
    
}

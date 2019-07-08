package mixis;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Controller {

    StringBuilder inputOne = new StringBuilder(0);
    StringBuilder inputTwo = new StringBuilder(0);
    boolean multiply = false;
    boolean subtract = false;
    boolean equals = false;
    boolean addition = false;
    boolean division = false;
    boolean decimal = false;

    @FXML
    public Button oneButton;
    public Button twoButton;
    public Button threeButton;
    public Button fourButton;
    public Button fiveButton;
    public Button sixButton;
    public Button sevenButton;
    public Button eightButton;
    public Button nineButton;
    public Button zeroButton;
    public Label displayLabel;
    public Button deleteButton;
    public Button divisionButton;
    public Button multiplyButton;
    public Button minusButton;
    public Button additionButton;
    public Button equalsButton;
    public Button decimalButton;


    public void numberButtonPress(Event e)
    {
        if(e.getSource() == oneButton)
        {
            inputOne.append('1');
            displayLabel.setText((inputOne.toString()));
        }
        else if(e.getSource() == twoButton)
        {
            inputOne.append('2');
            displayLabel.setText((inputOne.toString()));
        }
        else if(e.getSource() == threeButton)
        {
            inputOne.append('3');
            displayLabel.setText((inputOne.toString()));
        }
        else if(e.getSource() == fourButton)
        {
            inputOne.append('4');
            displayLabel.setText((inputOne.toString()));
        }
        else if(e.getSource() == fiveButton)
        {
            inputOne.append('5');
            displayLabel.setText((inputOne.toString()));
        }
        else if(e.getSource() == sixButton)
        {
            inputOne.append('6');
            displayLabel.setText((inputOne.toString()));
        }
        else if(e.getSource() == sevenButton)
        {
            inputOne.append('7');
            displayLabel.setText((inputOne.toString()));
        }
        else if(e.getSource() == eightButton)
        {
            inputOne.append('8');
            displayLabel.setText((inputOne.toString()));
        }
        else if(e.getSource() == nineButton)
        {
            inputOne.append('9');
            displayLabel.setText((inputOne.toString()));
        }
        else if(e.getSource() == zeroButton)
        {
            inputOne.append('0');
            displayLabel.setText((inputOne.toString()));
        }
        else if(e.getSource() == decimalButton && decimal == false)
        {
            inputOne.append('.');
            displayLabel.setText((inputOne.toString()));
            decimal = true;
        }
    }


    @FXML
    public void deletePressed(Event e)
    {
        if(e.getSource() == deleteButton)
        {
            inputOne.setLength(0);
            inputTwo.setLength(0);
            resetSelectedOperation();
            displayLabel.setText("0");
        }
    }

    @FXML
    public void selectedOperation(Event e)
    {
        if(e.getSource() == divisionButton)
        {
            division = true;
        }
        if(e.getSource() == multiplyButton)
        {
            multiply = true;
        }
        if(e.getSource() == minusButton)
        {
            subtract = true;
        }
        if(e.getSource() == additionButton)
        {
            addition = true;
        }
    }

    public void resetSelectedOperation()
    {
        multiply = false;
        subtract = false;
        equals = false;
        addition = false;
        division = false;
        decimal = false;
    }



}

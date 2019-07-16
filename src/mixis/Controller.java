package mixis;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.lang.String;


public class Controller {

    StringBuilder firstOperand = new StringBuilder(0);
    StringBuilder secondOperand = new StringBuilder(0);
    StringBuilder tempOperand = new StringBuilder(0);
    boolean isFirstOperand = true;

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


    public void numberButtonPress(Event e) {
        if (e.getSource() == oneButton) {
            tempOperand.append('1');
            displayLabel.setText((tempOperand.toString()));
        } else if (e.getSource() == twoButton) {
            tempOperand.append('2');
            displayLabel.setText((tempOperand.toString()));
        } else if (e.getSource() == threeButton) {
            tempOperand.append('3');
            displayLabel.setText((tempOperand.toString()));
        } else if (e.getSource() == fourButton) {
            tempOperand.append('4');
            displayLabel.setText((tempOperand.toString()));
        } else if (e.getSource() == fiveButton) {
            tempOperand.append('5');
            displayLabel.setText((tempOperand.toString()));
        } else if (e.getSource() == sixButton) {
            tempOperand.append('6');
            displayLabel.setText((tempOperand.toString()));
        } else if (e.getSource() == sevenButton) {
            tempOperand.append('7');
            displayLabel.setText((tempOperand.toString()));
        } else if (e.getSource() == eightButton) {
            tempOperand.append('8');
            displayLabel.setText((tempOperand.toString()));
        } else if (e.getSource() == nineButton) {
            tempOperand.append('9');
            displayLabel.setText((tempOperand.toString()));
        } else if (e.getSource() == zeroButton) {
            tempOperand.append('0');
            displayLabel.setText((tempOperand.toString()));
        } else if (e.getSource() == decimalButton && !decimal) {
            tempOperand.append('.');
            displayLabel.setText((tempOperand.toString()));
            decimal = true;
        }

        if (isFirstOperand) {
            firstOperand = tempOperand;
        }
        else
        {
            secondOperand = tempOperand;
        }
        tempOperand.setLength(0);
    }


    @FXML
    public void deletePressed(Event e)
    {
        if(e.getSource() == deleteButton)
        {
            isFirstOperand = true;
            firstOperand.setLength(0);
            secondOperand.setLength(0);
            resetSelectedOperator();
            displayLabel.setText("0");
        }
    }

    @FXML
    public void selectedOperator(Event e)
    {
        resetSelectedOperator();
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
        isFirstOperand = false;
    }

    @FXML
    public void resetSelectedOperator()
    {
        multiply = false;
        subtract = false;
        equals = false;
        addition = false;
        division = false;
        decimal = false;
    }

    @FXML
    public void equals()
    {
        Double first = Double.parseDouble(firstOperand.toString());
        Double second = Double.parseDouble(secondOperand.toString());
        StringBuilder temp = new StringBuilder();
        if(multiply)
        {
            temp.append(first * second);
        }
        else if(subtract)
        {
            temp.append(first - second);
        }
        else if(addition)
        {
            temp.append(first + second);
        }
        else if(division)
        {
            temp.append(first / second);
        }
        else
        {
            System.out.println("equals error");
        }
        displayLabel.setText(temp.toString());
    }


}

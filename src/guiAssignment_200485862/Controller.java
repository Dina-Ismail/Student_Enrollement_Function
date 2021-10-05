package guiAssignment_200485862;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.Locale;

public class Controller {

    Model m = new Model();

    @FXML
    private Circle circle11;

    @FXML
    private Circle circle13;

    @FXML
    private Circle circle12;

    @FXML
    private Circle circle21;

    @FXML
    private Circle circle23;

    @FXML
    private Circle circle22;

    @FXML
    private Circle circle31;

    @FXML
    private Circle circle33;

    @FXML
    private Circle circle32;

    @FXML
    private ColorPicker txtStudentColor;

    @FXML
    private Label label11;

    @FXML
    private Label label13;

    @FXML
    private Label label12;

    @FXML
    private Label label21;

    @FXML
    private Label label23;

    @FXML
    private Label label22;

    @FXML
    private Label label31;

    @FXML
    private Label label33;

    @FXML
    private Label label32;

    @FXML
    private TextField txtStudentName;

    @FXML
    private Label lbError;

    @FXML
    void onButtonClick(ActionEvent event) { // when user clicks on Add Student button
            System.out.println("you clicked on the button");

            if(Model.seats.size()==0) // checking if all seats are occupied
            {
                lbError.setVisible(true);
                lbError.setText("Classroom has reached it's maximum Capacity");
            }
            else{
                if(!m.verifyNameLength(txtStudentName.getText())) //checking the length of student name
                {
                    lbError.setVisible(true);
                    lbError.setText("Student name has to be 3 letters at least!");
                }
                //check if student name is already entered
                else if (txtStudentName.getText().toLowerCase().trim().equals(label11.getText().toLowerCase().trim()) || txtStudentName.getText().toLowerCase().trim().equals(label12.getText().toLowerCase().trim()) || txtStudentName.getText().toLowerCase().trim().equals(label13.getText().toLowerCase().trim()) ||
                        txtStudentName.getText().toLowerCase().trim().equals(label21.getText().toLowerCase().trim()) || txtStudentName.getText().toLowerCase().trim().equals(label22.getText().toLowerCase().trim()) || txtStudentName.getText().toLowerCase().trim().equals(label23.getText().toLowerCase().trim()) ||
                        txtStudentName.getText().toLowerCase().trim().equals(label31.getText().toLowerCase().trim()) || txtStudentName.getText().toLowerCase().trim().equals(label32.getText().toLowerCase().trim()) || txtStudentName.getText().toLowerCase().trim().equals(label33.getText().toLowerCase().trim()))
                {
                    lbError.setVisible(true);
                    lbError.setText("Student has already been enrolled!");
                }
                //check if color entered by user is WHITE
                else if (!m.verifyColor(txtStudentColor.getValue().toString()))
                {
                    lbError.setVisible(true);
                    lbError.setText("Please Choose another color other than WHITE");

                } // check if color is already entered
                else if (txtStudentColor.getValue().equals(circle11.getFill()) || txtStudentColor.getValue().equals(circle12.getFill()) || txtStudentColor.getValue().equals(circle13.getFill()) ||
                        txtStudentColor.getValue().equals(circle21.getFill()) || txtStudentColor.getValue().equals(circle22.getFill()) || txtStudentColor.getValue().equals(circle23.getFill()) ||
                        txtStudentColor.getValue().equals(circle31.getFill()) || txtStudentColor.getValue().equals(circle32.getFill()) || txtStudentColor.getValue().equals(circle33.getFill()))
                {
                    lbError.setVisible(true);
                    lbError.setText("This color has already been used");
                } else {
                    //if passed all the verifications the following code runs
                    lbError.setVisible(false);
                    m.setStudentName(txtStudentName.getText());
                    m.setStudentColor(txtStudentColor.getValue().toString());
                    String node = m.allocateSeat(); //here the node is the random seat chosen from Model class

                    //here allocating the right seat according to the node received from the Model class
                    if ((node.equals("label11"))) {
                        System.out.println(node);
                        label11.setText(m.getStudentName());
                        circle11.setFill(Paint.valueOf(m.getStudentColor()));
                    } else if (node.equals("label12")) {
                        System.out.println(node);
                        label12.setText(m.getStudentName());
                        circle12.setFill(Paint.valueOf(m.getStudentColor()));
                    } else if (node.equals("label13")) {
                        System.out.println(node);
                        label13.setText(m.getStudentName());
                        circle13.setFill(Paint.valueOf(m.getStudentColor()));

                    } else if (node.equals("label21")) {
                        System.out.println(node);
                        label21.setText(m.getStudentName());
                        circle21.setFill(Paint.valueOf(m.getStudentColor()));
                    } else if (node.equals("label22")) {
                        System.out.println(node);
                        label22.setText(m.getStudentName());
                        circle22.setFill(Paint.valueOf(m.getStudentColor()));
                    } else if (node.equals("label23")) {
                        System.out.println(node);
                        label23.setText(m.getStudentName());
                        circle23.setFill(Paint.valueOf(m.getStudentColor()));
                    } else if (node.equals("label31")) {
                        System.out.println(node);
                        label31.setText(m.getStudentName());
                        circle31.setFill(Paint.valueOf(m.getStudentColor()));
                    } else if (node.equals("label32")) {
                        System.out.println(node);
                        label32.setText(m.getStudentName());
                        circle32.setFill(Paint.valueOf(m.getStudentColor()));
                    } else if (node.equals("label33")) {
                        System.out.println(node);
                        label33.setText(m.getStudentName());
                        circle33.setFill(Paint.valueOf(m.getStudentColor()));
                    } else {
                        System.out.println("I'm out here" + node);
                    }
                }
                //returning everything back to received new entry
                    txtStudentColor.setValue(Color.WHITE);
                    txtStudentName.setText("");
                }

        }

    @FXML
    void initialize(){ // when stage loads
        label11.setText("");
        label12.setText("");
        label13.setText("");
        label21.setText("");
        label22.setText("");
        label23.setText("");
        label31.setText("");
        label32.setText("");
        label33.setText("");
        lbError.setVisible(false);
        Model.createArray();
    }

}

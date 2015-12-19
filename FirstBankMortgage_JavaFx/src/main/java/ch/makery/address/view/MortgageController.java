package ch.makery.address.view;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.UUID;

import base.RateDAL;
import ch.makery.address.MainApp;
import ch.makery.address.model.Rate;



public class MortgageController {


    // Reference to the main application.
    private MainApp mainApp;

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public MortgageController() {
    }
    	@FXML
    	private Label incomeLabel = new Label();
    	@FXML
    	private Label expensesLabel = new Label();
    	@FXML
    	private Label creditScoreLabel = new Label();
    	@FXML
    	private Label houseCostLabel = new Label();
    	@FXML
    	private Label termLabel = new Label();
    	@FXML
    	private TextField incomeTextField = new TextField();
    	@FXML
    	private TextField expensesTextField = new TextField();
    	@FXML
    	private TextField creditScoreTextField = new TextField();
    	@FXML
    	private TextField houseCostTextField = new TextField();
    	@FXML
    	private TextField termTextField = new TextField();  
    	@FXML
    	private Label mpLabel = new Label();
    	@FXML
    	private Label bLabel = new Label();



    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    	

    }

    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
    @FXML
    public void MortgageCalculater(){

 	   double cridetScore = Double.parseDouble(creditScoreTextField.getText());
 	   double tearm = Double.parseDouble(termTextField.getText());
 	   double houseCost = Double.parseDouble(houseCostTextField.getText());
 	   double i = Double.parseDouble(incomeTextField.getText());
 	   double e = Double.parseDouble(expensesTextField.getText());
  
 	   double monthlyPayment = Rate.getPayment(cridetScore, tearm, houseCost);
 	   
 	   boolean monthlyPaymentOK = true;
 	   if ((monthlyPayment >= (i * .36)) || (monthlyPayment >= ((i + e) * .28))){
 		   monthlyPaymentOK = false;
 	   }

 	   mpLabel.setText("monthly paymetnt" + monthlyPayment);
 	   String can_cant = null;
 	   if (monthlyPaymentOK == false){
 		   can_cant = "This house is too much for you";
 	   }else{

 	   }
 	   bLabel.setText(can_cant);
    }
   
}
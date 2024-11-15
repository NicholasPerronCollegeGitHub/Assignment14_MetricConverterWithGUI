
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MetricConverterController {
    
    @FXML private Button op1a;
    @FXML private Button op1b;
    @FXML private Button op2a;
    @FXML private Button op2b;
    @FXML private Button op3a;
    @FXML private Button op3b;
    @FXML private Button op4a;
    @FXML private Button op4b;
    @FXML private Button op5a;
    @FXML private Button op5b;
    @FXML private Button op6a;
    @FXML private Button op6b;
    @FXML private Button op7a;
    @FXML private Button op7b;
    @FXML private Button op8a;
    @FXML private Button op8b;
    @FXML private Button op9a;
    @FXML private Button op9b;
    @FXML private Button op10a;
    @FXML private Button op10b;
    @FXML private Button op11a;
    @FXML private Button op11b;
    @FXML private Button op12a;
    @FXML private Button op12b;
    @FXML private Button op13a;
    @FXML private Button op13b;

    @FXML private Button Massbtn;
    @FXML private Button Lengthbtn;
    @FXML private Button Tempbtn;
    @FXML private Button Volbtn;
    @FXML private Button Spdbtn;

    @FXML private TextField inputField;
    @FXML private Button convert;
    @FXML private Label outputText;

    private int mode = 0;
    private double input = 0.00;
    private double factora = 1.00;
    private double factorb = 1.00;
    private double output = 0.00;

    private void btnresetA(){
        if(mode == 1){
            op1a.setDisable(false);
            op2a.setDisable(false);
            op3a.setDisable(false);
            op4a.setDisable(false);
            op5a.setDisable(false);
            op6a.setDisable(true);
            op7a.setDisable(true);
            op8a.setDisable(true);
            op9a.setDisable(true);
            op10a.setDisable(true);
            op11a.setDisable(true);
            op12a.setDisable(true);
            op13a.setDisable(true);
        }else if(mode == 2){
            op1a.setDisable(false);
            op2a.setDisable(false);
            op3a.setDisable(false);
            op4a.setDisable(false);
            op5a.setDisable(false);
            op6a.setDisable(false);
            op7a.setDisable(false);
            op8a.setDisable(false);
            op9a.setDisable(true);
            op10a.setDisable(true);
            op11a.setDisable(true);
            op12a.setDisable(true);
            op13a.setDisable(true);
        }else if (mode == 3){
            op1a.setDisable(false);
            op2a.setDisable(false);
            op3a.setDisable(false);
            op4a.setDisable(true);
            op5a.setDisable(true);
            op6a.setDisable(true);
            op7a.setDisable(true);
            op8a.setDisable(true);
            op9a.setDisable(true);
            op10a.setDisable(true);
            op11a.setDisable(true);
            op12a.setDisable(true);
            op13a.setDisable(true);
        }else if (mode == 4){
            op1a.setDisable(false);
            op2a.setDisable(false);
            op3a.setDisable(false);
            op4a.setDisable(false);
            op5a.setDisable(false);
            op6a.setDisable(false);
            op7a.setDisable(false);
            op8a.setDisable(false);
            op9a.setDisable(false);
            op10a.setDisable(false);
            op11a.setDisable(false);
            op12a.setDisable(false);
            op13a.setDisable(false);

        }else if (mode == 5){
            op1a.setDisable(false);
            op2a.setDisable(false);
            op3a.setDisable(false);
            op4a.setDisable(false);
            op5a.setDisable(true);
            op6a.setDisable(true);
            op7a.setDisable(true);
            op8a.setDisable(true);
            op9a.setDisable(true);
            op10a.setDisable(true);
            op11a.setDisable(true);
            op12a.setDisable(true);
            op13a.setDisable(true);

        }
    }

    private void btnresetB(){
        if(mode == 1){
            op1b.setDisable(false);
            op2b.setDisable(false);
            op3b.setDisable(false);
            op4b.setDisable(false);
            op5b.setDisable(false);
            op6b.setDisable(true);
            op7b.setDisable(true);
            op8b.setDisable(true);
            op9b.setDisable(true);
            op10b.setDisable(true);
            op11b.setDisable(true);
            op12b.setDisable(true);
            op13b.setDisable(true);
        }else if(mode == 2){
            op1b.setDisable(false);
            op2b.setDisable(false);
            op3b.setDisable(false);
            op4b.setDisable(false);
            op5b.setDisable(false);
            op6b.setDisable(false);
            op7b.setDisable(false);
            op8b.setDisable(false);
            op9b.setDisable(true);
            op10b.setDisable(true);
            op11b.setDisable(true);
            op12b.setDisable(true);
            op13b.setDisable(true);

        }else if (mode == 3){
            op1b.setDisable(false);
            op2b.setDisable(false);
            op3b.setDisable(false);
            op4b.setDisable(true);
            op5b.setDisable(true);
            op6b.setDisable(true);
            op7b.setDisable(true);
            op8b.setDisable(true);
            op9b.setDisable(true);
            op10b.setDisable(true);
            op11b.setDisable(true);
            op12b.setDisable(true);
            op13b.setDisable(true);

        }else if (mode == 4){
            op1b.setDisable(false);
            op2b.setDisable(false);
            op3b.setDisable(false);
            op4b.setDisable(false);
            op5b.setDisable(false);
            op6b.setDisable(false);
            op7b.setDisable(false);
            op8b.setDisable(false);
            op9b.setDisable(false);
            op10b.setDisable(false);
            op11b.setDisable(false);
            op12b.setDisable(false);
            op13b.setDisable(false);

        }else if (mode == 5){
            op1b.setDisable(false);
            op2b.setDisable(false);
            op3b.setDisable(false);
            op4b.setDisable(false);
            op5b.setDisable(true);
            op6b.setDisable(true);
            op7b.setDisable(true);
            op8b.setDisable(true);
            op9b.setDisable(true);
            op10b.setDisable(true);
            op11b.setDisable(true);
            op12b.setDisable(true);
            op13b.setDisable(true);

        }
    }

    private void btnreset(){
        if(mode == 1){
            op1a.setDisable(false);
            op2a.setDisable(false);
            op3a.setDisable(false);
            op4a.setDisable(false);
            op5a.setDisable(false);
            op6a.setDisable(true);
            op7a.setDisable(true);
            op8a.setDisable(true);
            op9a.setDisable(true);
            op10a.setDisable(true);
            op11a.setDisable(true);
            op12a.setDisable(true);
            op13a.setDisable(true);

            op1b.setDisable(false);
            op2b.setDisable(false);
            op3b.setDisable(false);
            op4b.setDisable(false);
            op5b.setDisable(false);
            op6b.setDisable(true);
            op7b.setDisable(true);
            op8b.setDisable(true);
            op9b.setDisable(true);
            op10b.setDisable(true);
            op11b.setDisable(true);
            op12b.setDisable(true);
            op13b.setDisable(true);
        }else if(mode == 2){
            op1a.setDisable(false);
            op2a.setDisable(false);
            op3a.setDisable(false);
            op4a.setDisable(false);
            op5a.setDisable(false);
            op6a.setDisable(false);
            op7a.setDisable(false);
            op8a.setDisable(false);
            op9a.setDisable(true);
            op10a.setDisable(true);
            op11a.setDisable(true);
            op12a.setDisable(true);
            op13a.setDisable(true);

            op1b.setDisable(false);
            op2b.setDisable(false);
            op3b.setDisable(false);
            op4b.setDisable(false);
            op5b.setDisable(false);
            op6b.setDisable(false);
            op7b.setDisable(false);
            op8b.setDisable(false);
            op9b.setDisable(true);
            op10b.setDisable(true);
            op11b.setDisable(true);
            op12b.setDisable(true);
            op13b.setDisable(true);

        }else if (mode == 3){
            op1a.setDisable(false);
            op2a.setDisable(false);
            op3a.setDisable(false);
            op4a.setDisable(true);
            op5a.setDisable(true);
            op6a.setDisable(true);
            op7a.setDisable(true);
            op8a.setDisable(true);
            op9a.setDisable(true);
            op10a.setDisable(true);
            op11a.setDisable(true);
            op12a.setDisable(true);
            op13a.setDisable(true);

            op1b.setDisable(false);
            op2b.setDisable(false);
            op3b.setDisable(false);
            op4b.setDisable(true);
            op5b.setDisable(true);
            op6b.setDisable(true);
            op7b.setDisable(true);
            op8b.setDisable(true);
            op9b.setDisable(true);
            op10b.setDisable(true);
            op11b.setDisable(true);
            op12b.setDisable(true);
            op13b.setDisable(true);

        }else if (mode == 4){
            op1a.setDisable(false);
            op2a.setDisable(false);
            op3a.setDisable(false);
            op4a.setDisable(false);
            op5a.setDisable(false);
            op6a.setDisable(false);
            op7a.setDisable(false);
            op8a.setDisable(false);
            op9a.setDisable(false);
            op10a.setDisable(false);
            op11a.setDisable(false);
            op12a.setDisable(false);
            op13a.setDisable(false);

            op1b.setDisable(false);
            op2b.setDisable(false);
            op3b.setDisable(false);
            op4b.setDisable(false);
            op5b.setDisable(false);
            op6b.setDisable(false);
            op7b.setDisable(false);
            op8b.setDisable(false);
            op9b.setDisable(false);
            op10b.setDisable(false);
            op11b.setDisable(false);
            op12b.setDisable(false);
            op13b.setDisable(false);

        }else if (mode == 5){
            op1a.setDisable(false);
            op2a.setDisable(false);
            op3a.setDisable(false);
            op4a.setDisable(false);
            op5a.setDisable(true);
            op6a.setDisable(true);
            op7a.setDisable(true);
            op8a.setDisable(true);
            op9a.setDisable(true);
            op10a.setDisable(true);
            op11a.setDisable(true);
            op12a.setDisable(true);
            op13a.setDisable(true);

            op1b.setDisable(false);
            op2b.setDisable(false);
            op3b.setDisable(false);
            op4b.setDisable(false);
            op5b.setDisable(true);
            op6b.setDisable(true);
            op7b.setDisable(true);
            op8b.setDisable(true);
            op9b.setDisable(true);
            op10b.setDisable(true);
            op11b.setDisable(true);
            op12b.setDisable(true);
            op13b.setDisable(true);

        }
    }
    
    @FXML protected void convert(ActionEvent event){
        double temp = 0.00;
        if(mode != 3){
            input = Double.parseDouble(inputField.getText());

            temp = input * factora;

            output = temp/factorb;
        }else{ //logic for temperature conversions
            if(factora == 1){
                temp = input - 32;
                temp = temp * 5;
                temp = temp / 9;
            }else if(factora == 2){
                temp = input;
            }else if(factora == 3){
                temp = input - 273.15;
            }
            if(factorb == 1){
                temp = temp * 9;
                temp = temp / 5;
                output = temp + 32;
            }else if(factorb == 2){
                output = temp;
            }else if(factorb == 3){
                output = temp + 273.15;
            }
        }

        
        outputText.setText(String.valueOf(output));
        
    }

    @FXML protected void SetToMass(ActionEvent event) {
        op1a.setText("Miligrams");
        
        op1b.setText("Miligrams");
        

        op2a.setText("Grams");
        
        op2b.setText("Grams");
        

        op3a.setText("Kilograms");
        
        op3b.setText("Kilograms");
        

        op4a.setText("Ounces");
        
        op4b.setText("Ounces");
        

        op5a.setText("Pounds");
        
        op5b.setText("Pounds");
        

        op6a.setText("");
    
        op6b.setText("");
    

        op7a.setText("");
    
        op7b.setText("");
    

        op8a.setText("");
    
        op8b.setText("");
    

        op9a.setText("");
    
        op9b.setText("");
    

        op10a.setText("");
        
        op10b.setText("");
        

        op11a.setText("");
        
        op11b.setText("");
        

        op12a.setText("");
        
        op12b.setText("");
        

        op13a.setText("");
        
        op13b.setText("");
        

        inputField.setDisable(false);
        mode = 1;
        factora = 1.00;
        factorb = 1.00;

        Massbtn.setDisable(true);
        Lengthbtn.setDisable(false);
        Tempbtn.setDisable(false);
        Volbtn.setDisable(false);
        Spdbtn.setDisable(false);

        convert.setDisable(false);
        btnreset();
        
    }
    @FXML protected void SetToLength(ActionEvent event) {
        op1a.setText("Milimeter");
        
        op1b.setText("Milimeter");
        

        op2a.setText("Centimeter");
        
        op2b.setText("Centimeter");
        

        op3a.setText("Meter");
        
        op3b.setText("Meter");
        

        op4a.setText("Kilometer");
        
        op4b.setText("Kilometer");
        

        op5a.setText("Inch");
        
        op5b.setText("Inch");
        

        op6a.setText("Foot");
        
        op6b.setText("Foot");
        

        op7a.setText("Yard");
        
        op7b.setText("Yard");
        

        op8a.setText("Mile");
        
        op8b.setText("Mile");
        

        op9a.setText("");
    
        op9b.setText("");
    

        op10a.setText("");
        
        op10b.setText("");
        

        op11a.setText("");
        
        op11b.setText("");
        

        op12a.setText("");
        
        op12b.setText("");
        

        op13a.setText("");
        
        op13b.setText("");
        

        inputField.setDisable(false);
        mode = 2;
        factora = 1.00;
        factorb = 1.00;

        Massbtn.setDisable(false);
        Lengthbtn.setDisable(true);
        Tempbtn.setDisable(false);
        Volbtn.setDisable(false);
        Spdbtn.setDisable(false);
        
        convert.setDisable(false);
        btnreset();

    }
    @FXML protected void SetToTemp(ActionEvent event) {
        op1a.setText("Fahrenheit");
        
        op1b.setText("Fahrenheit");
        

        op2a.setText("Celsius");
        
        op2b.setText("Celsius");
        

        op3a.setText("Kelvin");
        
        op3b.setText("Kelvin");
        

        op4a.setText("");
    
        op4b.setText("");
    

        op5a.setText("");
    
        op5b.setText("");
    

        op6a.setText("");
    
        op6b.setText("");
    

        op7a.setText("");
    
        op7b.setText("");
    

        op8a.setText("");
    
        op8b.setText("");
    

        op9a.setText("");
    
        op9b.setText("");
    

        op10a.setText("");
        
        op10b.setText("");
        

        op11a.setText("");
        
        op11b.setText("");
        

        op12a.setText("");
        
        op12b.setText("");
        

        op13a.setText("");
        
        op13b.setText("");
        

        inputField.setDisable(false);
        mode = 3;
        factora = 1.00;
        factorb = 1.00;

        Massbtn.setDisable(false);
        Lengthbtn.setDisable(false);
        Tempbtn.setDisable(true);
        Volbtn.setDisable(false);
        Spdbtn.setDisable(false);

        convert.setDisable(false);
        btnreset();

    }
    @FXML protected void SetToVol(ActionEvent event) {
        op1a.setText("Mililiter");
    
        op1b.setText("Mililiter");
    

        op2a.setText("Liter");
    
        op2b.setText("Liter");
    

        op3a.setText("Meter^3");
    
        op3b.setText("Meter^3");
    

        op4a.setText("Gallon (US)");
    
        op4b.setText("Gallon (US)");
    

        op5a.setText("Quart (US)");
    
        op5b.setText("Quart (US)");
    

        op6a.setText("Pint (US)");
    
        op6b.setText("Pint (US)");
    

        op7a.setText("Cup (US)");
    
        op7b.setText("Cup (US)");
    

        op8a.setText("Fl. oz. (US)");
    
        op8b.setText("Fl. oz. (US)");
    

        op9a.setText("Gallon (I)");
    
        op9b.setText("Gallon (I)");
    

        op10a.setText("Quart (I)");
        
        op10b.setText("Quart (I)");
        

        op11a.setText("Pint (I)");
        
        op11b.setText("Pint (I)");
        

        op12a.setText("Cup (I)");
        
        op12b.setText("Cup (I)");
        

        op13a.setText("Fl. oz. (I)");
        
        op13b.setText("Fl. oz. (I)");
        

        inputField.setDisable(false);
        mode = 4;
        factora = 1.00;
        factorb = 1.00;

        Massbtn.setDisable(false);
        Lengthbtn.setDisable(false);
        Tempbtn.setDisable(false);
        Volbtn.setDisable(true);
        Spdbtn.setDisable(false);

        convert.setDisable(false);
        btnreset();


    }
    @FXML protected void SetToSpd(ActionEvent event) {
        op1a.setText("MPH");
        
        op1b.setText("MPH");
        

        op2a.setText("FtPS");
        
        op2b.setText("FtPS");
        

        op3a.setText("MPS");
        
        op3b.setText("MPS");
        

        op4a.setText("KmPH");
        
        op4b.setText("KmPH");
        

        op5a.setText("");
    
        op5b.setText("");
    

        op6a.setText("");
    
        op6b.setText("");
    

        op7a.setText("");
    
        op7b.setText("");
    

        op8a.setText("");
    
        op8b.setText("");
    

        op9a.setText("");
    
        op9b.setText("");
    

        op10a.setText("");
        
        op10b.setText("");
        

        op11a.setText("");
        
        op11b.setText("");
        

        op12a.setText("");
        
        op12b.setText("");
        

        op13a.setText("");
        
        op13b.setText("");
        

        inputField.setDisable(false);
        mode = 5;
        factora = 1.00;
        factorb = 1.00;

        Massbtn.setDisable(false);
        Lengthbtn.setDisable(false);
        Tempbtn.setDisable(false);
        Volbtn.setDisable(false);
        Spdbtn.setDisable(true);

        convert.setDisable(false);
        btnreset();


    }

    @FXML protected void op1aPressed(ActionEvent event) {
        if(mode == 1){
            factora = 0.001;
        }else if(mode == 2){
            factora = 0.001;
        }else if(mode == 3){
            factora = 1;
        }else if(mode == 4){
            factora = .001;
        }else if(mode == 5){
            factora = 0.447;
        }

        btnresetA();
        op1a.setDisable(true);
    }
    @FXML protected void op2aPressed(ActionEvent event) {

        if(mode == 1){
            factora = 1;
        }else if(mode == 2){
            factora = 0.01;
        }else if(mode == 3){
            factora = 2;
        }else if(mode == 4){
            factora = 1;
        }else if(mode == 5){
            factora = 0.3048;
        }

        btnresetA();
        op2a.setDisable(true);
    }
    @FXML protected void op3aPressed(ActionEvent event) {

        if(mode == 1){
            factora = 1000;
        }else if(mode == 2){
            factora = 1;
        }else if(mode == 3){
            factora = 3;
        }else if(mode == 4){
            factora = 1000;
        }else if(mode == 5){
            factora = 1;
        }

        btnresetA();
        op3a.setDisable(true);
    }
    @FXML protected void op4aPressed(ActionEvent event) {

        if(mode == 1){
            factora = 28.35;
        }else if(mode == 2){
            factora = 1000;
        }else if(mode == 3){
            factora = 1;
        }else if(mode == 4){
            factora = 3.785;
        }else if(mode == 5){
            factora = 0.2777;
        }

        btnresetA();
        op4a.setDisable(true);
    }
    @FXML protected void op5aPressed(ActionEvent event) {

        if(mode == 1){
            factora = 453.6;
        }else if(mode == 2){
            factora = 0.0254;
        }else if(mode == 3){
            factora = 1;
        }else if(mode == 4){
            factora = 0.946;
        }else if(mode == 5){
            factora = 1;
        }

        btnresetA();
        op5a.setDisable(true);
    }
    @FXML protected void op6aPressed(ActionEvent event) {

        if(mode == 1){
            factora = 1;
        }else if(mode == 2){
            factora = 0.3048;
        }else if(mode == 3){
            factora = 1;
        }else if(mode == 4){
            factora = 0.473;
        }else if(mode == 5){
            factora = 1;
        }

        btnresetA();
        op6a.setDisable(true);
    }
    @FXML protected void op7aPressed(ActionEvent event) {

        if(mode == 1){
            factora = 1;
        }else if(mode == 2){
            factora = 0.9144;
        }else if(mode == 3){
            factora = 1;
        }else if(mode == 4){
            factora = 0.24;
        }else if(mode == 5){
            factora = 1;
        }

        btnresetA();
        op7a.setDisable(true);
    }
    @FXML protected void op8aPressed(ActionEvent event) {

        if(mode == 1){
            factora = 1;
        }else if(mode == 2){
            factora = 1069;
        }else if(mode == 3){
            factora = 1;
        }else if(mode == 4){
            factora = 0.02957;
        }else if(mode == 5){
            factora = 1;
        }

        btnresetA();
        op8a.setDisable(true);
    }
    @FXML protected void op9aPressed(ActionEvent event) {

        if(mode == 1){
            factora = 1;
        }else if(mode == 2){
            factora = 1;
        }else if(mode == 3){
            factora = 1;
        }else if(mode == 4){
            factora = 4.546;
        }else if(mode == 5){
            factora = 1;
        }

        btnresetA();
        op9a.setDisable(true);
    }
    @FXML protected void op10aPressed(ActionEvent event) {

        if(mode == 1){
            factora = 1;
        }else if(mode == 2){
            factora = 1;
        }else if(mode == 3){
            factora = 1;
        }else if(mode == 4){
            factora = 1.137;
        }else if(mode == 5){
            factora = 1;
        }

        btnresetA();
        op10a.setDisable(true);
    }
    @FXML protected void op11aPressed(ActionEvent event) {

        if(mode == 1){
            factora = 1;
        }else if(mode == 2){
            factora = 1;
        }else if(mode == 3){
            factora = 1;
        }else if(mode == 4){
            factora = 0.568;
        }else if(mode == 5){
            factora = 1;
        }

        btnresetA();
        op11a.setDisable(true);
    }
    @FXML protected void op12aPressed(ActionEvent event) {

        if(mode == 1){
            factora = 1;
        }else if(mode == 2){
            factora = 1;
        }else if(mode == 3){
            factora = 1;
        }else if(mode == 4){
            factora = 0.2841;
        }else if(mode == 5){
            factora = 1;
        }

        btnresetA();
        op12a.setDisable(true);
    }
    @FXML protected void op13aPressed(ActionEvent event) {

        if(mode == 1){
            factora = 1;
        }else if(mode == 2){
            factora = 1;
        }else if(mode == 3){
            factora = 1;
        }else if(mode == 4){
            factora = 0.02841;
        }else if(mode == 5){
            factora = 1;
        }

        btnresetA();
        op13a.setDisable(true);
    }

    @FXML protected void op1bPressed(ActionEvent event) {
        
        if(mode == 1){
            factorb = 0.001;
        }else if(mode == 2){
            factorb = 0.001;
        }else if(mode == 3){
            factorb = 1;
        }else if(mode == 4){
            factorb = 1000;
        }else if(mode == 5){
            factorb = 0.447;
        }

        btnresetB();
        op1b.setDisable(true);
    }
    @FXML protected void op2bPressed(ActionEvent event) {

        if(mode == 1){
            factorb = 1;
        }else if(mode == 2){
            factorb = 0.01;
        }else if(mode == 3){
            factorb = 2;
        }else if(mode == 4){
            factorb = 1;
        }else if(mode == 5){
            factorb = 0.3048;
        }

        btnresetB();
        op2b.setDisable(true);
    }
    @FXML protected void op3bPressed(ActionEvent event) {

        if(mode == 1){
            factorb = 1000;
        }else if(mode == 2){
            factorb = 1;
        }else if(mode == 3){
            factorb = 3;
        }else if(mode == 4){
            factorb = 1000;
        }else if(mode == 5){
            factorb = 1;
        }

        btnresetB();
        op3b.setDisable(true);
    }
    @FXML protected void op4bPressed(ActionEvent event) {

        if(mode == 1){
            factorb = 28.35;
        }else if(mode == 2){
            factorb = 1000;
        }else if(mode == 3){
            factorb = 1;
        }else if(mode == 4){
            factorb = 3.785;
        }else if(mode == 5){
            factorb = 0.27777;
        }

        btnresetB();
        op4b.setDisable(true);
    }
    @FXML protected void op5bPressed(ActionEvent event) {

        if(mode == 1){
            factorb = 453.6;
        }else if(mode == 2){
            factorb = 0.0254;
        }else if(mode == 3){
            factorb = 1;
        }else if(mode == 4){
            factorb = 0.946;
        }else if(mode == 5){
            factorb = 1;
        }

        btnresetB();
        op5b.setDisable(true);
    }
    @FXML protected void op6bPressed(ActionEvent event) {

        if(mode == 1){
            factorb = 1;
        }else if(mode == 2){
            factorb = 0.3048;
        }else if(mode == 3){
            factorb = 1;
        }else if(mode == 4){
            factorb = 0.4731;
        }else if(mode == 5){
            factorb = 1;
        }

        btnresetB();
        op6b.setDisable(true);
    }
    @FXML protected void op7bPressed(ActionEvent event) {

        if(mode == 1){
            factorb = 1;
        }else if(mode == 2){
            factorb = 0.9144;
        }else if(mode == 3){
            factorb = 1;
        }else if(mode == 4){
            factorb = 0.24;
        }else if(mode == 5){
            factorb = 1;
        }

        btnresetB();
        op7b.setDisable(true);
    }
    @FXML protected void op8bPressed(ActionEvent event) {

        if(mode == 1){
            factorb = 1;
        }else if(mode == 2){
            factorb = 1069;
        }else if(mode == 3){
            factorb = 1;
        }else if(mode == 4){
            factorb = 0.02957;
        }else if(mode == 5){
            factorb = 1;
        }

        btnresetB();
        op8b.setDisable(true);
    }
    @FXML protected void op9bPressed(ActionEvent event) {

        if(mode == 1){
            factorb = 1;
        }else if(mode == 2){
            factorb = 1;
        }else if(mode == 3){
            factorb = 1;
        }else if(mode == 4){
            factorb = 4.546;
        }else if(mode == 5){
            factorb = 1;
        }

        btnresetB();
        op9b.setDisable(true);
    }
    @FXML protected void op10bPressed(ActionEvent event) {

        if(mode == 1){
            factorb = 1;
        }else if(mode == 2){
            factorb = 1;
        }else if(mode == 3){
            factorb = 1;
        }else if(mode == 4){
            factorb = 1.137;
        }else if(mode == 5){
            factorb = 1;
        }

        btnresetB();
        op10b.setDisable(true);
    }
    @FXML protected void op11bPressed(ActionEvent event) {

        if(mode == 1){
            factorb = 1;
        }else if(mode == 2){
            factorb = 1;
        }else if(mode == 3){
            factorb = 1;
        }else if(mode == 4){
            factorb = 0.568;
        }else if(mode == 5){
            factorb = 1;
        }

        btnresetB();
        op11b.setDisable(true);
    }
    @FXML protected void op12bPressed(ActionEvent event) {

        if(mode == 1){
            factorb = 1;
        }else if(mode == 2){
            factorb = 1;
        }else if(mode == 3){
            factorb = 1;
        }else if(mode == 4){
            factorb = 0.2841;
        }else if(mode == 5){
            factorb = 1;
        }

        btnresetB();
        op12b.setDisable(true);
    }
    @FXML protected void op13bPressed(ActionEvent event) {

        if(mode == 1){
            factorb = 1;
        }else if(mode == 2){
            factorb = 1;
        }else if(mode == 3){
            factorb = 1;
        }else if(mode == 4){
            factorb = 0.02841;
        }else if(mode == 5){
            factorb = 1;
        }

        btnresetB();
        op13b.setDisable(true);
    }
}

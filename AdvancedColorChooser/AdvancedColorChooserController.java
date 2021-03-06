package AdvancedColorChooser;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.awt.event.ActionEvent;
import java.text.NumberFormat;

public class AdvancedColorChooserController {

    @FXML    private Slider redSlider;
    @FXML    private Slider greenSlider;
    @FXML    private Slider blueSlider;
    @FXML    private Slider alphaSlider;
    @FXML    private TextField redTextField;
    @FXML    private TextField greenTextField;
    @FXML    private TextField blueTextField;
    @FXML    private TextField alphaTextField;
    @FXML    private Circle colorCircle;
    @FXML    private Rectangle colorRectangle;

    // Initial values of the sliders
    private int red = 0;
    private int green = 0;
    private int blue = 0 ;
    private double alpha = 1.0;

    public void initialize(){ //initializing
        
        alphaTextField.textProperty().bind(alphaSlider.valueProperty().asString("%.2f"));
        redSlider.setValue(red);
        redTextField.setText(String.valueOf(red));
        redTextField.textProperty().bindBidirectional(redSlider.valueProperty(), NumberFormat.getNumberInstance()); //binding the sliders and the textfileds bidierctionally 
        blueTextField.textProperty().bindBidirectional(blueSlider.valueProperty(), NumberFormat.getNumberInstance());
        greenTextField.textProperty().bindBidirectional(greenSlider.valueProperty(), NumberFormat.getNumberInstance());


        blueSlider.valueProperty().addListener(   
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> ov, Number oldValue, Number newValue) {
                        blue = newValue.intValue();
                        colorRectangle.setFill(Color.rgb(red, green, blue, alpha));

                    }
                }
        );

        greenSlider.valueProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> ov, Number oldValue, Number newValue) {
                        green = newValue.intValue();
                        colorRectangle.setFill(Color.rgb(red, green, blue, alpha));

                    }
                }
        );


        redSlider.valueProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> ov, Number oldValue, Number newValue) {
                        red = newValue.intValue();
                        colorRectangle.setFill(Color.rgb(red, green, blue, alpha));

                    }
                }
        );

        alphaSlider.valueProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> ov, Number oldValue, Number newValue) {
                        alpha = newValue.doubleValue();
                        colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
                    }
                }
        );
    }
}

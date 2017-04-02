/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlexample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
 
public class FXMLExampleController implements Initializable{
    @FXML private ListView fields;
    
    ObservableList<String> content = FXCollections.observableArrayList(
            "gender", "year", "category", "bornDate", "diedDate",
            "bornCountry", "bornCity", "diedCountry", "diedCity", "firstname",
            "surname");
    
   
    
    @Override @FXML public void initialize(URL url, ResourceBundle resource){
        
        fields.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        fields.getItems().setAll(content);
        fields.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
        @Override
        public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
        // selected item is newValue
        }
        });
    }

}
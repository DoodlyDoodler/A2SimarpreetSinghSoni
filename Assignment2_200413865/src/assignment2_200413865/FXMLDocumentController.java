/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_200413865;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author simar
 */
public class FXMLDocumentController implements Initializable {
   
    // connections to javafx objects
    @FXML
    private Button a;
    @FXML
    private Button b;
    @FXML
    private Button c;
    @FXML
    private Button d;
    @FXML
    private Button e;
    @FXML
    private Button f;
    @FXML
    private Button g;
    @FXML
    private Button h;
    @FXML
    private Button i;
    @FXML
    private Button j;
    @FXML
    private Button k;
    @FXML
    private Button l;
    @FXML
    private Button m;
    @FXML
    private Button n;
    @FXML
    private Button o;
    @FXML
    private Button p;
    @FXML
    private Button q;
    @FXML
    private Button r;
    @FXML
    private Button s;
    @FXML
    private Button t;
    @FXML
    private Button u;
    @FXML
    private Button v;
    @FXML
    private Button w;
    @FXML
    private Button x;
    @FXML
    private Button y;
    @FXML
    private Button z;
    @FXML
    private Button submit;
    @FXML
    private Button restart;
    @FXML
    private Label A;
    @FXML
    private Label B;
    @FXML
    private Label C;
    @FXML
    private Label D;
    @FXML
    private Label E;
    @FXML
    private Label I;
    @FXML
    private Label J;
    @FXML
    private Label K;
    @FXML
    private Label L;
    @FXML
    private Label M;
    @FXML
    private Label F;
    @FXML
    private Label G;
    @FXML
    private Label H;
    @FXML
    private Label N;
    @FXML
    private Label O;
    @FXML
    private Label P;
    @FXML
    private Label Q;
    @FXML
    private Label R;
    @FXML
    private Label S;
    @FXML
    private Label T;
    @FXML
    private Label U;
    @FXML
    private Label V;
    @FXML
    private Label W;
    @FXML
    private Label X;
    @FXML
    private Label Y;
    @FXML
    private Label Z;
    @FXML
    private Label userDisplay;

    @FXML
    private Label error;
    @FXML
    private Label point;
    @FXML
    private Label history;
        
    int[] alphabetBag = {9, 2, 2, 4, 12, 2, 3, 2, 8, 1, 1, 4, 2, 6, 8, 2, 1, 6, 4, 6, 4, 2, 2, 1, 2, 1};
    String characters = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    
    int[] tempAlphabetBag = {9, 2, 2, 4, 12, 2, 3, 2, 8, 1, 1, 4, 2, 6, 8, 2, 1, 6, 4, 6, 4, 2, 2, 1, 2, 1};
     
    String inputedWord = "", disHis = "", disHisTemp = "", errorMsg = "";
    int checkUpperWordLimit = 1;
    boolean checkForVowel,
            checkForBlankWord,
            checkLowerWordLimit,
            chechForBag,
            checkForRepeat,
            checkGameOver = true;
    int totalPoint = 0;
    
    ArrayList<String> History = new ArrayList<>();

    @FXML
    private void alphabetPressed(ActionEvent event){
//        System.out.println(a.getText());
        gameOver();
        if(checkUpperWordLimit<=8 && checkGameOver){
            if(event.getSource() == a && alphabetBag[0] > 0){
                checkUpperWordLimit++;
                inputedWord += "A";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == b){
                checkUpperWordLimit++;
                inputedWord += "B";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == c){
                checkUpperWordLimit++;
                inputedWord += "C";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == d){
                checkUpperWordLimit++;
                inputedWord += "D";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == e){
                checkUpperWordLimit++;
                inputedWord += "E";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == f){
                checkUpperWordLimit++;
                inputedWord += "F";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == g){
                checkUpperWordLimit++;
                inputedWord += "G";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == h){
                checkUpperWordLimit++;
                inputedWord += "H";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == i){
                checkUpperWordLimit++;
                inputedWord += "I";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == j){
                checkUpperWordLimit++;
                inputedWord += "J";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == k){
                checkUpperWordLimit++;
                inputedWord += "K";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == l){
                checkUpperWordLimit++;
                inputedWord += "L";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == m){
                checkUpperWordLimit++;
                inputedWord += "M";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == n){
                checkUpperWordLimit++;
                inputedWord += "N";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == o){
                checkUpperWordLimit++;
                inputedWord += "O";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == p){
                checkUpperWordLimit++;
                inputedWord += "P";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == q){
                checkUpperWordLimit++;
                inputedWord += "Q";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == r){
                checkUpperWordLimit++;
                inputedWord += "R";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == s){
                checkUpperWordLimit++;
                inputedWord += "S";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == t){
                checkUpperWordLimit++;
                inputedWord += "T";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == u){
                checkUpperWordLimit++;
                inputedWord += "U";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == v){
                checkUpperWordLimit++;
                inputedWord += "V";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == w){
                checkUpperWordLimit++;
                inputedWord += "W";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == x){
                checkUpperWordLimit++;
                inputedWord += "X";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == y){
                checkUpperWordLimit++;
                inputedWord += "Y";
                userDisplay.setText(inputedWord);
            }
            else if(event.getSource() == z){
                checkUpperWordLimit++;
                inputedWord += "Z";
                userDisplay.setText(inputedWord);
            }
        }
        else{
            error.setText("Word is too long. ");
        }
    }

    @FXML
    private void submitButtonPressed(ActionEvent event){
        
        // check for vowel
        checkForBlankWord = true;
        checkForVowel = false;
        checkLowerWordLimit = true;
        chechForBag = true;
        checkForRepeat = true;  
        
        errorMsg = "";
        error.setText(errorMsg);
        
        for(int i = 0; i < inputedWord.length(); i++){
            if(inputedWord.charAt(i) == 'A'|| inputedWord.charAt(i) == 'E'|| inputedWord.charAt(i) == 'I' || inputedWord.charAt(i) == 'O' || inputedWord.charAt(i) == 'U' || inputedWord.charAt(i) == 'Y') {
                checkForVowel = true;
            }
        }
        
        for(int j=0; j < inputedWord.length(); j++){
            String s = Character.toString(inputedWord.charAt(j));
            int index = characters.indexOf(s);
            
            if(alphabetBag[index] == 0){
                chechForBag = false;
            }
        }    
        
                
        if(!checkForVowel){
            errorMsg += "Word does not include vowel. ";
            error.setText(errorMsg);
        }
        
        if(inputedWord.length() < 2){
            errorMsg += "Word is too short. ";
            error.setText(errorMsg);
            checkLowerWordLimit = false;
        }
        
        if(inputedWord.isEmpty()){
            errorMsg += "Word is blank. ";
            error.setText(errorMsg);
            checkForBlankWord = false;
        }        
        
        if(History.contains(inputedWord)){
            errorMsg = "Word already exists.";
            error.setText(errorMsg);
            inputedWord = "";
            userDisplay.setText("");
            checkUpperWordLimit = 1;
            checkForRepeat = false;
        }
        
        if(!chechForBag){
            errorMsg += "Word bag is empty ";
            error.setText(errorMsg);
            userDisplay.setText("");
            checkUpperWordLimit = 1;
            inputedWord = "";
        }
                
        if(checkForBlankWord == true && checkForVowel == true && checkLowerWordLimit == true && chechForBag == true && checkForRepeat == true && checkGameOver == true){
            History.add(inputedWord);
            
            if(History.size() > 1){
                disHis += ", " + inputedWord ;
            }
            else{
                disHis += inputedWord;
            }
            
            userDisplay.setText("");
            
            for(int i=0; i < inputedWord.length(); i++){
                if(inputedWord.charAt(i) == 'A'){
                    alphabetBag[0]--;
                    A.setText(String.valueOf(alphabetBag[0]));
                    totalPoint += 1;
                }
                if(inputedWord.charAt(i) == 'B'){
                    alphabetBag[1]--;
                    B.setText(String.valueOf(alphabetBag[1]));
                    totalPoint += 3;
                }
                if(inputedWord.charAt(i) == 'C'){
                    alphabetBag[2]--;
                    C.setText(String.valueOf(alphabetBag[2]));
                    totalPoint += 3;
                }
                if(inputedWord.charAt(i) == 'D'){
                    alphabetBag[3]--;
                    D.setText(String.valueOf(alphabetBag[3]));
                    totalPoint += 2;
                }
                if(inputedWord.charAt(i) == 'E'){
                    alphabetBag[4]--;
                    E.setText(String.valueOf(alphabetBag[4]));
                    totalPoint += 1;
                }
                if(inputedWord.charAt(i) == 'F'){
                    alphabetBag[5]--;
                    F.setText(String.valueOf(alphabetBag[5]));
                    totalPoint += 4;
                }
                if(inputedWord.charAt(i) == 'G'){
                    alphabetBag[6]--;
                    G.setText(String.valueOf(alphabetBag[6]));
                    totalPoint += 2;
                }
                if(inputedWord.charAt(i) == 'H'){
                    alphabetBag[7]--;
                    H.setText(String.valueOf(alphabetBag[7]));
                    totalPoint += 4;
                }
                if(inputedWord.charAt(i) == 'I'){
                    alphabetBag[8]--;
                    I.setText(String.valueOf(alphabetBag[8]));
                    totalPoint += 1;
                }
                if(inputedWord.charAt(i) == 'J'){
                    alphabetBag[9]--;
                    J.setText(String.valueOf(alphabetBag[9]));
                    totalPoint += 8;
                }
                if(inputedWord.charAt(i) == 'K'){
                    alphabetBag[10]--;
                    K.setText(String.valueOf(alphabetBag[10]));
                    totalPoint += 5;
                }
                if(inputedWord.charAt(i) == 'L'){
                    alphabetBag[11]--;
                    L.setText(String.valueOf(alphabetBag[11]));
                    totalPoint += 1;
                }
                if(inputedWord.charAt(i) == 'M'){
                    alphabetBag[12]--;
                    M.setText(String.valueOf(alphabetBag[12]));
                    totalPoint += 3;
                }
                if(inputedWord.charAt(i) == 'N'){
                    alphabetBag[13]--;
                    N.setText(String.valueOf(alphabetBag[13]));
                    totalPoint += 1;
                }
                if(inputedWord.charAt(i) == 'O'){
                    alphabetBag[14]--;
                    O.setText(String.valueOf(alphabetBag[14]));
                    totalPoint += 1;
                }
                if(inputedWord.charAt(i) == 'P'){
                    alphabetBag[15]--;
                    P.setText(String.valueOf(alphabetBag[15]));
                    totalPoint += 3;
                }
                if(inputedWord.charAt(i) == 'Q'){
                    alphabetBag[16]--;
                    Q.setText(String.valueOf(alphabetBag[16]));
                    totalPoint += 10;
                }
                if(inputedWord.charAt(i) == 'R'){
                    alphabetBag[17]--;
                    R.setText(String.valueOf(alphabetBag[17]));
                    totalPoint += 1;
                }
                if(inputedWord.charAt(i) == 'S'){
                    alphabetBag[18]--;
                    S.setText(String.valueOf(alphabetBag[18]));
                    totalPoint += 1;
                }
                if(inputedWord.charAt(i) == 'T'){
                    alphabetBag[19]--;
                    T.setText(String.valueOf(alphabetBag[19]));
                    totalPoint += 1;
                }
                if(inputedWord.charAt(i) == 'U'){
                    alphabetBag[20]--;
                    U.setText(String.valueOf(alphabetBag[20]));
                    totalPoint += 1;
                }
                if(inputedWord.charAt(i) == 'V'){
                    alphabetBag[21]--;
                    V.setText(String.valueOf(alphabetBag[21]));
                    totalPoint += 4;
                }
                if(inputedWord.charAt(i) == 'W'){
                    alphabetBag[22]--;
                    W.setText(String.valueOf(alphabetBag[22]));
                    totalPoint += 4;
                }
                if(inputedWord.charAt(i) == 'X'){
                    alphabetBag[23]--;
                    X.setText(String.valueOf(alphabetBag[23]));
                    totalPoint += 8;
                }
                if(inputedWord.charAt(i) == 'Y'){
                    alphabetBag[24]--;
                    Y.setText(String.valueOf(alphabetBag[24]));
                    totalPoint += 4;
                }
                if(inputedWord.charAt(i) == 'Z'){
                    alphabetBag[25]--;
                    Z.setText(String.valueOf(alphabetBag[25]));
                    totalPoint += 10;
                }
            }
            
            point.setText(String.valueOf(totalPoint));
            if(History.contains(inputedWord)){
                inputedWord = "";
            }
            
            history.setText(disHis);
            error.setText("");
            checkUpperWordLimit = 1;
            
            
        }
        
        gameOver();
        changeStyle();
        
    }

    @FXML
    private void backButtonPressed(ActionEvent event){
        if(inputedWord.length() >= 1){
            inputedWord = inputedWord.substring(0, inputedWord.length()-1);
            userDisplay.setText(inputedWord);
            System.out.println(inputedWord);
        }
    }
    
    public void gameOver(){
        int n = 0;
        for(int i=0; i<26; i++){
            if(alphabetBag[i] == 0){
                n++;
            }
        }
        
        if(n>25){
            error.setText(".....Game Over.....");
            checkGameOver = false;
        }
    }
    // to update style of alphabet button on empty bag.
    public void changeStyle(){
        if(alphabetBag[0] == 0){
            a.setDisable(true);
        }
        else{
            a.setDisable(false);
        }
        if(alphabetBag[1] == 0){
            b.setDisable(true);
        }
        else{
            b.setDisable(false);
        }
        if(alphabetBag[2] == 0){
            c.setDisable(true);
        }
        else{
            c.setDisable(false);
        }
        if(alphabetBag[3] == 0){
            d.setDisable(true);
        }
        else{
            d.setDisable(false);
        }
        if(alphabetBag[4] == 0){
            e.setDisable(true);
        }
        else{
            e.setDisable(false);
        }
        if(alphabetBag[5] == 0){
            f.setDisable(true);
        }
        else{
            f.setDisable(false);
        }
        if(alphabetBag[6] == 0){
            g.setDisable(true);
        }
        else{
            g.setDisable(false);
        }
        if(alphabetBag[7] == 0){
            h.setDisable(true);
        }
        else{
            h.setDisable(false);
        }
        if(alphabetBag[8] == 0){
            i.setDisable(true);
        }
        else{
            i.setDisable(false);
        }
        if(alphabetBag[9] == 0){
            j.setDisable(true);
        }
        else{
            j.setDisable(false);
        }
        if(alphabetBag[10] == 0){
            k.setDisable(true);
        }
        else{
            k.setDisable(false);
        }
        if(alphabetBag[11] == 0){
            l.setDisable(true);
        }
        else{
            l.setDisable(false);
        }
        if(alphabetBag[12] == 0){
            m.setDisable(true);
        }
        else{
            m.setDisable(false);
        }
        if(alphabetBag[13] == 0){
            n.setDisable(true);
        }
        else{
            n.setDisable(false);
        }
        if(alphabetBag[14] == 0){
            o.setDisable(true);
        }
        else{
            o.setDisable(false);
        }
        if(alphabetBag[15] == 0){
            p.setDisable(true);
        }
        else{
            p.setDisable(false);
        }
        if(alphabetBag[16] == 0){
            q.setDisable(true);
        }
        else{
            q.setDisable(false);
        }
        if(alphabetBag[17] == 0){
            r.setDisable(true);
        }
        else{
            r.setDisable(false);
        }
        if(alphabetBag[18] == 0){
            s.setDisable(true);
        }
        else{
            s.setDisable(false);
        }
        if(alphabetBag[19] == 0){
            t.setDisable(true);
        }
        else{
            t.setDisable(false);
        }
        if(alphabetBag[20] == 0){
            u.setDisable(true);
        }
        else{
            u.setDisable(false);
        }
        if(alphabetBag[21] == 0){
            v.setDisable(true);
        }
        else{
            v.setDisable(false);
        }
        if(alphabetBag[22] == 0){
            w.setDisable(true);
        }
        else{
            w.setDisable(false);
        }
        if(alphabetBag[23] == 0){
            x.setDisable(true);
        }
        else{
            x.setDisable(false);
        }
        if(alphabetBag[24] == 0){
            y.setDisable(true);
        }
        else{
            y.setDisable(false);
        }
        if(alphabetBag[25] == 0){
            z.setDisable(true);
        }
        else{
            z.setDisable(false);
        }
    }

    @FXML
    private void restartButtonPressed(ActionEvent event){
        changeStyle();
        
        History.clear();
        
        for(int i=0; i<alphabetBag.length; i++){
            alphabetBag[i] = tempAlphabetBag[i];
        }
        
        inputedWord = "";
        userDisplay.setText("");
        disHis = "";
        history.setText("");
        errorMsg = "";
        error.setText("");
        point.setText("");
        checkUpperWordLimit = 1;
        checkForVowel = false;
        checkForBlankWord = true;
        checkLowerWordLimit = true;
        totalPoint = 0;
        chechForBag = true;
        
        A.setText("9");
        B.setText("2");
        C.setText("2");
        D.setText("4");
        E.setText("12");
        F.setText("2");
        G.setText("3");
        H.setText("2");
        I.setText("8");
        J.setText("1");
        K.setText("1");
        L.setText("4");
        M.setText("2");
        N.setText("6");
        O.setText("8");
        P.setText("2");
        Q.setText("1");
        R.setText("6");
        S.setText("4");
        T.setText("6");
        U.setText("4");
        V.setText("2");
        W.setText("2");
        X.setText("1");
        Y.setText("2");
        Z.setText("1");
        
        for(int i=0; i < 26; i++){
            tempAlphabetBag[i] = alphabetBag[i];
        }
        
        changeStyle();
        
    }
            
    @Override
    @SuppressWarnings("empty-statement")
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        A.setText("9");
        B.setText("2");
        C.setText("2");
        D.setText("4");
        E.setText("12");
        F.setText("2");
        G.setText("3");
        H.setText("2");
        I.setText("8");
        J.setText("1");
        K.setText("1");
        L.setText("4");
        M.setText("2");
        N.setText("6");
        O.setText("8");
        P.setText("2");
        Q.setText("1");
        R.setText("6");
        S.setText("4");
        T.setText("6");
        U.setText("4");
        V.setText("2");
        W.setText("2");
        X.setText("1");
        Y.setText("2");
        Z.setText("1");
    } 
}

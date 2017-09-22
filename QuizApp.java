package com.example.android.quizapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class QuizApp extends AppCompatActivity {

    /**
     *  Defined variables for RadioGroups
     */


    /**
     * Defined variable for the first radioGroup involving Slavery
     */
    private RadioGroup radioGroupSlavery;

    /**
     * Defined variable for the second radioGroup involving Alcohol
     */

    private RadioGroup radioGroupAlcohol;

    /**
     * Defined variable for the third radioGroup involving the first AA President
     */

    private RadioGroup radioGroupPresident;

    /**
     * Defined variable for the fourth radioGroup involving Stripes on Flag
     */

    private RadioGroup radioGroupFlag;

    /**
     * Defined variable for the editText field bonus on bottom of quiz
     */

    public EditText editTextBonus;


    /**
     * Defined Variables for Lincoln CheckBox
     */

    CheckBox lincolnCheckBox;
    boolean pickedLincoln;
    TextView correctOne;

    /**
     * Defined Variables for Washington CheckBox
     */

    CheckBox washingtonCheckBox;
    boolean pickedWashington;
    TextView correctTwo;

    /**
     * Defined Variables for Franklin CheckBox
     */

    CheckBox franklinCheckBox;
    boolean pickedFranklin;
    TextView wrongOne;

    /**
     * Defined Variables for Hamilton CheckBox
     */

    CheckBox hamiltonCheckBox;
    boolean pickedHamilton;
    TextView wrongTwo;


    /**
     * Defined Variables for FiftySix CheckBox
     */


    boolean pickedFiftySix;
    TextView wrongThree;

    /**
     * Defined Variables for EightyFive CheckBox
     */


    boolean pickedEightyFive;
    TextView wrongFour;

    /**
     * Defined Variables for SeventyTwo CheckBox
     */


    boolean pickedSeventyTwo;
    TextView wrongFive;

    /**
     * Defined Variables for Sixty-Five CheckBox
     */


    boolean pickedSixtyFive;
    TextView correctThree;

    /**
     * Defined Variables for February CheckBox
     */


    boolean pickedFebruary;
    TextView wrongSix;

    /**
     * Defined Variables for December CheckBox
     */


    boolean pickedDecember;
    TextView wrongSeven;

    /**
     * Defined Variables for January CheckBox
     */


    boolean pickedJanuary;
    TextView correctFour;

    /**
     * Defined Variables for November CheckBox
     */


    boolean pickedNovember;
    TextView wrongEight;

    /**
     * Defined Variables for Andrew Jackson CheckBox
     */

    CheckBox jacksonCheckBox;
    boolean pickedJackson;
    TextView wrongNine;

    /**
     * Defined Variables for John Hancock CheckBox
     */

    CheckBox johnHancockCheckBox;
    boolean pickedJohnHancock;
    TextView correctFive;

    /**
     * Defined Variables for James Madison CheckBox
     */

    CheckBox madisonCheckBox;
    boolean pickedMadison;
    TextView wrongTen;

    /**
     * Defined Variables for John Adams CheckBox
     */

    CheckBox johnAdamsCheckBox;
    boolean pickedJohnAdams;
    TextView correctSix;

    /**
     * Defined Variables for Martin Luther King jr. CheckBox
     */


    boolean pickedMlk;
    TextView wrongEleven;

    /**
     * Defined Variables for Barack Obama CheckBox
     */


    boolean pickedObama;
    TextView correctSeven;

    /**
     * Defined Variables for Collin Powell CheckBox
     */


    boolean pickedPowell;
    TextView wrongTwelve;

    /**
     * Defined Variables for Malcom-X Checkbox
     */


    boolean pickedMalcom;
    TextView wrongThirteen;

    /**
     * Defined Variables for Nine Checkbox
     */


    boolean pickedNine;
    TextView wrongFourteen;

    /**
     * Defined Variables for Seven Checkbox
     */


    boolean pickedSeven;
    TextView wrongFifteen;

    /**
     * Defined Variables for Eleven Checkbox
     */


    boolean pickedEleven;
    TextView wrongSixteen;

    /**
     * Defined Variables for Thirteen Checkbox
     */


    boolean pickedThirteen;
    TextView correctEight;


    /**
     * This app displays a total history knowledge for the user
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_app);

        /**
         *  radioGroup variable link for radioGroups 1 through 4.
         */

        radioGroupSlavery = (RadioGroup) findViewById(R.id.radioGroupSlavery);
        radioGroupAlcohol = (RadioGroup) findViewById(R.id.radioGroupAlcohol);
        radioGroupPresident = (RadioGroup) findViewById(R.id.radioGroupPresident);
        radioGroupFlag = (RadioGroup) findViewById(R.id.radioGroupFlag);

        /**
         *  editTextBonus Variable Link for Edit text bonus question
         */

        editTextBonus = (EditText) findViewById(R.id.editTextBonus);


/**
 * Wrong 1 - Franklin Checkbox variable link
 */
        franklinCheckBox = (CheckBox) findViewById(R.id.franklin_checkbox);
        pickedFranklin = franklinCheckBox.isChecked();
        wrongOne = (TextView) findViewById(R.id.wrongone_text_view);
/**
 * Wrong 2 - Hamilton Checkbox variable link
 */
        hamiltonCheckBox = (CheckBox) findViewById(R.id.hamilton_checkbox);
        pickedHamilton = hamiltonCheckBox.isChecked();
        wrongTwo = (TextView) findViewById(R.id.wrongtwo_text_view);
/**
 * Wrong 3 - Fifty-Six Checkbox variable link
 */

        RadioButton fiftySixRadio = (RadioButton) findViewById(R.id.fiftySix_radio);
        pickedFiftySix = fiftySixRadio.isChecked();
        wrongThree = (TextView) findViewById(R.id.wrongthree_text_view);
/**
 * Wrong 4 - Eighty-Five Checkbox variable link
 */
        RadioButton eightyFiveRadio = (RadioButton) findViewById(R.id.eightyfive_radio);
        pickedEightyFive = eightyFiveRadio.isChecked();
        wrongFour = (TextView) findViewById(R.id.wrongfour_text_view);
/**
 * Wrong 5 - Seventy-Two Checkbox variable link
 */
        RadioButton seventyTwoCheckBox = (RadioButton) findViewById(R.id.seventytwo_radio);
        pickedSeventyTwo = seventyTwoCheckBox.isChecked();
        wrongFive = (TextView) findViewById(R.id.wrongfive_text_view);


/**
 * Wrong 6 - February Checkbox variable link
 */
        RadioButton februaryCheckBox = (RadioButton) findViewById(R.id.february_radio);
        pickedFebruary = februaryCheckBox.isChecked();
        wrongSix = (TextView) findViewById(R.id.wrongsix_text_view);
/**
 * Wrong 7 - December Checkbox variable link
 */
        RadioButton decemberCheckBox = (RadioButton) findViewById(R.id.december_radio);
        pickedDecember = decemberCheckBox.isChecked();
        wrongSeven = (TextView) findViewById(R.id.wrongseven_text_view);
/**
 * Wrong 8 - November Checkbox variable link
 */
        RadioButton novemberCheckBox = (RadioButton) findViewById(R.id.november_radio);
        pickedNovember = novemberCheckBox.isChecked();
        wrongEight = (TextView) findViewById(R.id.wrongeight_text_view);
/**
 * Wrong 9 - Andrew Jackson Checkbox variable link
 */
        jacksonCheckBox = (CheckBox) findViewById(R.id.jackson_checkbox);
        pickedJackson = jacksonCheckBox.isChecked();
        wrongNine = (TextView) findViewById(R.id.wrongnine_text_view);
/**
 * Wrong 10 - James Madison Checkbox variable link
 */
        madisonCheckBox = (CheckBox) findViewById(R.id.madison_checkbox);
        pickedMadison = madisonCheckBox.isChecked();
        wrongTen = (TextView) findViewById(R.id.wrongten_text_view);
/**
 * Wrong 11 - Martin Luther King Checkbox variable link
 */
        RadioButton martinCheckBox = (RadioButton) findViewById(R.id.mlk_radio);
        pickedMlk = martinCheckBox.isChecked();
        wrongEleven = (TextView) findViewById(R.id.wrongeleven_text_view);
/**
 * Wrong 12 - Powell Checkbox variable link
 */
        RadioButton powellCheckBox = (RadioButton) findViewById(R.id.powell_radio);
        pickedPowell = powellCheckBox.isChecked();
        wrongTwelve = (TextView) findViewById(R.id.wrongtweleve_text_view);
/**
 * Wrong 13 - Malcom-x Checkbox variable link
 */
        RadioButton malcomCheckBox = (RadioButton) findViewById(R.id.malcom_radio);
        pickedMalcom = malcomCheckBox.isChecked();
        wrongThirteen = (TextView) findViewById(R.id.wrongthirteen_text_view);

/**
 * Wrong 14 - Lincoln Checkbox variable link
 */
        RadioButton nineCheckBox = (RadioButton) findViewById(R.id.nine_radio);
        pickedNine = nineCheckBox.isChecked();
        wrongFourteen = (TextView) findViewById(R.id.wrongfourteen_text_view);
/**
 * Wrong 15 - Lincoln Checkbox variable link
 */
        RadioButton sevenCheckBox = (RadioButton) findViewById(R.id.seven_radio);
        pickedSeven = sevenCheckBox.isChecked();
        wrongFifteen = (TextView) findViewById(R.id.wrongfifteen_text_view);
/**
 * Wrong 16 - Lincoln Checkbox variable link
 */
        RadioButton elevenCheckBox = (RadioButton) findViewById(R.id.eleven_radio);
        pickedEleven = elevenCheckBox.isChecked();
        wrongSixteen = (TextView) findViewById(R.id.wrongsixteen_text_view);


/**
 * Checkboxes that are correct responses in the App
 */

/**
 * Correct 1 - Lincoln Checkbox variable link
 */
        lincolnCheckBox = (CheckBox) findViewById(R.id.lincoln_checkbox);
        pickedLincoln = lincolnCheckBox.isChecked();
        correctOne = (TextView) findViewById(R.id.correctone_text_view);

/**
 * Correct 2 - Washington Checkbox variable Link
 */
        washingtonCheckBox = (CheckBox) findViewById(R.id.washington_checkbox);
        pickedWashington = washingtonCheckBox.isChecked();
        correctTwo = (TextView) findViewById(R.id.correcttwo_text_view);

/**
 * Correct 3 - 1865 RadioButton variable Link
 */
        RadioButton sixtyFiveRadio = (RadioButton) findViewById(R.id.sixtyFive_radio);
        pickedSixtyFive = sixtyFiveRadio.isChecked();
        correctThree = (TextView) findViewById(R.id.correctthree_text_view);

/**
 * Correct 4 - January 1920 RadioButton variable Link
 */
        RadioButton januaryCheckBox = (RadioButton) findViewById(R.id.january_radio);
        pickedJanuary = januaryCheckBox.isChecked();
        correctFour = (TextView) findViewById(R.id.correctfour_text_view);
/**
 * Correct 5 - John Hancock Checkbox variable Link
 */
        johnHancockCheckBox = (CheckBox) findViewById(R.id.hancock_checkbox);
        pickedJohnHancock = johnHancockCheckBox.isChecked();
        correctFive = (TextView) findViewById(R.id.correctfive_text_view);

/**
 * Correct 6 - John Adams Checkbox variable Link
 */
        johnAdamsCheckBox = (CheckBox) findViewById(R.id.adams_checkbox);
        pickedJohnAdams = johnAdamsCheckBox.isChecked();
        correctSix = (TextView) findViewById(R.id.correctsix_text_view);
/**
 * Correct 7 - Barrak Obama RadioButton variable Link
 */
        RadioButton obamaCheckBox = (RadioButton) findViewById(R.id.obama_radio);
        pickedObama = obamaCheckBox.isChecked();
        correctSeven = (TextView) findViewById(R.id.correctseven_text_view);

/**
 * Correct 8 - Thirteen RadioButton variable Link
 */
        RadioButton thirteenCheckBox = (RadioButton) findViewById(R.id.thirteen_radio);
        pickedThirteen = thirteenCheckBox.isChecked();
        correctEight = (TextView) findViewById(R.id.correcteight_text_view);

    }

    /**
     * This method is called when the Reset button is clicked
     */
    public void resetAnswer(View view) {

        /**
         * Clears the check state of the radioButtons from within all radioGroups
         */

        radioGroupSlavery.clearCheck();

        radioGroupAlcohol.clearCheck();

        radioGroupPresident.clearCheck();

        radioGroupFlag.clearCheck();

        /**
         * Clears the answer in the editText field
         */

        editTextBonus.setText("");


        /**
         * Display that Resets all of the Checkboxes and Answer column back to original
         */

        displayResetAnswer();

        /**
         * Displays Try Again in the Total Score Summary
         */
        String retryMessage = "Try Again";
        displayMessage(retryMessage);


    }

    /**
     * Sets Wrong Statement to Starting Display when the reset button is clicked.
     */
    public void displayResetAnswer() {

/**
 * Sets the Wrong answers to original answer in the right-hand side Text Boxes
 */

        wrongOne.setText(R.string.Answer);
        if (franklinCheckBox.isChecked()) {
            franklinCheckBox.setChecked(false);
        }

        wrongTwo.setText(R.string.Answer);
        if (hamiltonCheckBox.isChecked()) {
            hamiltonCheckBox.setChecked(false);
        }

        wrongThree.setText(R.string.Answer);


        wrongFour.setText(R.string.Answer);

        wrongFive.setText(R.string.Answer);

        wrongSix.setText(R.string.Answer);


        wrongSeven.setText(R.string.Answer);


        wrongEight.setText(R.string.Answer);

        wrongNine.setText(R.string.Answer);
        if (jacksonCheckBox.isChecked()) {
            jacksonCheckBox.setChecked(false);
        }

        wrongTen.setText(R.string.Answer);
        if (madisonCheckBox.isChecked()) {
            madisonCheckBox.setChecked(false);
        }

        wrongEleven.setText(R.string.Answer);

        wrongTwelve.setText(R.string.Answer);

        wrongThirteen.setText(R.string.Answer);

        wrongFourteen.setText(R.string.Answer);


        wrongFifteen.setText(R.string.Answer);


        wrongSixteen.setText(R.string.Answer);


/**
 * Sets the Correct answers to original answer in the right-hand side Text Boxes
 */
        correctOne.setText(R.string.Answer);
        if (lincolnCheckBox.isChecked()) {
            lincolnCheckBox.setChecked(false);
        }


        correctTwo.setText(R.string.Answer);
        if (washingtonCheckBox.isChecked()) {
            washingtonCheckBox.setChecked(false);
        }


        correctThree.setText(R.string.Answer);

        correctFour.setText(R.string.Answer);


        correctFive.setText(R.string.Answer);
        if (johnHancockCheckBox.isChecked()) {
            johnHancockCheckBox.setChecked(false);
        }

        correctSix.setText(R.string.Answer);
        if (johnAdamsCheckBox.isChecked()) {
            johnAdamsCheckBox.setChecked(false);
        }

        correctSeven.setText(R.string.Answer);


        correctEight.setText(R.string.Answer);

    }


    /**
     * This method is called when submit button is clicked
     */


    public void submitAnswer(View view) {

        /**
         * Sets a string value of bonus from what the user input as an answer by R.id.editTextBonus
         */

        EditText answerField = (EditText) findViewById(R.id.editTextBonus);
        Editable answerEditable = answerField.getText();
        String bonus = answerEditable.toString();


        CheckBox lincolnCheckBox = (CheckBox) findViewById(R.id.lincoln_checkbox);
        boolean pickedLincoln = lincolnCheckBox.isChecked();

        CheckBox washingtonCheckBox = (CheckBox) findViewById(R.id.washington_checkbox);
        boolean pickedWashington = washingtonCheckBox.isChecked();

        CheckBox franklinCheckBox = (CheckBox) findViewById(R.id.franklin_checkbox);
        boolean pickedFranklin = franklinCheckBox.isChecked();

        CheckBox hamiltonCheckBox = (CheckBox) findViewById(R.id.hamilton_checkbox);
        boolean pickedHamilton = hamiltonCheckBox.isChecked();

        RadioButton sixtyFiveCheckBox = (RadioButton) findViewById(R.id.sixtyFive_radio);
        boolean pickedsixtyFive = sixtyFiveCheckBox.isChecked();

        RadioButton januaryCheckBox = (RadioButton) findViewById(R.id.january_radio);
        boolean pickedJanuary = januaryCheckBox.isChecked();

        CheckBox hancockCheckBox = (CheckBox) findViewById(R.id.hancock_checkbox);
        boolean pickedHancock = hancockCheckBox.isChecked();

        CheckBox jacksonCheckBox = (CheckBox) findViewById(R.id.jackson_checkbox);
        boolean pickedJackson = jacksonCheckBox.isChecked();

        CheckBox adamsCheckBox = (CheckBox) findViewById(R.id.adams_checkbox);
        boolean pickedAdams = adamsCheckBox.isChecked();

        CheckBox madisonCheckBox = (CheckBox) findViewById(R.id.madison_checkbox);
        boolean pickedMadison = madisonCheckBox.isChecked();

        RadioButton obamaCheckBox = (RadioButton) findViewById(R.id.obama_radio);
        boolean pickedObama = obamaCheckBox.isChecked();

        RadioButton thirteenCheckBox = (RadioButton) findViewById(R.id.thirteen_radio);
        boolean pickedThirteen = thirteenCheckBox.isChecked();

        /**
         * Calculates the Total the User Scores
         */
        int checkboxScore = calculateCheckboxTotal(pickedWashington, pickedLincoln, pickedFranklin, pickedHamilton,
                pickedsixtyFive, pickedJanuary, pickedHancock, pickedJackson, pickedAdams, pickedMadison, pickedObama, pickedThirteen);

        /**
         * Sets the total amount possible for the user when they get 100% on the quiz
         */

        int total = 8;

        /**
         * Calculates the total score the user got and converting it into a percentage
         */

        float totalPercentage = (checkboxScore * 100f / total);
        String resultsMessage = "Total Score: \n";

        /**
         * Displays the results message to the user on the screen
         */

        resultsMessage += +checkboxScore;
        resultsMessage += "/" + total + "\n";
        resultsMessage += totalPercentage + "%" + "\n";
        resultsMessage += "The correct bonus answer question is:\n";
        resultsMessage += "\nThey represent the thirteen British colonies that declared independence from the Kingdom of Great Britain.\n";
        resultsMessage += "\nYour Answer:\n" + "\n" + bonus;
        displayMessage(resultsMessage);

        displaySubmit();

        /**
         *  Displays Right or Wrong Answers in the answer column
         */
    }

    /**
     * Calculates total correct in quiz
     *
     * @param pickedWashington is whether or not the user picked washington as an answer
     * @param pickedLincoln    is whether or not the user picked Lincoln as an answer
     * @param pickedJanuary    is whether or not the user picked washington as an answer
     * @param pickedHancock    is whether or not the user picked washington as an answer
     * @param pickedAdams      is whether or not the user picked washington as an answer
     * @param pickedObama      is whether or not the user picked  Lincoln as an answer
     * @param pickedThirteen   or not the user picked washington as an answer
     * @return baseScore;
     */
    private int calculateCheckboxTotal(boolean pickedWashington, boolean pickedLincoln, boolean pickedFranklin,
                                       boolean pickedHamilton, boolean pickedsixtyFive, boolean pickedJanuary, boolean pickedHancock, boolean pickedJackson,
                                       boolean pickedAdams, boolean pickedMadison, boolean pickedObama, boolean pickedThirteen) {


        int checkboxScore = 0;

        if (pickedWashington) {
            checkboxScore = checkboxScore + 1;

            if (pickedLincoln)
                checkboxScore = checkboxScore + 1;

            if (pickedFranklin)
                checkboxScore = checkboxScore - 1;

            if (pickedHamilton)
                checkboxScore = checkboxScore - 1;
        }
        if (pickedsixtyFive) {
            checkboxScore = checkboxScore + 1;
        }
        if (pickedJanuary) {
            checkboxScore = checkboxScore + 1;
        }
        if (pickedHancock) {
            checkboxScore = checkboxScore + 1;

            if (pickedJackson)
                checkboxScore = checkboxScore - 1;

            if (pickedAdams)
                checkboxScore = checkboxScore + 1;

            if (pickedMadison)
                checkboxScore = checkboxScore - 1;
        }
        if (pickedObama) {
            checkboxScore = checkboxScore + 1;
        }
        if (pickedThirteen) {
            checkboxScore = checkboxScore + 1;
        }

        /**
         * Returns the checkboxScore to be later used in results score.
         */
        return checkboxScore;

    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayMessage(String message) {
        TextView resultsTextView = (TextView) findViewById(R.id.results_text_view);
        resultsTextView.setText(message);
    }

    /**
     * This method displays Wrong answers
     */
    public void displaySubmit() {

        wrongOne.setText(R.string.Wrong);

        wrongTwo.setText(R.string.Wrong);

        wrongThree.setText(R.string.Wrong);

        wrongFour.setText(R.string.Wrong);

        wrongFive.setText(R.string.Wrong);

        wrongSix.setText(R.string.Wrong);

        wrongSeven.setText(R.string.Wrong);

        wrongEight.setText(R.string.Wrong);

        wrongNine.setText(R.string.Wrong);

        wrongTen.setText(R.string.Wrong);

        wrongEleven.setText(R.string.Wrong);

        wrongTwelve.setText(R.string.Wrong);

        wrongThirteen.setText(R.string.Wrong);

        wrongFourteen.setText(R.string.Wrong);

        wrongFifteen.setText(R.string.Wrong);

        wrongSixteen.setText(R.string.Wrong);


        /**
         * This method displays Correct answers
         */


        correctOne.setText(R.string.Correct);

        correctTwo.setText(R.string.Correct);

        correctThree.setText(R.string.Correct);

        correctFour.setText(R.string.Correct);

        correctFive.setText(R.string.Correct);

        correctSix.setText(R.string.Correct);

        correctSeven.setText(R.string.Correct);

        correctEight.setText(R.string.Correct);
    }
}


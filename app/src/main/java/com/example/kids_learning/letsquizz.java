package com.example.kids_learning;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class letsquizz extends AppCompatActivity {

    private TextView optionA,optionB,optionC,optionD;
    private TextView questionnumber,question,score;
    private TextView checkout1,checkout2;
    int currentIndex;
    int mscore=0;
    int qn=1;
    ProgressBar progressBar;

    int CurrentQuestion,CurrentOptionA,CurrentOptionB,CurrentOptionC,CurrentOptionD;


    private answerclass[] questionBank= new answerclass[]
            {
                    new answerclass(R.string.question1,R.string.question1_A,R.string.question1_B,R.string.question1_C,R.string.question1_D,R.string.answer_1),
                    new answerclass(R.string.question2,R.string.question2_A,R.string.question2_B,R.string.question2_C,R.string.question2_D,R.string.answer_2),
                    new answerclass(R.string.question3,R.string.question3_A,R.string.question3_B,R.string.question3_C,R.string.question3_D,R.string.answer_3),
                    new answerclass(R.string.question4,R.string.question4_A,R.string.question4_B,R.string.question4_C,R.string.question4_D,R.string.answer_4),
                    new answerclass(R.string.question5,R.string.question5_A,R.string.question5_B,R.string.question5_C,R.string.question5_D,R.string.answer_5),
                    new answerclass(R.string.question6,R.string.question6_A,R.string.question6_B,R.string.question6_C,R.string.question6_D,R.string.answer_6),
                    new answerclass(R.string.question7,R.string.question7_A,R.string.question7_B,R.string.question7_C,R.string.question7_D,R.string.answer_7),
                    new answerclass(R.string.question8,R.string.question8_A,R.string.question8_B,R.string.question8_C,R.string.question8_D,R.string.answer_8),
                    new answerclass(R.string.question9,R.string.question9_A,R.string.question9_B,R.string.question9_C,R.string.question9_D,R.string.answer_9),
                    new answerclass(R.string.question10,R.string.question10_A,R.string.question10_B,R.string.question10_C,R.string.question10_D,R.string.answer_10),
                    new answerclass(R.string.question11,R.string.question11_A,R.string.question11_B,R.string.question11_C,R.string.question11_D,R.string.answer_11),
                    new answerclass(R.string.question12,R.string.question12_A,R.string.question12_B,R.string.question12_C,R.string.question12_D,R.string.answer_12),
                    new answerclass(R.string.question13,R.string.question13_A,R.string.question13_B,R.string.question13_C,R.string.question13_D,R.string.answer_13),
                    new answerclass(R.string.question14,R.string.question14_A,R.string.question14_B,R.string.question14_C,R.string.question14_D,R.string.answer_14),
                    new answerclass(R.string.question15,R.string.question15_A,R.string.question15_B,R.string.question15_C,R.string.question15_D,R.string.answer_15),
                    new answerclass(R.string.question16,R.string.question16_A,R.string.question16_B,R.string.question16_C,R.string.question16_D,R.string.answer_16),
                    new answerclass(R.string.question17,R.string.question17_A,R.string.question17_B,R.string.question17_C,R.string.question17_D,R.string.answer_17),
                    new answerclass(R.string.question18,R.string.question18_A,R.string.question18_B,R.string.question18_C,R.string.question18_D,R.string.answer_18),
                    new answerclass(R.string.question19,R.string.question19_A,R.string.question19_B,R.string.question19_C,R.string.question19_D,R.string.answer_19),
                    new answerclass(R.string.question20,R.string.question20_A,R.string.question20_B,R.string.question20_C,R.string.question20_D,R.string.answer_20),
                    new answerclass(R.string.question21,R.string.question21_A,R.string.question21_B,R.string.question21_C,R.string.question21_D,R.string.answer_21),
                    new answerclass(R.string.question22,R.string.question22_A,R.string.question22_B,R.string.question22_C,R.string.question22_D,R.string.answer_22),
                    new answerclass(R.string.question23,R.string.question23_A,R.string.question23_B,R.string.question23_C,R.string.question23_D,R.string.answer_23),
                    new answerclass(R.string.question24,R.string.question24_A,R.string.question24_B,R.string.question24_C,R.string.question24_D,R.string.answer_24),
                    new answerclass(R.string.question25,R.string.question25_A,R.string.question25_B,R.string.question25_C,R.string.question25_D,R.string.answer_25),
                    new answerclass(R.string.question26,R.string.question26_A,R.string.question26_B,R.string.question26_C,R.string.question26_D,R.string.answer_26),
                    new answerclass(R.string.question27,R.string.question27_A,R.string.question27_B,R.string.question27_C,R.string.question27_D,R.string.answer_27),
                    new answerclass(R.string.question28,R.string.question28_A,R.string.question28_B,R.string.question28_C,R.string.question28_D,R.string.answer_28),
                    new answerclass(R.string.question29,R.string.question29_A,R.string.question29_B,R.string.question29_C,R.string.question29_D,R.string.answer_29),
                    new answerclass(R.string.question30,R.string.question30_A,R.string.question30_B,R.string.question30_C,R.string.question30_D,R.string.answer_30),
                    new answerclass(R.string.question31,R.string.question31_A,R.string.question31_B,R.string.question31_C,R.string.question31_D,R.string.answer_31),
                    new answerclass(R.string.question32,R.string.question32_A,R.string.question32_B,R.string.question32_C,R.string.question32_D,R.string.answer_32),
                    new answerclass(R.string.question33,R.string.question33_A,R.string.question33_B,R.string.question33_C,R.string.question33_D,R.string.answer_33),
                    new answerclass(R.string.question34,R.string.question34_A,R.string.question34_B,R.string.question34_C,R.string.question34_D,R.string.answer_34),
                    new answerclass(R.string.question35,R.string.question35_A,R.string.question35_B,R.string.question35_C,R.string.question35_D,R.string.answer_35),
                    new answerclass(R.string.question36,R.string.question36_A,R.string.question36_B,R.string.question36_C,R.string.question36_D,R.string.answer_36),
                    new answerclass(R.string.question37,R.string.question37_A,R.string.question37_B,R.string.question37_C,R.string.question37_D,R.string.answer_37),
                    new answerclass(R.string.question38,R.string.question38_A,R.string.question38_B,R.string.question38_C,R.string.question38_D,R.string.answer_38),
                    new answerclass(R.string.question39,R.string.question39_A,R.string.question39_B,R.string.question39_C,R.string.question39_D,R.string.answer_39),
                    new answerclass(R.string.question40,R.string.question40_A,R.string.question40_B,R.string.question40_C,R.string.question40_D,R.string.answer_40),
                    new answerclass(R.string.question41,R.string.question41_A,R.string.question41_B,R.string.question41_C,R.string.question41_D,R.string.answer_41),
                    new answerclass(R.string.question42,R.string.question42_A,R.string.question42_B,R.string.question42_C,R.string.question42_D,R.string.answer_42),
                    new answerclass(R.string.question43,R.string.question43_A,R.string.question43_B,R.string.question43_C,R.string.question43_D,R.string.answer_43),
                    new answerclass(R.string.question44,R.string.question44_A,R.string.question44_B,R.string.question44_C,R.string.question44_D,R.string.answer_44),
                    new answerclass(R.string.question45,R.string.question45_A,R.string.question45_B,R.string.question45_C,R.string.question45_D,R.string.answer_45),
                    new answerclass(R.string.question46,R.string.question46_A,R.string.question46_B,R.string.question46_C,R.string.question46_D,R.string.answer_46),
                    new answerclass(R.string.question47,R.string.question47_A,R.string.question47_B,R.string.question47_C,R.string.question47_D,R.string.answer_47),
                    new answerclass(R.string.question48,R.string.question48_A,R.string.question48_B,R.string.question48_C,R.string.question48_D,R.string.answer_48),
                    new answerclass(R.string.question49,R.string.question49_A,R.string.question49_B,R.string.question49_C,R.string.question49_D,R.string.answer_49),
                    new answerclass(R.string.question50,R.string.question50_A,R.string.question50_B,R.string.question50_C,R.string.question50_D,R.string.answer_50),




            };

    final int PROGRESS_BAR = (int) Math.ceil(100/questionBank.length);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letsquizz);
        optionA=findViewById(R.id.optionA);
        optionB=findViewById(R.id.optionB);
        optionC=findViewById(R.id.optionC);
        optionD=findViewById(R.id.optionD);

        question = findViewById(R.id.question);
        score= findViewById(R.id.score);
        questionnumber=findViewById(R.id.QuestionNumber);

        checkout1=findViewById(R.id.selectoption);
        checkout2=findViewById(R.id.CorrectAnswer);
        progressBar=findViewById(R.id.progress_bar);


        CurrentQuestion=questionBank[currentIndex].getQuestionid();
        question.setText(CurrentQuestion);
        CurrentOptionA=questionBank[currentIndex].getOptionA();
        optionA.setText(CurrentOptionA);
        CurrentOptionB=questionBank[currentIndex].getOptionB();
        optionB.setText(CurrentOptionB);
        CurrentOptionC=questionBank[currentIndex].getOptionC();
        optionC.setText(CurrentOptionC);
        CurrentOptionD=questionBank[currentIndex].getOptionD();
        optionD.setText(CurrentOptionD);



        optionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(CurrentOptionA);
                updateQuestion();

            }
        });
        optionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(CurrentOptionB);
                updateQuestion();

            }
        });
        optionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(CurrentOptionC);
                updateQuestion();

            }
        });
        optionD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(CurrentOptionD);
                updateQuestion();

            }
        });







    }

    private void checkAnswer(int userSelection) {

       int correctanswer=questionBank[currentIndex].getAnswerid();

       checkout1.setText(userSelection);
       checkout2.setText(correctanswer);

       String m= checkout1.getText().toString().trim();
       String n=checkout2.getText().toString().trim();

       if (m.equals(n))
       {
           Toast.makeText(getApplicationContext(),"Correct",Toast.LENGTH_SHORT).show();
           mscore=mscore+1;
       }
       else
       {
           Toast.makeText(getApplicationContext(),"Wrong",Toast.LENGTH_SHORT).show();
       }



    }

    private void updateQuestion() {

        currentIndex=(currentIndex+1)%questionBank.length;

        if (currentIndex==0)
        {
            AlertDialog.Builder alert=new AlertDialog.Builder(this);
            alert.setTitle("Game Over");
            alert.setCancelable(false);
            alert.setMessage("Your Score:" + mscore + "Points");
            alert.setPositiveButton("Back to title", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();

                }
            });

            alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    mscore=0;
                    qn=1;
                    progressBar.setProgress(0);
                    score.setText("Score" + mscore + "/" +questionBank.length);
                    questionnumber.setText(qn + "/"+ questionBank.length + "Question");

                }
            });

            alert.show();
        }



        CurrentQuestion=questionBank[currentIndex].getQuestionid();
        question.setText(CurrentQuestion);
        CurrentOptionA=questionBank[currentIndex].getOptionA();
        optionA.setText(CurrentOptionA);
        CurrentOptionB=questionBank[currentIndex].getOptionB();
        optionB.setText(CurrentOptionB);
        CurrentOptionC=questionBank[currentIndex].getOptionC();
        optionC.setText(CurrentOptionC);
        CurrentOptionD=questionBank[currentIndex].getOptionD();
        optionD.setText(CurrentOptionD);



        qn=qn+1;

        if (qn<=questionBank.length)

        {
            questionnumber.setText(qn + "/"+ questionBank.length + "Question");
        }
        score.setText("Score" + mscore + "/" +questionBank.length);
        progressBar.incrementProgressBy(PROGRESS_BAR);

        
    }
}
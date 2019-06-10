package com.example.asus.beable_16;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

/**
 * Created by ASUS on 18/09/16.
 */


public class Sls extends Fragment {

    TextToSpeech t1;
    EditText ed1;
    Button b1,b2,b3,b4,b5,b6,b7,b8;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        View view = inflater.inflate(R.layout.sls, container, false);
        ed1=(EditText)view.findViewById(R.id.editText);
        b1=(Button)view.findViewById(R.id.button);

        t1 = new TextToSpeech(getContext().getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.UK);
                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = ed1.getText().toString();
                Toast.makeText(getContext().getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        b2 = (Button)view.findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String toSpeak1 = "Hi";
                Toast.makeText(getContext().getApplicationContext(), toSpeak1,Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak1, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        b3 = (Button)view.findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String toSpeak2 = "How are you ?";
                Toast.makeText(getContext().getApplicationContext(), toSpeak2,Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak2, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        b4 = (Button)view.findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String toSpeak3 = "Nice to meet you !!";
                Toast.makeText(getContext().getApplicationContext(), toSpeak3,Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak3, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        b5 = (Button)view.findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String toSpeak4 = "Excuse me";
                Toast.makeText(getContext().getApplicationContext(), toSpeak4,Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak4, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        b6 = (Button)view.findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String toSpeak5 = "I am doing very well!";
                Toast.makeText(getContext().getApplicationContext(), toSpeak5,Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak5, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        b7 = (Button)view.findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String toSpeak6 = "Can I have a glass of water?";
                Toast.makeText(getContext().getApplicationContext(), toSpeak6,Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak6, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        b7 = (Button)view.findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String toSpeak6 = "Can I have a glass of water?";
                Toast.makeText(getContext().getApplicationContext(), toSpeak6,Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak6, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        b8 = (Button)view.findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String toSpeak7 = "Thank you!";
                Toast.makeText(getContext().getApplicationContext(), toSpeak7,Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak7, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        return view;
    }

    public void onPause(){
        if(t1 !=null){
            t1.stop();
            t1.shutdown();
        }
        super.onPause();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Sls");
    }
}
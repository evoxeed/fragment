package ru.samsung.itschool.fragmenttest;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InputFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InputFragment extends Fragment implements View.OnClickListener {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_input, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button button1 = (Button) getView().findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) getView().findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) getView().findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) getView().findViewById(R.id.button4);
        button4.setOnClickListener(this);

        Button button5 = (Button) getView().findViewById(R.id.button5);
        button5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        EditText name = (EditText) getView().findViewById(R.id.name);
        String nameValue = name.getText().toString();
//        MessageFragment fragment = (MessageFragment) getFragmentManager().findFragmentById(R.id.fragment_detail);
//        String message = nameValue;

        String buttonNum = "";
        switch (v.getId()) {
            case R.id.button1:
                buttonNum = "1";
                break;
            case R.id.button2:
                MessageFragment fragment = (MessageFragment) getFragmentManager().findFragmentById(R.id.fragment_detail);
                String message = nameValue;

                Intent intent = new Intent(getActivity().getApplicationContext(), MessageActivity.class);
                intent.putExtra("value", message);

//                fragment.setMessage(message);
                startActivity(intent);
                break;
            case R.id.button3:
                buttonNum = "3";
                break;
            case R.id.button4:
                buttonNum = "4";
                break;
            case R.id.button5:
                buttonNum = "5";
                break;

        }

//        if (fragment != null && fragment.isInLayout()) {
//            fragment.setMessage(message);
//        } else {
//            Intent intent = new Intent(getActivity().getApplicationContext(), MessageActivity.class);
//            intent.putExtra("value", message);
//            startActivity(intent);
//        }
    }
}
package com.example.locationtutorial.data;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sinzorebenjamin.locationrealtimetracker.R;

public class HandleLiveData extends AppCompatActivity {

    private NameViewModel model;

    private TextView nameTextView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handle_live_data);


        button = findViewById(R.id.btnLiveData);
        nameTextView = findViewById(R.id.txtName);


        // Get the ViewModel.
        model = new ViewModelProvider(this).get(NameViewModel.class);

        // Create the observer which updates the UI.
        final Observer<String> nameObserver = new Observer<String>() {
            @Override
            public void onChanged(@Nullable final String newName) {
                // Update the UI, in this case, a TextView.
                nameTextView.setText(newName);
            }
        };

        // Observe the LiveData, passing in this activity as the LifecycleOwner and the observer.
        model.getCurrentName().observe(this, nameObserver);


        button.setOnClickListener(v -> {
            String anotherName = "John Doe";
            model.getCurrentName().setValue(anotherName);
        });

    }
}
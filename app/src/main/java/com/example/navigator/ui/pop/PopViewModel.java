package com.example.navigator.ui.pop;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PopViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public PopViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Welcome To The Famous Animes");
    }

    public LiveData<String> getText() {
        return mText;
    }
}

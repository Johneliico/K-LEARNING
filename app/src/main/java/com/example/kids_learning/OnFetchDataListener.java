package com.example.kids_learning;

import com.example.kids_learning.Models.APIResponse;

public interface OnFetchDataListener {
    void onFetchData(APIResponse  apiResponse, String message);
    void onError(String message);

}

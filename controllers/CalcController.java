package controllers;

import java.util.ArrayList;

import services.CalcService;
import view.UserResponse;

public class CalcController<T extends Number> {
    CalcService<T> calcService = new CalcService<>();
    
    public UserResponse multArrbyNum(ArrayList<T> arr, T num) {
        return calcService.mulArrByNum(arr, num);
    }

    public UserResponse multArrbyArr(ArrayList<T> arr1, ArrayList<T> arr2) {
        return calcService.mulArrByArr(arr1, arr2);
    }
}

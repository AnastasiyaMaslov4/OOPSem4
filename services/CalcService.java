package services;

import java.util.ArrayList;

import view.UserResponse;

public class CalcService<T extends Number> {


    public UserResponse mulArrByNum(ArrayList<T> arr, T num) {
        if (arr == null && num == null) return new UserResponse("Error. Both is Null");
        if (arr == null || num == null) return new UserResponse("Error. Some is Null");
        ArrayList<Double> newArr = new ArrayList<>();
        for (int index = 0; index < arr.size(); index++) {
            newArr.add(index, arr.get(index).doubleValue() * num.doubleValue());
        }
        return new UserResponse(newArr);
    }

    public UserResponse mulArrByArr(ArrayList<T> arr1, ArrayList<T> arr2) {
        if (arr1 == null && arr2 == null) return new UserResponse("Error. Both is Null");
        if (arr1 == null || arr2 == null) return new UserResponse("Error. Some is Null");
        if (arr1.size() == arr2.size()) {
            ArrayList<Double> newArr = new ArrayList<>();
            for (int index = 0; index < arr1.size(); index++) {
                newArr.add(index, arr1.get(index).doubleValue() * arr2.get(index).doubleValue());
            }
            return new UserResponse(newArr);
        }
        if (arr1.size() > arr2.size()) {
            ArrayList<Double> newArr = new ArrayList<>();
            for (int index = 0; index < arr1.size(); index++) {
                if (index < arr2.size()) newArr.add(index, arr1.get(index).doubleValue() * arr2.get(index).doubleValue());
                else newArr.add(index, arr1.get(index).doubleValue() * 1);
            }
            return new UserResponse(newArr);
        }
        if (arr1.size() < arr2.size()) {
            ArrayList<Double> newArr = new ArrayList<>();
            for (int index = 0; index < arr2.size(); index++) {
                if (index < arr1.size()) newArr.add(index, arr1.get(index).doubleValue() * arr2.get(index).doubleValue());
                else newArr.add(index, arr2.get(index).doubleValue() * 1);
            }
            return new UserResponse(newArr);
        }

        return new UserResponse("Unexpected error");
    }


}

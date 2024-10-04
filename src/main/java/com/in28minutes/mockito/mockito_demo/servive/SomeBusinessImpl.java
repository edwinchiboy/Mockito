package com.in28minutes.mockito.mockito_demo.servive;



public class SomeBusinessImpl {
    public SomeBusinessImpl(final DataService dataService) {
        super();
        this.dataService = dataService;
    }

    private DataService dataService;

    public int findTheGreatestFromAllData() {
        int[] data = dataService.retrieveAllData();
        int greatestValue = Integer.MIN_VALUE;

        for (int value : data) {
            if (value > greatestValue) {
                greatestValue = value;
            }
        }
        return greatestValue;
    }
}



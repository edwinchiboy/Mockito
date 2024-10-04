package com.in28minutes.mockito.mockito_demo.business;

import com.in28minutes.mockito.mockito_demo.servive.DataService;
import com.in28minutes.mockito.mockito_demo.servive.SomeBusinessImpl;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SomeBusinessImplTest {
    @Test
    public void findTheGreatestFromAllData_basicScenario(){
        DataServiceStub1 dataServiceStub = new DataServiceStub1();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
        final int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(25,result);

    }
    @Test
    public void findTheGreatestFromAllData_oneValue(){
        DataServiceStub1 dataServiceStub = new DataServiceStub1();
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
        final int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(48,result);

    }
}
//stub
class DataServiceStub1 implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{25, 15, 5};
    }
}

class DataServiceStub2 implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{48};
    }
}

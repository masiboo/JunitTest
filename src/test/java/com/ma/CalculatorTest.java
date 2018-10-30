package com.ma;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CalculatorTest {

    Calculator calculator = null;
    CalclualtorService service = Mockito.mock(CalclualtorService.class);

    @Before
    public void setup(){
        calculator = new Calculator(service);
    }

    @Test
    public void testAdd(){
        when(service.add(2,3)).thenReturn(5);
        assertEquals(5, calculator.add(2,3));
        verify(service).add(2,3);

    }

}

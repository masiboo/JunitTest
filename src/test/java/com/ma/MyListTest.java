package com.ma;

import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.Mockito.*;

public class MyListTest {

    @Test
    public void test(){
        List<String> mockedList = mock(MyList.class);
        mockedList.size();
        verify(mockedList).size();
    }

    @Test
    public void test2(){
        List<String> mockedList = mock(MyList.class);
        mockedList.size();
        verify(mockedList, times(1)).size();
    }

    @Test
    public void test3(){
        List<String> mockedList = mock(MyList.class);
        verifyZeroInteractions(mockedList);
    }

    @Test
    public void test4(){
        List<String> mockedList = mock(MyList.class);
        verify(mockedList, times(0)).size();
    }

    @Test
    public void test5(){
        List<String> mockedList = mock(MyList.class);
        mockedList.size();
        mockedList.clear();
        verify(mockedList).size();
        verifyNoMoreInteractions(mockedList);
    }

    @Test
    public void test6(){
        List<String> mockedList = mock(MyList.class);
        mockedList.size();
        mockedList.add("a parameter");
        mockedList.clear();

        InOrder inOrder = Mockito.inOrder(mockedList);
        inOrder.verify(mockedList).size();
        inOrder.verify(mockedList).add("a parameter");
        inOrder.verify(mockedList).clear();
    }


}

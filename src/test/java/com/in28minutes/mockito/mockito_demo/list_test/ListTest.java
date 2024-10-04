package com.in28minutes.mockito.mockito_demo.list_test;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {
    @Test
    public void test() {
        final List listMock = mock(List.class);
        when(listMock.size()).thenReturn(3);
        assertEquals(3, listMock.size());

    }

    @Test
    public void multipleReturns() {
        final List listMock = mock(List.class);
        when(listMock.size()).thenReturn(3).thenReturn(2);
        assertEquals(3, listMock.size());
        assertEquals(2, listMock.size());
    }

    @Test
    public void parameters() {
        final List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("Some string back");
        assertEquals("Some string back", listMock.get(0));
        assertNull(listMock.get(1));

    }
    @Test
    public void genericParameters() {
        final List listMock = mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenReturn("Some other string back");
        assertEquals("Some other string back", listMock.get(0));
        assertNull(listMock.get(1));

    }
}

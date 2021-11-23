package com.sidd.ds;

import java.util.ArrayList;
import java.util.List;

public class TBD {

    public static void main(String[] args)
    {
        int[] data = new int[5];
        System.out.println(data.length);
        for(int c = 0; c < 5; c++)
        {
            data[c] = c;
        }
        System.out.println(data);

        int[] oldData = data;
        data = new int[10];
        System.out.println(data);

        List l = new ArrayList();


    }
}

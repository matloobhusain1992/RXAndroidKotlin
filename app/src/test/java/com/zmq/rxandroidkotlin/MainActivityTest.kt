package com.zmq.rxandroidkotlin

import org.junit.Test
import com.zmq.rxandroidkotlin.MainActivity
import org.junit.After

import org.junit.Assert.*
import org.junit.Before

/**
 * Created by zmq181 on 15/6/19.
 */
class MainActivityTest {

    var main : MainActivity? = null



    @Test
    fun sum() {
        assertEquals(20,main!!.sum(10,10))



    }


}
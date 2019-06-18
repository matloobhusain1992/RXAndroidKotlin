package com.zmq.rxandroidkotlin

import org.junit.*

import org.junit.Assert.*
import org.junit.runner.JUnitCore
import org.junit.runner.RunWith
import org.junit.runners.Suite

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    companion object {
        @BeforeClass
        @JvmStatic
        fun m3(){
            println("@BeforeClass called")
        }

        @AfterClass
        @JvmStatic
        fun m4(){
            println("@AfterClass called")
        }
    }


    @Before
    fun m1(){
        println("@Before called")
    }

    @Test
    fun add(){
        println("@Test add called")
    }

    @Test
    fun divide(){
        println("@Test divide called")
    }

    @After
    fun m2(){
        println("@After called")
    }



}

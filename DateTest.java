import static org.junit.Assert.*;

/**
This is a JUnit Test class which tests out mock date values and sees if 
they are valid. 
@author Stephen Juan, David Halim
*/

public class DateTest 
{
    /**
    Tests the date 1-1-1979, invalid b/c it is before 2021 
    */
    @org.junit.Test
    public void dateTest1()
    {
        Date dateTest1 = new Date("1/1/1979"); // invalid <2021
        assertFalse(dateTest1.isValid());
    }
    
    /**
    Tests the date 1-23-2021, valid
    */
    @org.junit.Test
    public void dateTest2()
    {
        Date dateTest2 = new Date("1/23/2021"); // valid
        assertTrue(dateTest2.isValid());
    }
    
    /**
    Tests the date 8-90-2021, invalid b/c max days are 31 in August
    */
    @org.junit.Test
    public void dateTest3()
    {
        Date dateTest3 = new Date("8/90/2021"); // invalid day>31 
        assertFalse(dateTest3.isValid());
    }
    
    /**
    Tests the date 12-2-2022, invalid b/c it is in the future
    */
    @org.junit.Test
    public void dateTest4()
    {
        Date dateTest4 = new Date("12/2/2022"); // invalid future
        assertFalse(dateTest4.isValid());
    }
    
    /**
    Tests the date 2-29-2021, invalid b/c it is not a leap year
    */
    @org.junit.Test
    public void dateTest5()
    {
        Date dateTest5 = new Date("2/29/2021"); // invalid not leap year
        assertFalse(dateTest5.isValid());
    }
    
    /**
    Tests the date 2-28-21, valid
    */
    @org.junit.Test
    public void dateTest6()
    {
        Date dateTest6 = new Date("2/28/2021"); // valid, not leap year
        assertTrue(dateTest6.isValid());
    }
    
    /**
    Tests the date 13-6-2021, invalid b/c there is no month 13
    */
    @org.junit.Test
    public void dateTest7()
    {
        Date dateTest7 = new Date("13/6/2021"); // invalid month > 12
        assertFalse(dateTest7.isValid());
    }
    
    /**
    Tests the date 0-2-2021, invalid b/c months can't be less than 1
    */
    @org.junit.Test
    public void dateTest8()
    {
        Date dateTest8 = new Date("0/2/2021"); // invalid month < 1
        assertFalse(dateTest8.isValid());
    }
    
    /**
    Tests the date 3-0-2021, invalid b/c days can't be less than 1
    */
    @org.junit.Test
    public void dateTest9()
    {
        Date dateTest9 = new Date("3/0/2021"); // invalid day < 1
        assertFalse(dateTest9.isValid());
    }
    
    /**
    Tests the current day, valid
    */
    @org.junit.Test
    public void dateTest10()
    {
        Date dateTest10 = new Date(); // valid current day
        assertTrue(dateTest10.isValid());
    }
}
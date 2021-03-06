package unitTesting;
import static org.junit.Assert.*;
import students.Profile;
import students.International;

/**
This method tests the tuitionDue class. It calls it and checks the total tuition
due to see if it matches up with the expected cost. 
@author Stephen Juan, David Halim
*/

public class InternationalTest 
{
	private int tuition = 29737;
    private int uniFee = 3268;
    private int addFee = 2650;
    private int creditHour = 966; 
    private int threshold = 16;
    
	/**
    Tests a student with 12 credits, cost is $35655
    @throws Exception if the International constructor throws an Exception.
    */
    @org.junit.Test
    public void internationalTest1() throws Exception
    {
        International student1 = new International(new Profile("Student Test1", "CS"), 12, false);
        student1.tuitionDue();
        assertTrue(student1.getTuitionDue() == (tuition + uniFee + addFee));
        // $35655
        
    }
    
    /**
    Tests a student with 12 credits, with study abroad, cost is $5918
    @throws Exception if the International constructor throws an Exception.
    */
    @org.junit.Test
    public void internationalTest2() throws Exception
    {
        International student2 = new International(new Profile("Student Test2", "CS"), 12, true);
        student2.tuitionDue();
        assertTrue(student2.getTuitionDue() == (uniFee + addFee));
        // $5918
    }
    
    /**
    Tests a student with 16 credits, cost is $35655
    @throws Exception if the International constructor throws an Exception.
    */
    @org.junit.Test
    public void internationalTest3() throws Exception
    {
        International student3 = new International(new Profile("Student Test3", "CS"), 16, false);
        student3.tuitionDue();
        assertTrue(student3.getTuitionDue() == (tuition + uniFee + addFee));
        // $35655
    }
    
    /**
    Tests a student with 20 credits, which requires extra money credit hours, cost is $39519
    @throws Exception if the International constructor throws an Exception.
    */
    @org.junit.Test
    public void internationalTest4() throws Exception
    {
        International student4 = new International(new Profile("Student Test4", "CS"), 20, false);
        student4.tuitionDue();
        assertTrue(student4.getTuitionDue() == (tuition
              + uniFee + addFee + (student4.getCreditHours() - threshold) * creditHour));
        // 39519
    }
    
    /**
    Tests a student with 16 credits, with study abroad which changes credits to 12, cost is $5918
    @throws Exception if the International constructor throws an Exception.
    */
    @org.junit.Test
    public void internationalTest5() throws Exception
    {
        International student5 = new International(new Profile("Student Test5", "CS"), 16, false);
        student5.setStudyAbroad();
        student5.tuitionDue();
        assertTrue(student5.getTuitionDue() == (uniFee + addFee));
        // $5918
    }
}
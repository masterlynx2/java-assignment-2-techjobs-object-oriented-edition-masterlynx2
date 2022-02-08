package org.launchcode.techjobs.oo.test;
//import java.awt.Graphics;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;
/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)



public class JobTest {

    //   @Before
//        Job a1= new Job("performer","launchcode","detroit","singer","vocals");

    Job a2;
    Job a3;
    Job tester;
    Job tester2;
    Job toStringjob;
    Job tester3;
    Job tester4;
    String result;
    String result2;
    String result3;
    Job tester5;
    Job tester8;
    @Before
    public void Job() {
        a2 = new Job();
        a3 = new Job();
        tester = new Job("", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        tester2 = new Job("", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }
    @Test
    public void testSettingJobId() {
            assertFalse(a2.getId() == a3.getId());
            assertTrue(a2.getId() - a3.getId()== -1);

    }
    @Test
    public void testJobsForEquality() {
        assertFalse(tester instanceof Job != tester2 instanceof Job);
    }
   @Test
   public void testToStringStartAndEndWithNewLine(){
            Job job = new Job(
                    "Web Developer",
                    new Employer("LaunchCode"),
                    new Location("StL"),
                    new PositionType("Back-end developer"),
                    new CoreCompetency("Java"));

            char firstChar = job.toString().charAt(0);
            char lastChar = job.toString().charAt(job.toString().length()-1);

            assertEquals(firstChar, '\n');
            assertEquals(lastChar, '\n');
    }
        @Test
    public void testToStringLabel() {

            Boolean labelId = tester.toString().contains("ID");
            Boolean labelName = tester.toString().contains("Name");
            Boolean labelEmployer = tester.toString().contains("Employer");
            Boolean labelLocation = tester.toString().contains("Location");
            Boolean labelPositionType = tester.toString().contains("PositionType");
            Boolean labelCoreCompetency = tester.toString().contains("CoreCompetency");

            assertTrue(labelId && labelName && labelEmployer && labelLocation && labelPositionType && labelCoreCompetency == true);
    }
            @Test
    public void testAvailable(){

            assertEquals( "\nID: " + tester.getId() + "\n"+
            "Name: Data not available\n"+
            "Employer: ACME\n"+
            "Location: Data not available\n"+
            "PositionType: Quality control\n"+
            "CoreCompetency: Persistence\n", tester.toString());
    }
        @Test
        public void ToStringValueDoesntExist(){
        tester8 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        System.out.println(tester.getLocation().getValue());
        assertEquals("OOPS! This job does not seem to exist.",tester8.toString());
        }

     }


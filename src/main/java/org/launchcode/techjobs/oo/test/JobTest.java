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
    @Before
    public void Job() {
        a2 = new Job();
        a3 = new Job();
        tester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        tester2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        tester3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        tester4 = new Job(" ", new Employer(""), new Location("Detroit"), new PositionType("Data not available"), new CoreCompetency("Data not available"));
        tester5 = new Job(" ", new Employer(""), new Location("Detroit"), new PositionType("Data not available"), new CoreCompetency("Data not available"));

        //public String toString() {
             result = " ID:  _______" + tester3.getId() + "\n" +
                    " Name:  _______" + tester3.getName() + "\n" +
                    " Employer:  _______" + tester3.getEmployer() + "\n" +
                    " Location:  _______" + tester3.getLocation() + "\n" +
                    " PositionType:  _______" + tester3.getPositionType() + "\n" +
                    " CoreCompetency:  _______" + tester3.getCoreCompetency() + "\n";


        result2 = " ID:  _______" + tester4.getId() + "\n" +
                " Name:  _______" + tester4.getName() + "\n" +
                " Employer:  _______" + tester4.getEmployer() + "\n" +
                " Location:  _______" + tester4.getLocation() + "\n" +
                " PositionType:  _______" + tester4.getPositionType() + "\n" +
                " CoreCompetency:  _______" + tester4.getCoreCompetency() + "\n";

        //}
        System.out.println(tester4.toString());
    }
    @Test
    public void testSettingJobId() {
        assertFalse(a2.getId() == a3.getId());
    }

//    @Test
//    public void UniqueIDTest1() {
//        assertEquals(1, a2.getId(), .001);
//
//
//    }
//
//    @Test
//    public void UniqueIDTest2() {
//        assertEquals(2, a2.getId(), .001);
//    }
//
//    @Test
//    public void UniqueIDTest3() {
//        assertEquals(3, a2.getId(), .001);
//
//    }

    @Test

    public void testJobConstructorSetsAllFields() {

        assertEquals(true, tester != null);

    }

    @Test

    public void testJobsForEquality(){
        assertFalse(tester instanceof Job!=tester2 instanceof Job);

    }
//    @Test
//     public void testJobToString(){
//        assertEquals(result,tester3.toString());
//
//    }
//        @Test
//        public void testingfornonAvaiable(){
//            assertEquals(result2,tester4.toString());
//        }
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
    public void testToStringLabel(){

            Boolean labelId = tester3.toString().contains("ID");
            Boolean labelName = tester3.toString().contains("Name");
            Boolean labelEmployer = tester3.toString().contains("Employer");
            Boolean labelLocation = tester3.toString().contains("Location");
            Boolean labelPositionType = tester3.toString().contains("PositionType");
            Boolean labelCoreCompetency = tester3.toString().contains("CoreCompetency");

            assertTrue( labelId && labelName && labelEmployer && labelLocation && labelPositionType && labelCoreCompetency == true);



        }

        @Test
    public void testAvailable(){
            Boolean labelId = tester3.toString().contains("ID");
            Boolean labelName = tester3.toString().contains("");
            Boolean labelEmployer = tester3.toString().contains("");
            Boolean labelLocation = tester3.toString().contains("Location");
            Boolean labelPositionType = tester3.toString().contains("PositionType");
            Boolean labelCoreCompetency = tester3.toString().contains("CoreCompetency");

            assertTrue( labelId && labelName && labelEmployer && labelLocation && labelPositionType && labelCoreCompetency == true);
    }
     }


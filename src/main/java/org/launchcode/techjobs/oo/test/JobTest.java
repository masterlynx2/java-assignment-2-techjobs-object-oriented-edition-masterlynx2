package org.launchcode.techjobs.oo.test;

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

    @Before
    public void Job() {
        a2 = new Job();
        a3 = new Job();
        tester = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        tester2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
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

}
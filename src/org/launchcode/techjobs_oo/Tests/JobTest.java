package org.launchcode.techjobs_oo.Tests;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {
    Job jobOne;
    Job jobTwo;
    @Before
    public void createJobObjects() {
        jobOne = new Job();
        jobTwo = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertNotEquals(jobOne.getId(), jobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job jobFull = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(jobFull.getName(), "Product tester");
        assertEquals(jobFull.getEmployer().getValue(), "ACME");
        assertEquals(jobFull.getLocation().getValue(), "Desert");
        assertEquals(jobFull.getPositionType().getValue(), "Quality control");
        assertEquals(jobFull.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality(){
        Job jobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobB = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //don't use assertNotEquals here because you actually want to test the custom equals() method.
        assertFalse(jobA.equals(jobB));
    }

    @Test
    public void testToStringReturnsBlankBeforeAndAfterJobInfo() {
        Job jobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(" ", jobA.toString().substring(0, 1));
        assertEquals(" ", jobA.toString().substring(jobA.toString().length() - 1));

    }

    @Test
    public void testReturnsLabelForEachField() {
        Job jobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(jobA.toString().contains("ID: "));
        assertTrue(jobA.toString().contains("Name: "));
        assertTrue(jobA.toString().contains("Employer: "));
        assertTrue(jobA.toString().contains("Location: "));
        assertTrue(jobA.toString().contains("Position Type: "));
        assertTrue(jobA.toString().contains("Core Competency: "));
    }

}

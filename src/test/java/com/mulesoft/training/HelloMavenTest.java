package com.mulesoft.training;

import org.junit.Rule;
import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;
import org.mule.tck.junit4.rule.DynamicPort;

public class HelloMavenTest extends FunctionalTestCase {
	
	@Rule
	public DynamicPort dynamicPort = new DynamicPort("http.port");

    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
    	System.out.println("\nDynamic Port used in Junit Test case: " + dynamicPort.getNumber() + "\n");
        runFlowAndExpect("mavenFlow", "Hello Maven");
    }
    
//    @Override
//    protected String getConfigFile() {
//        return "mavensetup.xml";
//    }
    
    @Override
    protected String[] getConfigFiles(){
    	return new String[]{"mavensetup.xml", "global.xml"};
    }
}
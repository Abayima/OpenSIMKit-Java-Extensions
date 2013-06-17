/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opensimkit.extensions;

import java.util.ArrayList;
import net.xeoh.plugins.base.annotations.PluginImplementation;

/**
 *
 * @author ahmedmaawy
 */
@PluginImplementation
public class DummyExtension implements ExtensionInterface {
    
    private ArrayList<ExtensionParameter> extensionParameters;
    
    public DummyExtension()
    {
        extensionParameters = new ArrayList<ExtensionParameter>();
        getParameters();
    }

    @Override
    public boolean preSave(ArrayList<String> messages) {
        System.out.println("Pre-Save run");
        
        return true;
    }

    @Override
    public boolean postSave(ArrayList<String> messages) {
        System.out.println("Post-Save run");
        
        return true;
    }

    @Override
    public String getExtensionName() {
        return "Dummy OSK Extension";
    }

    @Override
    public ArrayList<ExtensionParameter> getParameters() {
        if(extensionParameters.size() < 1)
        {
            extensionParameters = new ArrayList<ExtensionParameter>();
        
            ExtensionParameter param1 = new ExtensionParameter();
            param1.setParameterName("Param 1");
            param1.setParameterValue("Param 1 Value");

            ExtensionParameter param2 = new ExtensionParameter();
            param2.setParameterName("Param 2");
            param2.setParameterValue("Param 2 Value");

            extensionParameters.add(param1);
            extensionParameters.add(param2);
        }
        
        return extensionParameters;
    }

    @Override
    public boolean setParameters(ArrayList<ExtensionParameter> parameters) {
        extensionParameters = parameters;
        
        return true;
    }
    
}

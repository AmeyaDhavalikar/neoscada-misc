package com.ibh.systems.neoscada.generator.lib;

import java.util.Map;
import java.util.TreeMap;

public class OpcXmlDaConnectionFactoryElement extends AbstractFactoryElement
{

    private final String url;

    private final String portName = "Service";

    private final String serviceName = "Service";

    private int samplingRate = 3000;

    private int timeOut = 30000;

    private int waitTime = 30000;

    private final String wsdlUrl = "file:///var/lib/eclipsescada/opcxmlda/opcxmlda.wsdl";

    private final boolean polling;

    private final Map<String, String> typeMappings;

    @Override
    public Factory getFactory ()
    {
        return Factories.DEFAULT_OPCXMLDA_CONNECTION_FACTORY;
    }

    public OpcXmlDaConnectionFactoryElement ( final String id, final String url, final boolean polling )
    {
        super ( id );
        this.url = url;
        this.polling = polling;
        this.typeMappings = new TreeMap<> ();
    }

    public OpcXmlDaConnectionFactoryElement ( final String id, final String url, final int samplingRate, final int timeOut, final int waitTime, final boolean polling, final Map<String, String> typeMappings )
    {
        super ( id );
        this.url = url;
        this.samplingRate = samplingRate;
        this.timeOut = timeOut;
        this.waitTime = waitTime;
        this.polling = polling;
        this.typeMappings = new TreeMap<> ( typeMappings );
    }

    public String getUrl ()
    {
        return this.url;
    }

    public String getPortName ()
    {
        return this.portName;
    }

    public String getServiceName ()
    {
        return this.serviceName;
    }

    public int getSamplingRate ()
    {
        return this.samplingRate;
    }

    public int getTimeOut ()
    {
        return this.timeOut;
    }

    public int getWaitTime ()
    {
        return this.waitTime;
    }

    public String getWsdlUrl ()
    {
        return this.wsdlUrl;
    }

    public boolean isPolling ()
    {
        return this.polling;
    }

    public Map<String, String> getTypeMappings ()
    {
        return this.typeMappings;
    }
}

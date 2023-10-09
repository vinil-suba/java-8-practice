package java8.iQs.streams;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TestClass {
    private String FirstName;
    private String lastName;

    public String fullName() {
        return this.FirstName +" "+this.lastName;
    }
}

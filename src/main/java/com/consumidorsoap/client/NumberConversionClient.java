package com.consumidorsoap.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import com.consumidorsoap.bindings.NumberToDollars;
import com.consumidorsoap.bindings.NumberToDollarsResponse;

@Service
public class NumberConversionClient {

    private final WebServiceTemplate webServiceTemplate;

    @Autowired
    public NumberConversionClient(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
        this.webServiceTemplate.setDefaultUri("https://www.dataaccess.com/webservicesserver/NumberConversion.wso");
    }

    public String convertToDollar(double number) {
        NumberToDollars request = new NumberToDollars();
        request.setDNum(number);
        
        NumberToDollarsResponse response = (NumberToDollarsResponse) webServiceTemplate.marshalSendAndReceive(request);
        
        return response.getNumberToDollarsResult();
    }
}
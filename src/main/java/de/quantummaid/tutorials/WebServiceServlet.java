package de.quantummaid.tutorials;


import de.quantummaid.httpmaid.HttpMaid;
import de.quantummaid.httpmaid.jsr356.Jsr356ApplicationConfig;
import de.quantummaid.httpmaid.servlet.ServletEndpoint;

import javax.servlet.annotation.WebServlet;

@WebServlet("/*")
public class WebServiceServlet extends ServletEndpoint implements Jsr356ApplicationConfig {
    private static final long serialVersionUID = 1L;
    private static final HttpMaid HTTP_MAID = WebService.createQuantumMaid().httpMaid();

    public WebServiceServlet() {
        super(HTTP_MAID);
    }
}

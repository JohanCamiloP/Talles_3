/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioWeb;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author jOhAn CaMiLo
 */
@WebService(serviceName = "ServicioWebWS")
public class ServicioWebWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "Services")
    public String Services(@WebParam(name = "txt_1") String txt_1, @WebParam(name = "txt_2") String txt_2) {
        return "Web Services Realizado " + txt_1 + txt_2+ " !!!";
    }
}

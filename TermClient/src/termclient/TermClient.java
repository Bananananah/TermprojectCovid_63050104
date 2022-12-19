/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package termclient;

import services.TodayCase;

/**
 *
 * @author nickk
 */
public class TermClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String c = ByID(1);
        System.out.println(c);
    }
    
    private static String ByID(int id){
        TodayCase covid = findById(id);
        return  covid.toString();
    }

    private static TodayCase findById(int id) {
        services.TermWebService_Service service = new services.TermWebService_Service();
        services.TermWebService port = service.getTermWebServicePort();
        return port.findById(id);
    }
    
}
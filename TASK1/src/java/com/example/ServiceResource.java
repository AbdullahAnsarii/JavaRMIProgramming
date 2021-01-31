/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("service")
public class ServiceResource {
    String returnMsg;
    @GET
    public String Calculate() {
        returnMsg = "Calculator Web Service ";
            return returnMsg;
    }
    @GET
    @Path("/{param}")
    public String getMsg(@PathParam("param") String msg) {
        returnMsg = "Jersey say : Hello " + msg;
        return returnMsg;
 }
@GET
@Path("/add/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
public String addPlainText(@PathParam("a") int a, @PathParam("b")
int b) {
    returnMsg = "Addition of " +a+ " and " +b+ " is : " + (a + b);
    return returnMsg;
 }
 @GET
@Path("/sub/{a}/{b}")
@Produces(MediaType.TEXT_PLAIN)
public String subPlainText(@PathParam("a") int a, @PathParam("b")
int b) {
 returnMsg = "Subtraction of " +a+ " and " +b+ " is : " + (a - b);
 return returnMsg;
 }
 @GET
@Path("/mul/{a}/{b}")
@Produces(MediaType.TEXT_PLAIN)
public String mulPlainText(@PathParam("a") int a, @PathParam("b")
int b) {
returnMsg = "Multiplication of " +a+ " and " +b+ " is : " + (a * b);
return returnMsg;
}
@GET
@Path("/div/{a}/{b}")
@Produces(MediaType.TEXT_PLAIN)
public String divPlainText(@PathParam("a") int a, @PathParam("b")
int b) {
if(b == 0){
returnMsg="Division by 0 is not permitted";
return returnMsg;
 }
returnMsg= "Division of " +a+ " and " +b+ " is : " + (a / b) + " and the Remainder is : " + (a%b);
return returnMsg;
}
 @GET
@Path("/sqr/{a}")
@Produces(MediaType.TEXT_PLAIN)
public String sqrPlainText(@PathParam("a") int a) {
returnMsg = "Square of "+a+ " is : " + (a*a) + "";
return returnMsg;
 }
 @GET
@Path("/cube/{a}")
@Produces(MediaType.TEXT_PLAIN)
public String cubePlainText(@PathParam("a") int a) {
returnMsg = "Cube of " + a + " is : " + (a*a*a) + "";
return returnMsg;
 }
}

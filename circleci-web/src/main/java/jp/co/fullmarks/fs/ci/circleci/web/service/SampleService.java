/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.fullmarks.fs.ci.circleci.web.service;

import java.util.Calendar;
import java.util.Date;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import jp.co.fullmarks.fs.ci.circleci.web.bean.User;

/**
 *
 * @author sugiyama
 */
@Stateless
@Path("samples")
public class SampleService {

    @GET
    @Produces({"application/json"})
    public Response get() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2002, Calendar.JUNE, 7);
        final Date birthday = calendar.getTime();
        return Response.status(200).entity(new User("Ryo", birthday)).build();
    }
}
